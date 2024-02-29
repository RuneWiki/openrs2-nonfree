package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;
import jagdx.p;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public class Class425 implements Interface36 {

	@OriginalMember(owner = "client!no", name = "l", descriptor = "B")
	byte aByte159;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "I")
	int anInt4809;

	@OriginalMember(owner = "client!no", name = "v", descriptor = "I")
	int anInt4810;

	@OriginalMember(owner = "client!no", name = "w", descriptor = "J")
	long aLong270 = 0L;

	@OriginalMember(owner = "client!no", name = "p", descriptor = "Lclient!apn;")
	final Class86_Sub1_Sub1 aClass86_Sub1_Sub1_12;

	@OriginalMember(owner = "client!no", name = "y", descriptor = "Z")
	final boolean aBoolean748;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!apn;Z)V", line = 17)
	Class425(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass86_Sub1_Sub1_12 = arg0;
		this.aBoolean748 = arg1;
		this.aClass86_Sub1_Sub1_12.method20382(this);
	}

	@OriginalMember(owner = "client!no", name = "y", descriptor = "()I", line = 24)
	@Override
	public int method28754() {
		return this.anInt4810;
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "()I", line = 24)
	@Override
	public int method28744() {
		return this.anInt4810;
	}

	@OriginalMember(owner = "client!no", name = "x", descriptor = "()I", line = 24)
	@Override
	public int method28747() {
		return this.anInt4810;
	}

	@OriginalMember(owner = "client!no", name = "z", descriptor = "()I", line = 24)
	@Override
	public int method28753() {
		return this.anInt4810;
	}

	@OriginalMember(owner = "client!no", name = "o", descriptor = "()I", line = 28)
	int method28763() {
		return this.aByte159;
	}

	@OriginalMember(owner = "client!no", name = "n", descriptor = "()I", line = 28)
	int method28764() {
		return this.aByte159;
	}

	@OriginalMember(owner = "client!no", name = "p", descriptor = "(II)Z", line = 32)
	@Override
	public boolean method28760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4810 = arg0;
		this.aByte159 = (byte) arg1;
		if (this.anInt4810 > this.anInt4809) {
			@Pc(13) int local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean748) {
				local18 = 0;
				local13 |= 0x200;
			} else {
				local18 = 1;
			}
			if (this.aLong270 != 0L) {
				IUnknown.Release(this.aLong270);
			}
			this.aLong270 = IDirect3DDevice.CreateVertexBuffer(this.aClass86_Sub1_Sub1_12.aLong119, this.anInt4810, local13, 0, local18);
			this.anInt4809 = this.anInt4810;
		}
		return this.aLong270 != 0L;
	}

	@OriginalMember(owner = "client!no", name = "l", descriptor = "(II)Z", line = 32)
	@Override
	public boolean method28762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4810 = arg0;
		this.aByte159 = (byte) arg1;
		if (this.anInt4810 > this.anInt4809) {
			@Pc(13) int local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean748) {
				local18 = 0;
				local13 |= 0x200;
			} else {
				local18 = 1;
			}
			if (this.aLong270 != 0L) {
				IUnknown.Release(this.aLong270);
			}
			this.aLong270 = IDirect3DDevice.CreateVertexBuffer(this.aClass86_Sub1_Sub1_12.aLong119, this.anInt4810, local13, 0, local18);
			this.anInt4809 = this.anInt4810;
		}
		return this.aLong270 != 0L;
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(II)Z", line = 32)
	@Override
	public boolean method28761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4810 = arg0;
		this.aByte159 = (byte) arg1;
		if (this.anInt4810 > this.anInt4809) {
			@Pc(13) int local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean748) {
				local18 = 0;
				local13 |= 0x200;
			} else {
				local18 = 1;
			}
			if (this.aLong270 != 0L) {
				IUnknown.Release(this.aLong270);
			}
			this.aLong270 = IDirect3DDevice.CreateVertexBuffer(this.aClass86_Sub1_Sub1_12.aLong119, this.anInt4810, local13, 0, local18);
			this.anInt4809 = this.anInt4810;
		}
		return this.aLong270 != 0L;
	}

	@OriginalMember(owner = "client!no", name = "t", descriptor = "(II)J", line = 50)
	@Override
	public long method28745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong270, arg0, arg1, this.aBoolean748 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!no", name = "u", descriptor = "(II)J", line = 50)
	@Override
	public long method28749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong270, arg0, arg1, this.aBoolean748 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!no", name = "q", descriptor = "()V", line = 54)
	@Override
	public void method28746() {
		IDirect3DVertexBuffer.Unlock(this.aLong270);
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "()V", line = 54)
	@Override
	public void method28743() {
		IDirect3DVertexBuffer.Unlock(this.aLong270);
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "()V", line = 54)
	@Override
	public void method28748() {
		IDirect3DVertexBuffer.Unlock(this.aLong270);
	}

	@OriginalMember(owner = "client!no", name = "k", descriptor = "(IIJ)Z", line = 58)
	@Override
	public boolean method28752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method27710(IDirect3DVertexBuffer.Upload(this.aLong270, arg0, arg1, this.aBoolean748 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!no", name = "w", descriptor = "(IIJ)Z", line = 58)
	@Override
	public boolean method28755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method27710(IDirect3DVertexBuffer.Upload(this.aLong270, arg0, arg1, this.aBoolean748 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!no", name = "j", descriptor = "(IIJ)Z", line = 58)
	@Override
	public boolean method28750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method27710(IDirect3DVertexBuffer.Upload(this.aLong270, arg0, arg1, this.aBoolean748 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!no", name = "i", descriptor = "(IIJ)Z", line = 58)
	@Override
	public boolean method28751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method27710(IDirect3DVertexBuffer.Upload(this.aLong270, arg0, arg1, this.aBoolean748 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!no", name = "v", descriptor = "()V", line = 62)
	@Override
	public void method30322() {
		if (this.aLong270 != 0L) {
			IUnknown.Release(this.aLong270);
			this.aLong270 = 0L;
		}
		this.anInt4809 = 0;
		this.anInt4810 = 0;
		this.aClass86_Sub1_Sub1_12.method20385(this);
	}

	@OriginalMember(owner = "client!no", name = "r", descriptor = "()V", line = 62)
	@Override
	public void method30321() {
		if (this.aLong270 != 0L) {
			IUnknown.Release(this.aLong270);
			this.aLong270 = 0L;
		}
		this.anInt4809 = 0;
		this.anInt4810 = 0;
		this.aClass86_Sub1_Sub1_12.method20385(this);
	}

	@OriginalMember(owner = "client!no", name = "s", descriptor = "()V", line = 62)
	@Override
	public void method30320() {
		if (this.aLong270 != 0L) {
			IUnknown.Release(this.aLong270);
			this.aLong270 = 0L;
		}
		this.anInt4809 = 0;
		this.anInt4810 = 0;
		this.aClass86_Sub1_Sub1_12.method20385(this);
	}

	@OriginalMember(owner = "client!no", name = "g", descriptor = "()V", line = 62)
	@Override
	public void method30319() {
		if (this.aLong270 != 0L) {
			IUnknown.Release(this.aLong270);
			this.aLong270 = 0L;
		}
		this.anInt4809 = 0;
		this.anInt4810 = 0;
		this.aClass86_Sub1_Sub1_12.method20385(this);
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "()V", line = 72)
	void method28765() {
		if (this.aLong270 != 0L) {
			this.aClass86_Sub1_Sub1_12.method19590(this.aLong270);
			this.aLong270 = 0L;
			this.anInt4809 = 0;
			this.anInt4810 = 0;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "()V", line = 72)
	void method28766() {
		if (this.aLong270 != 0L) {
			this.aClass86_Sub1_Sub1_12.method19590(this.aLong270);
			this.aLong270 = 0L;
			this.anInt4809 = 0;
			this.anInt4810 = 0;
		}
	}

	@OriginalMember(owner = "client!no", name = "finalize", descriptor = "()V", line = 81)
	@Override
	void finalize() {
		this.method28765();
	}

	@OriginalMember(owner = "client!no", name = "hd", descriptor = "()V", line = 81)
	void method28767() {
		this.method28765();
	}

	@OriginalMember(owner = "client!no", name = "hc", descriptor = "()V", line = 81)
	void method28768() {
		this.method28765();
	}

	@OriginalMember(owner = "client!no", name = "hp", descriptor = "()V", line = 81)
	void method28769() {
		this.method28765();
	}
}
