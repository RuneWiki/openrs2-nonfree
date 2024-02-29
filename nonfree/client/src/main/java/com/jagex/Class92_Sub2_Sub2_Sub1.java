package com.jagex;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asn")
public final class Class92_Sub2_Sub2_Sub1 extends Class92_Sub2_Sub2 {

	@OriginalMember(owner = "client!asn", name = "q", descriptor = "Ljava/awt/Image;")
	Image anImage3;

	@OriginalMember(owner = "client!asn", name = "<init>", descriptor = "(Lclient!aeh;Ljava/awt/Canvas;II)V", line = 18)
	Class92_Sub2_Sub2_Sub1(@OriginalArg(0) Class86_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg1, arg2, arg3);
		new Rectangle();
		this.method23287();
	}

	@OriginalMember(owner = "client!asn", name = "f", descriptor = "(I)V", line = 23)
	@Override
	void method23287() {
		super.method23287();
		@Pc(11) DataBufferInt local11 = new DataBufferInt(this.anIntArray292, this.anIntArray292.length);
		@Pc(19) DirectColorModel local19 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(33) WritableRaster local33 = Raster.createWritableRaster(local19.createCompatibleSampleModel(this.anInt3147 * -150461501, this.anInt3148 * 787243643), local11, null);
		this.anImage3 = new BufferedImage(local19, local33, false, new Hashtable());
	}

	@OriginalMember(owner = "client!asn", name = "b", descriptor = "()V", line = 23)
	@Override
	void method23286() {
		super.method23287();
		@Pc(11) DataBufferInt local11 = new DataBufferInt(this.anIntArray292, this.anIntArray292.length);
		@Pc(19) DirectColorModel local19 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(33) WritableRaster local33 = Raster.createWritableRaster(local19.createCompatibleSampleModel(this.anInt3147 * -150461501, this.anInt3148 * 787243643), local11, null);
		this.anImage3 = new BufferedImage(local19, local33, false, new Hashtable());
	}

	@OriginalMember(owner = "client!asn", name = "o", descriptor = "()V", line = 23)
	@Override
	void method23285() {
		super.method23287();
		@Pc(11) DataBufferInt local11 = new DataBufferInt(this.anIntArray292, this.anIntArray292.length);
		@Pc(19) DirectColorModel local19 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(33) WritableRaster local33 = Raster.createWritableRaster(local19.createCompatibleSampleModel(this.anInt3147 * -150461501, this.anInt3148 * 787243643), local11, null);
		this.anImage3 = new BufferedImage(local19, local33, false, new Hashtable());
	}

	@OriginalMember(owner = "client!asn", name = "au", descriptor = "()V", line = 23)
	@Override
	void method23288() {
		super.method23287();
		@Pc(11) DataBufferInt local11 = new DataBufferInt(this.anIntArray292, this.anIntArray292.length);
		@Pc(19) DirectColorModel local19 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(33) WritableRaster local33 = Raster.createWritableRaster(local19.createCompatibleSampleModel(this.anInt3147 * -150461501, this.anInt3148 * 787243643), local11, null);
		this.anImage3 = new BufferedImage(local19, local33, false, new Hashtable());
	}

	@OriginalMember(owner = "client!asn", name = "ak", descriptor = "()V", line = 23)
	@Override
	void method23284() {
		super.method23287();
		@Pc(11) DataBufferInt local11 = new DataBufferInt(this.anIntArray292, this.anIntArray292.length);
		@Pc(19) DirectColorModel local19 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(33) WritableRaster local33 = Raster.createWritableRaster(local19.createCompatibleSampleModel(this.anInt3147 * -150461501, this.anInt3148 * 787243643), local11, null);
		this.anImage3 = new BufferedImage(local19, local33, false, new Hashtable());
	}

	@OriginalMember(owner = "client!asn", name = "aj", descriptor = "()I", line = 31)
	@Override
	public int method23352() {
		return this.method23349(0, 0);
	}

	@OriginalMember(owner = "client!asn", name = "al", descriptor = "()I", line = 31)
	@Override
	public int method23354() {
		return this.method23349(0, 0);
	}

	@OriginalMember(owner = "client!asn", name = "n", descriptor = "()I", line = 31)
	@Override
	public int method23348() {
		return this.method23349(0, 0);
	}

	@OriginalMember(owner = "client!asn", name = "ag", descriptor = "()I", line = 31)
	@Override
	public int method23355() {
		return this.method23349(0, 0);
	}

	@OriginalMember(owner = "client!asn", name = "ai", descriptor = "()I", line = 31)
	@Override
	public int method23347() {
		return this.method23349(0, 0);
	}

	@OriginalMember(owner = "client!asn", name = "a", descriptor = "(II)I", line = 35)
	@Override
	public final int method23349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Graphics local3 = this.aCanvas4.getGraphics();
		if (local3 == null) {
			return 0;
		} else {
			local3.drawImage(this.anImage3, arg0, arg1, this.aCanvas4);
			return 0;
		}
	}

	@OriginalMember(owner = "client!asn", name = "ao", descriptor = "(II)I", line = 35)
	@Override
	public final int method23353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Graphics local3 = this.aCanvas4.getGraphics();
		if (local3 == null) {
			return 0;
		} else {
			local3.drawImage(this.anImage3, arg0, arg1, this.aCanvas4);
			return 0;
		}
	}

	@OriginalMember(owner = "client!asn", name = "v", descriptor = "()V", line = 41)
	@Override
	public void method23506() {
	}

	@OriginalMember(owner = "client!asn", name = "i", descriptor = "()V", line = 41)
	@Override
	public void method23502() {
	}

	@OriginalMember(owner = "client!asn", name = "k", descriptor = "()V", line = 41)
	@Override
	public void method23507() {
	}

	@OriginalMember(owner = "client!asn", name = "u", descriptor = "()V", line = 41)
	@Override
	public void method23501() {
	}
}
