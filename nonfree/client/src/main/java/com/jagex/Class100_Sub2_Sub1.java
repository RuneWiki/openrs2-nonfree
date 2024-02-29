package com.jagex;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apa")
public class Class100_Sub2_Sub1 extends Class100_Sub2 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!apa", name = "this$0", descriptor = "Lclient!il;")
	final Class325 this$0;

	@OriginalMember(owner = "client!apa", name = "l", descriptor = "F")
	float aFloat165;

	@OriginalMember(owner = "client!apa", name = "y", descriptor = "F")
	float aFloat166;

	@OriginalMember(owner = "client!apa", name = "<init>", descriptor = "(Lclient!il;Ljava/awt/Image;IIF)V", line = 211)
	Class100_Sub2_Sub1(@OriginalArg(0) Class325 arg0, @OriginalArg(1) Image arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		super(arg0, arg1, arg2, arg3);
		this.this$0 = arg0;
		this.aFloat165 = arg4;
		this.aFloat166 = -this.aFloat165;
	}

	@OriginalMember(owner = "client!apa", name = "w", descriptor = "(Ljava/awt/Graphics;)V", line = 218)
	@Override
	void method18348(@OriginalArg(0) Graphics arg0) {
		this.aFloat166 += this.aFloat165;
		if (this.aFloat166 < 0.0F) {
			this.aFloat166 += 360.0F;
		}
		this.aFloat166 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat166);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.this$0.method27501(local33) + local33 / 2 + this.anInt2546 * 1573756589), (double) (this.this$0.method27504(local38) + local38 / 2 + this.anInt2545 * -1031843439));
		local41.translate(this.this$0.method27501(local33) + this.anInt2546 * 1573756589, this.this$0.method27504(local38) + this.anInt2545 * -1031843439);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.this$0.anAffineTransform1);
	}

	@OriginalMember(owner = "client!apa", name = "p", descriptor = "(Ljava/awt/Graphics;B)V", line = 218)
	@Override
	void method18349(@OriginalArg(0) Graphics arg0) {
		this.aFloat166 += this.aFloat165;
		if (this.aFloat166 < 0.0F) {
			this.aFloat166 += 360.0F;
		}
		this.aFloat166 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat166);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.this$0.method27501(local33) + local33 / 2 + this.anInt2546 * 1573756589), (double) (this.this$0.method27504(local38) + local38 / 2 + this.anInt2545 * -1031843439));
		local41.translate(this.this$0.method27501(local33) + this.anInt2546 * 1573756589, this.this$0.method27504(local38) + this.anInt2545 * -1031843439);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.this$0.anAffineTransform1);
	}

	@OriginalMember(owner = "client!apa", name = "c", descriptor = "(Ljava/awt/Graphics;)V", line = 218)
	@Override
	void method18352(@OriginalArg(0) Graphics arg0) {
		this.aFloat166 += this.aFloat165;
		if (this.aFloat166 < 0.0F) {
			this.aFloat166 += 360.0F;
		}
		this.aFloat166 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat166);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.this$0.method27501(local33) + local33 / 2 + this.anInt2546 * 1573756589), (double) (this.this$0.method27504(local38) + local38 / 2 + this.anInt2545 * -1031843439));
		local41.translate(this.this$0.method27501(local33) + this.anInt2546 * 1573756589, this.this$0.method27504(local38) + this.anInt2545 * -1031843439);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.this$0.anAffineTransform1);
	}

	@OriginalMember(owner = "client!apa", name = "v", descriptor = "(Ljava/awt/Graphics;)V", line = 218)
	@Override
	void method18351(@OriginalArg(0) Graphics arg0) {
		this.aFloat166 += this.aFloat165;
		if (this.aFloat166 < 0.0F) {
			this.aFloat166 += 360.0F;
		}
		this.aFloat166 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat166);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.this$0.method27501(local33) + local33 / 2 + this.anInt2546 * 1573756589), (double) (this.this$0.method27504(local38) + local38 / 2 + this.anInt2545 * -1031843439));
		local41.translate(this.this$0.method27501(local33) + this.anInt2546 * 1573756589, this.this$0.method27504(local38) + this.anInt2545 * -1031843439);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.this$0.anAffineTransform1);
	}

	@OriginalMember(owner = "client!apa", name = "y", descriptor = "(Ljava/awt/Graphics;)V", line = 218)
	@Override
	void method18353(@OriginalArg(0) Graphics arg0) {
		this.aFloat166 += this.aFloat165;
		if (this.aFloat166 < 0.0F) {
			this.aFloat166 += 360.0F;
		}
		this.aFloat166 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat166);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.this$0.method27501(local33) + local33 / 2 + this.anInt2546 * 1573756589), (double) (this.this$0.method27504(local38) + local38 / 2 + this.anInt2545 * -1031843439));
		local41.translate(this.this$0.method27501(local33) + this.anInt2546 * 1573756589, this.this$0.method27504(local38) + this.anInt2545 * -1031843439);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.this$0.anAffineTransform1);
	}

	@OriginalMember(owner = "client!apa", name = "l", descriptor = "(Ljava/awt/Graphics;)V", line = 218)
	@Override
	void method18350(@OriginalArg(0) Graphics arg0) {
		this.aFloat166 += this.aFloat165;
		if (this.aFloat166 < 0.0F) {
			this.aFloat166 += 360.0F;
		}
		this.aFloat166 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat166);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.this$0.method27501(local33) + local33 / 2 + this.anInt2546 * 1573756589), (double) (this.this$0.method27504(local38) + local38 / 2 + this.anInt2545 * -1031843439));
		local41.translate(this.this$0.method27501(local33) + this.anInt2546 * 1573756589, this.this$0.method27504(local38) + this.anInt2545 * -1031843439);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.this$0.anAffineTransform1);
	}
}
