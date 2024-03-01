package com.jagex;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!add")
public class Class27_Sub2 extends Class27 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!add", name = "this$0", descriptor = "Lclient!hc;")
	final Class217 this$0;

	@OriginalMember(owner = "client!add", name = "g", descriptor = "Ljava/awt/Image;")
	Image anImage2;

	@OriginalMember(owner = "client!add", name = "<init>", descriptor = "(Lclient!hc;Ljava/awt/Image;II)V", line = 189)
	Class27_Sub2(@OriginalArg(0) Class217 arg0, @OriginalArg(1) Image arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.this$0 = arg0;
		this.anImage2 = arg1;
	}

	@OriginalMember(owner = "client!add", name = "l", descriptor = "(Ljava/awt/Graphics;)V", line = 195)
	@Override
	void method15269(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method24333(this.anImage2.getWidth(null)) + this.anInt2228 * 714162189;
		@Pc(27) int local27 = this.this$0.method24334(this.anImage2.getHeight(null)) + this.anInt2227 * 1181499303;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}

	@OriginalMember(owner = "client!add", name = "p", descriptor = "(Ljava/awt/Graphics;B)V", line = 195)
	@Override
	void method15267(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method24333(this.anImage2.getWidth(null)) + this.anInt2228 * 714162189;
		@Pc(27) int local27 = this.this$0.method24334(this.anImage2.getHeight(null)) + this.anInt2227 * 1181499303;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}

	@OriginalMember(owner = "client!add", name = "g", descriptor = "(Ljava/awt/Graphics;)V", line = 195)
	@Override
	void method15270(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method24333(this.anImage2.getWidth(null)) + this.anInt2228 * 714162189;
		@Pc(27) int local27 = this.this$0.method24334(this.anImage2.getHeight(null)) + this.anInt2227 * 1181499303;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}

	@OriginalMember(owner = "client!add", name = "a", descriptor = "(Ljava/awt/Graphics;)V", line = 195)
	@Override
	void method15268(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method24333(this.anImage2.getWidth(null)) + this.anInt2228 * 714162189;
		@Pc(27) int local27 = this.this$0.method24334(this.anImage2.getHeight(null)) + this.anInt2227 * 1181499303;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}
}
