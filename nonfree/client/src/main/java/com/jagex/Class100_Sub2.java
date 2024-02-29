package com.jagex;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agu")
public class Class100_Sub2 extends Class100 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!agu", name = "this$0", descriptor = "Lclient!il;")
	final Class325 this$0;

	@OriginalMember(owner = "client!agu", name = "v", descriptor = "Ljava/awt/Image;")
	Image anImage2;

	@OriginalMember(owner = "client!agu", name = "<init>", descriptor = "(Lclient!il;Ljava/awt/Image;II)V", line = 195)
	Class100_Sub2(@OriginalArg(0) Class325 arg0, @OriginalArg(1) Image arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.this$0 = arg0;
		this.anImage2 = arg1;
	}

	@OriginalMember(owner = "client!agu", name = "w", descriptor = "(Ljava/awt/Graphics;)V", line = 201)
	@Override
	void method18348(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method27501(this.anImage2.getWidth(null)) + this.anInt2546 * 1573756589;
		@Pc(27) int local27 = this.this$0.method27504(this.anImage2.getHeight(null)) + this.anInt2545 * -1031843439;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}

	@OriginalMember(owner = "client!agu", name = "c", descriptor = "(Ljava/awt/Graphics;)V", line = 201)
	@Override
	void method18352(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method27501(this.anImage2.getWidth(null)) + this.anInt2546 * 1573756589;
		@Pc(27) int local27 = this.this$0.method27504(this.anImage2.getHeight(null)) + this.anInt2545 * -1031843439;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}

	@OriginalMember(owner = "client!agu", name = "v", descriptor = "(Ljava/awt/Graphics;)V", line = 201)
	@Override
	void method18351(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method27501(this.anImage2.getWidth(null)) + this.anInt2546 * 1573756589;
		@Pc(27) int local27 = this.this$0.method27504(this.anImage2.getHeight(null)) + this.anInt2545 * -1031843439;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}

	@OriginalMember(owner = "client!agu", name = "l", descriptor = "(Ljava/awt/Graphics;)V", line = 201)
	@Override
	void method18350(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method27501(this.anImage2.getWidth(null)) + this.anInt2546 * 1573756589;
		@Pc(27) int local27 = this.this$0.method27504(this.anImage2.getHeight(null)) + this.anInt2545 * -1031843439;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}

	@OriginalMember(owner = "client!agu", name = "y", descriptor = "(Ljava/awt/Graphics;)V", line = 201)
	@Override
	void method18353(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method27501(this.anImage2.getWidth(null)) + this.anInt2546 * 1573756589;
		@Pc(27) int local27 = this.this$0.method27504(this.anImage2.getHeight(null)) + this.anInt2545 * -1031843439;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}

	@OriginalMember(owner = "client!agu", name = "p", descriptor = "(Ljava/awt/Graphics;B)V", line = 201)
	@Override
	void method18349(@OriginalArg(0) Graphics arg0) {
		@Pc(13) int local13 = this.this$0.method27501(this.anImage2.getWidth(null)) + this.anInt2546 * 1573756589;
		@Pc(27) int local27 = this.this$0.method27504(this.anImage2.getHeight(null)) + this.anInt2545 * -1031843439;
		arg0.drawImage(this.anImage2, local13, local27, null);
	}

	@OriginalMember(owner = "client!agu", name = "cy", descriptor = "(Lclient!yf;I)V", line = 4984)
	static final void method18354(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class438.method28920(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!agu", name = "aet", descriptor = "(Lclient!yf;B)V", line = 10015)
	static final void method18355(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class18 local18 = (Class18) Class537.aClass35_Sub7_1.method18319(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.anInt101 * 1113844363 == 2 ? 1 : 0;
	}
}
