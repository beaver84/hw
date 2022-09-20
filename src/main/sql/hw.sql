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
                           `panalty_content`	VARCHAR(200)	NOT NULL
);

CREATE TABLE `compensation` (
                                `compensation_seqno`	BIGINT UNSIGNED PRIMARY KEY  NOT NULL,
                                `voc_seqno`	BIGINT UNSIGNED	NOT NULL,
                                `compensation_content`	int	NOT NULL
);

