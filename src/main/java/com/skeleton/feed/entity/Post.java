package com.skeleton.feed.entity;

import com.skeleton.common.entity.BaseTimeEntity;
import com.skeleton.feed.enums.SnsType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Getter
@Table(name = "post")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long contentId;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private SnsType type;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @OneToMany(mappedBy = "post")
    private Set<PostHashtag> postHashtags;

    private int viewCount = 0;

    private int likeCount = 0;

    private int shareCount = 0;
}
