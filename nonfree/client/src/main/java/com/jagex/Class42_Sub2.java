package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aoi")
public class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!aoi", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;Lclient!pw;Z)V", line = 11)
	public Class42_Sub2(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class478 arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, Class647.aClass647_66, arg2, new Class308(), arg3);
	}

	@OriginalMember(owner = "client!aoi", name = "c", descriptor = "(B)I", line = 15)
	@Override
	public int method18318() {
		return this.anInt2431 * 317485579;
	}

	@OriginalMember(owner = "client!aoi", name = "w", descriptor = "()I", line = 15)
	@Override
	public int method18313() {
		return this.anInt2431 * 317485579;
	}

	@OriginalMember(owner = "client!aoi", name = "t", descriptor = "()I", line = 15)
	@Override
	public int method18316() {
		return this.anInt2431 * 317485579;
	}
}
