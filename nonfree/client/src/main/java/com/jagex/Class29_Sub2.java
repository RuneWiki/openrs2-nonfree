package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adu")
public class Class29_Sub2 extends Class29 implements Interface23 {

	@OriginalMember(owner = "client!adu", name = "x", descriptor = "I")
	final int anInt880;

	@OriginalMember(owner = "client!adu", name = "s", descriptor = "I")
	final int anInt881;

	@OriginalMember(owner = "client!adu", name = "u", descriptor = "I")
	final int anInt882;

	@OriginalMember(owner = "client!adu", name = "<init>", descriptor = "(Lclient!akw;Lclient!cw;IIIZ[B)V", line = 17)
	Class29_Sub2(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6) {
		super(arg0, arg1, Class127.aClass127_23, false, arg2 * arg3 * arg4);
		this.anInt880 = arg2;
		this.anInt881 = arg3;
		this.anInt882 = arg4;
		this.aLong27 = IDirect3DDevice.CreateVolumeTexture(this.aClass21_Sub3_Sub2_8.aLong104, arg2, arg3, arg4, 1, 0, Class21_Sub3_Sub2.method17833(arg1, this.aClass127_13), 1);
		@Pc(39) ByteBuffer local39 = this.aClass21_Sub3_Sub2_8.aByteBuffer4;
		local39.clear();
		local39.put(arg6);
		IDirect3DVolumeTexture.Upload(this.aLong27, 0, 0, 0, 0, this.anInt880, this.anInt881, this.anInt882, this.anInt880 * arg1.anInt3211 * 1629489977, 0, this.aClass21_Sub3_Sub2_8.aLong101);
	}

	@OriginalMember(owner = "client!adu", name = "aw", descriptor = "()J", line = 29)
	@Override
	long method8720() {
		return this.aLong27;
	}

	@OriginalMember(owner = "client!adu", name = "bs", descriptor = "()J", line = 29)
	@Override
	long method8727() {
		return this.aLong27;
	}

	@OriginalMember(owner = "client!adu", name = "ao", descriptor = "()V", line = 33)
	@Override
	public void method9872() {
		this.aClass21_Sub3_Sub2_8.method17828(this);
	}

	@OriginalMember(owner = "client!adu", name = "ab", descriptor = "()V", line = 33)
	@Override
	public void method9868() {
		this.aClass21_Sub3_Sub2_8.method17828(this);
	}

	@OriginalMember(owner = "client!adu", name = "au", descriptor = "()V", line = 33)
	@Override
	public void method9873() {
		this.aClass21_Sub3_Sub2_8.method17828(this);
	}

	@OriginalMember(owner = "client!adu", name = "ay", descriptor = "(Lclient!jn;)V", line = 37)
	@Override
	public void method9874(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}

	@OriginalMember(owner = "client!adu", name = "ap", descriptor = "(Lclient!jn;)V", line = 37)
	@Override
	public void method9867(@OriginalArg(0) Class259 arg0) {
		super.method9867(arg0);
	}

	@OriginalMember(owner = "client!adu", name = "y", descriptor = "()V", line = 41)
	@Override
	public void method27208() {
		super.method27209();
	}

	@OriginalMember(owner = "client!adu", name = "b", descriptor = "()V", line = 41)
	@Override
	public void method27210() {
		super.method27209();
	}

	@OriginalMember(owner = "client!adu", name = "g", descriptor = "()V", line = 41)
	@Override
	public void method27209() {
		super.method27209();
	}
}
