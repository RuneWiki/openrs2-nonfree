package com.jagex;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeh")
public class Class29_Sub3 extends Class29 implements Interface27 {

	@OriginalMember(owner = "client!aeh", name = "x", descriptor = "I")
	final int anInt967;

	@OriginalMember(owner = "client!aeh", name = "<init>", descriptor = "(Lclient!akw;IZ[[I)V", line = 16)
	Class29_Sub3(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Class121.aClass121_17, Class127.aClass127_23, arg2 && arg0.aBoolean459, arg1 * arg1 * 6);
		this.anInt967 = arg1;
		if (this.aBoolean194) {
			this.aLong27 = IDirect3DDevice.CreateCubeTexture(this.aClass21_Sub3_Sub2_8.aLong104, this.anInt967, 0, 1024, 21, 1);
		} else {
			this.aLong27 = IDirect3DDevice.CreateCubeTexture(this.aClass21_Sub3_Sub2_8.aLong104, this.anInt967, 1, 0, 21, 1);
		}
		@Pc(52) ByteBuffer local52 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		for (@Pc(54) int local54 = 0; local54 < 6; local54++) {
			local52.clear();
			local52.asIntBuffer().put(arg3[local54]);
			IDirect3DCubeTexture.Upload(this.aLong27, local54, 0, 0, 0, this.anInt967, this.anInt967, this.anInt967 * 4, 0, this.aClass21_Sub3_Sub2_8.aLong101);
		}
	}

	@OriginalMember(owner = "client!aeh", name = "ao", descriptor = "()V", line = 31)
	@Override
	public void method9872() {
		this.aClass21_Sub3_Sub2_8.method17827(this);
	}

	@OriginalMember(owner = "client!aeh", name = "ab", descriptor = "()V", line = 31)
	@Override
	public void method9868() {
		this.aClass21_Sub3_Sub2_8.method17827(this);
	}

	@OriginalMember(owner = "client!aeh", name = "au", descriptor = "()V", line = 31)
	@Override
	public void method9873() {
		this.aClass21_Sub3_Sub2_8.method17827(this);
	}

	@OriginalMember(owner = "client!aeh", name = "g", descriptor = "()V", line = 35)
	@Override
	public void method27209() {
		super.method27209();
	}

	@OriginalMember(owner = "client!aeh", name = "y", descriptor = "()V", line = 35)
	@Override
	public void method27208() {
		super.method27209();
	}

	@OriginalMember(owner = "client!aeh", name = "b", descriptor = "()V", line = 35)
	@Override
	public void method27210() {
		super.method27209();
	}

	@OriginalMember(owner = "client!aeh", name = "ap", descriptor = "(Lclient!jn;)V", line = 39)
	@Override
	public void method9867(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}

	@OriginalMember(owner = "client!aeh", name = "ay", descriptor = "(Lclient!jn;)V", line = 39)
	@Override
	public void method9874(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}
}
