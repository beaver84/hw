CREATE TABLE `VOC` (
                       `voc_seqno`	BIGINT UNSIGNED PRIMARY KEY NOT NULL,
                       `attributable_person`	VARCHAR(20)	NULL,
                       `attributable_content`	VARCHAR(200)	NULL,
                       `objection_yn`	TinyInt(1)	NULL
);

CREATE TABLE `panalty` (
                           `panalty_seqno`	BIGINT UNSIGNED PRIMARY KEY NOT NULL,
                           `voc_seqno`	BIGINT UNSIGNED	NOT NULL,
                           `confirm_yn`	TinyInt(1)	NULL,
                           `panalty_content`	VARCHAR(200)	NOT NULL	COMMENT '1:열림, 2:닫힘'
);

CREATE TABLE `compensation` (
                                `compensation_seqno`	BIGINT UNSIGNED PRIMARY KEY  NOT NULL,
                                `voc_seqno`	BIGINT UNSIGNED	NOT NULL,
                                `compensation_content`	int	NOT NULL	COMMENT '1:열림, 2:닫힘'
);

ALTER TABLE `VOC` ADD CONSTRAINT `PK_VOC` PRIMARY KEY (
                                                       `voc_seqno`
    );

ALTER TABLE `panalty` ADD CONSTRAINT `PK_PANALTY` PRIMARY KEY (
                                                               `panalty_seqno`,
                                                               `voc_seqno`
    );

ALTER TABLE `compensation` ADD CONSTRAINT `PK_COMPENSATION` PRIMARY KEY (
                                                                         `compensation_seqno`,
                                                                         `voc_seqno`
    );

ALTER TABLE `panalty` ADD CONSTRAINT `FK_VOC_TO_panalty_1` FOREIGN KEY (
                                                                        `voc_seqno`
    )
    REFERENCES `VOC` (
                      `voc_seqno`
        );

ALTER TABLE `compensation` ADD CONSTRAINT `FK_VOC_TO_compensation_1` FOREIGN KEY (
                                                                                  `voc_seqno`
    )
    REFERENCES `VOC` (
                      `voc_seqno`
        );
