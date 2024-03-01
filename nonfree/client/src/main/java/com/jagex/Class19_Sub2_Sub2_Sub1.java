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

@OriginalClass("client!aoe")
public final class Class19_Sub2_Sub2_Sub1 extends Class19_Sub2_Sub2 {

	@OriginalMember(owner = "client!aoe", name = "u", descriptor = "Ljava/awt/Image;")
	Image anImage3;

	@OriginalMember(owner = "client!aoe", name = "<init>", descriptor = "(Lclient!abl;Ljava/awt/Canvas;II)V", line = 18)
	Class19_Sub2_Sub2_Sub1(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg1, arg2, arg3);
		new Rectangle();
		this.method20757();
	}

	@OriginalMember(owner = "client!aoe", name = "v", descriptor = "(I)V", line = 23)
	@Override
	void method20757() {
		super.method20757();
		@Pc(11) DataBufferInt local11 = new DataBufferInt(this.anIntArray271, this.anIntArray271.length);
		@Pc(19) DirectColorModel local19 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(33) WritableRaster local33 = Raster.createWritableRaster(local19.createCompatibleSampleModel(this.anInt2835 * -1110293219, this.anInt2836 * 1376558029), local11, null);
		this.anImage3 = new BufferedImage(local19, local33, false, new Hashtable());
	}

	@OriginalMember(owner = "client!aoe", name = "ai", descriptor = "()V", line = 23)
	@Override
	void method20762() {
		super.method20757();
		@Pc(11) DataBufferInt local11 = new DataBufferInt(this.anIntArray271, this.anIntArray271.length);
		@Pc(19) DirectColorModel local19 = new DirectColorModel(32, 16711680, 65280, 255);
		@Pc(33) WritableRaster local33 = Raster.createWritableRaster(local19.createCompatibleSampleModel(this.anInt2835 * -1110293219, this.anInt2836 * 1376558029), local11, null);
		this.anImage3 = new BufferedImage(local19, local33, false, new Hashtable());
	}

	@OriginalMember(owner = "client!aoe", name = "af", descriptor = "()I", line = 31)
	@Override
	public int method21418() {
		return this.method21413(0, 0);
	}

	@OriginalMember(owner = "client!aoe", name = "ak", descriptor = "()I", line = 31)
	@Override
	public int method21419() {
		return this.method21413(0, 0);
	}

	@OriginalMember(owner = "client!aoe", name = "w", descriptor = "()I", line = 31)
	@Override
	public int method21412() {
		return this.method21413(0, 0);
	}

	@OriginalMember(owner = "client!aoe", name = "o", descriptor = "(II)I", line = 35)
	@Override
	public final int method21413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Graphics local3 = this.aCanvas4.getGraphics();
		if (local3 == null) {
			return 0;
		} else {
			local3.drawImage(this.anImage3, arg0, arg1, this.aCanvas4);
			return 0;
		}
	}

	@OriginalMember(owner = "client!aoe", name = "aa", descriptor = "(II)I", line = 35)
	@Override
	public final int method21420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Graphics local3 = this.aCanvas4.getGraphics();
		if (local3 == null) {
			return 0;
		} else {
			local3.drawImage(this.anImage3, arg0, arg1, this.aCanvas4);
			return 0;
		}
	}

	@OriginalMember(owner = "client!aoe", name = "ah", descriptor = "(II)I", line = 35)
	@Override
	public final int method21416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Graphics local3 = this.aCanvas4.getGraphics();
		if (local3 == null) {
			return 0;
		} else {
			local3.drawImage(this.anImage3, arg0, arg1, this.aCanvas4);
			return 0;
		}
	}

	@OriginalMember(owner = "client!aoe", name = "g", descriptor = "()V", line = 41)
	@Override
	public void method21392() {
	}

	@OriginalMember(owner = "client!aoe", name = "n", descriptor = "()V", line = 41)
	@Override
	public void method21402() {
	}

	@OriginalMember(owner = "client!aoe", name = "e", descriptor = "()V", line = 41)
	@Override
	public void method21406() {
	}

	@OriginalMember(owner = "client!aoe", name = "r", descriptor = "()V", line = 41)
	@Override
	public void method21395() {
	}
}
