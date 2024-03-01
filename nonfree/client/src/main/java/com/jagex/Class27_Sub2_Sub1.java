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

@OriginalClass("client!aki")
public class Class27_Sub2_Sub1 extends Class27_Sub2 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aki", name = "this$0", descriptor = "Lclient!hc;")
	final Class217 this$0;

	@OriginalMember(owner = "client!aki", name = "l", descriptor = "F")
	float aFloat159;

	@OriginalMember(owner = "client!aki", name = "h", descriptor = "F")
	float aFloat158;

	@OriginalMember(owner = "client!aki", name = "<init>", descriptor = "(Lclient!hc;Ljava/awt/Image;IIF)V", line = 205)
	Class27_Sub2_Sub1(@OriginalArg(0) Class217 arg0, @OriginalArg(1) Image arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		super(arg0, arg1, arg2, arg3);
		this.this$0 = arg0;
		this.aFloat159 = arg4;
		this.aFloat158 = -this.aFloat159;
	}

	@OriginalMember(owner = "client!aki", name = "p", descriptor = "(Ljava/awt/Graphics;B)V", line = 212)
	@Override
	void method15267(@OriginalArg(0) Graphics arg0) {
		this.aFloat158 += this.aFloat159;
		if (this.aFloat158 < 0.0F) {
			this.aFloat158 += 360.0F;
		}
		this.aFloat158 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat158);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.this$0.method24333(local33) + local33 / 2 + this.anInt2228 * 714162189), (double) (this.this$0.method24334(local38) + local38 / 2 + this.anInt2227 * 1181499303));
		local41.translate(this.this$0.method24333(local33) + this.anInt2228 * 714162189, this.this$0.method24334(local38) + this.anInt2227 * 1181499303);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.this$0.anAffineTransform1);
	}

	@OriginalMember(owner = "client!aki", name = "a", descriptor = "(Ljava/awt/Graphics;)V", line = 212)
	@Override
	void method15268(@OriginalArg(0) Graphics arg0) {
		this.aFloat158 += this.aFloat159;
		if (this.aFloat158 < 0.0F) {
			this.aFloat158 += 360.0F;
		}
		this.aFloat158 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat158);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.this$0.method24333(local33) + local33 / 2 + this.anInt2228 * 714162189), (double) (this.this$0.method24334(local38) + local38 / 2 + this.anInt2227 * 1181499303));
		local41.translate(this.this$0.method24333(local33) + this.anInt2228 * 714162189, this.this$0.method24334(local38) + this.anInt2227 * 1181499303);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.this$0.anAffineTransform1);
	}

	@OriginalMember(owner = "client!aki", name = "g", descriptor = "(Ljava/awt/Graphics;)V", line = 212)
	@Override
	void method15270(@OriginalArg(0) Graphics arg0) {
		this.aFloat158 += this.aFloat159;
		if (this.aFloat158 < 0.0F) {
			this.aFloat158 += 360.0F;
		}
		this.aFloat158 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat158);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.this$0.method24333(local33) + local33 / 2 + this.anInt2228 * 714162189), (double) (this.this$0.method24334(local38) + local38 / 2 + this.anInt2227 * 1181499303));
		local41.translate(this.this$0.method24333(local33) + this.anInt2228 * 714162189, this.this$0.method24334(local38) + this.anInt2227 * 1181499303);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.this$0.anAffineTransform1);
	}

	@OriginalMember(owner = "client!aki", name = "l", descriptor = "(Ljava/awt/Graphics;)V", line = 212)
	@Override
	void method15269(@OriginalArg(0) Graphics arg0) {
		this.aFloat158 += this.aFloat159;
		if (this.aFloat158 < 0.0F) {
			this.aFloat158 += 360.0F;
		}
		this.aFloat158 %= 360.0F;
		@Pc(28) double local28 = Math.toRadians((double) this.aFloat158);
		@Pc(33) int local33 = this.anImage2.getWidth(null);
		@Pc(38) int local38 = this.anImage2.getHeight(null);
		@Pc(41) Graphics2D local41 = (Graphics2D) arg0;
		local41.rotate(local28, (double) (this.this$0.method24333(local33) + local33 / 2 + this.anInt2228 * 714162189), (double) (this.this$0.method24334(local38) + local38 / 2 + this.anInt2227 * 1181499303));
		local41.translate(this.this$0.method24333(local33) + this.anInt2228 * 714162189, this.this$0.method24334(local38) + this.anInt2227 * 1181499303);
		local41.drawImage(this.anImage2, null, null);
		local41.setTransform(this.this$0.anAffineTransform1);
	}
}
