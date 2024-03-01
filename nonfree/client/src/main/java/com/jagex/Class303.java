package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;
import jagdx.p;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public class Class303 implements Interface21 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
	int anInt4426;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "B")
	byte aByte153;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
	int anInt4427;

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "J")
	long aLong259 = 0L;

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "Lclient!akw;")
	final Class21_Sub3_Sub2 aClass21_Sub3_Sub2_11;

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "Z")
	final boolean aBoolean711;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!akw;Z)V", line = 17)
	Class303(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass21_Sub3_Sub2_11 = arg0;
		this.aBoolean711 = arg1;
		this.aClass21_Sub3_Sub2_11.method17583(this);
	}

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "()I", line = 24)
	@Override
	public int method25709() {
		return this.anInt4427;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "()I", line = 24)
	@Override
	public int method25714() {
		return this.anInt4427;
	}

	@OriginalMember(owner = "client!ln", name = "z", descriptor = "()I", line = 24)
	@Override
	public int method25704() {
		return this.anInt4427;
	}

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "()I", line = 24)
	@Override
	public int method25706() {
		return this.anInt4427;
	}

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "()I", line = 28)
	int method25689() {
		return this.aByte153;
	}

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "()I", line = 28)
	int method25693() {
		return this.aByte153;
	}

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "()I", line = 28)
	int method25694() {
		return this.aByte153;
	}

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "(II)Z", line = 32)
	@Override
	public boolean method25687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4427 = arg0;
		this.aByte153 = (byte) arg1;
		if (this.anInt4427 > this.anInt4426) {
			@Pc(13) int local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean711) {
				local18 = 0;
				local13 |= 0x200;
			} else {
				local18 = 1;
			}
			if (this.aLong259 != 0L) {
				IUnknown.Release(this.aLong259);
			}
			this.aLong259 = IDirect3DDevice.CreateVertexBuffer(this.aClass21_Sub3_Sub2_11.aLong104, this.anInt4427, local13, 0, local18);
			this.anInt4426 = this.anInt4427;
		}
		return this.aLong259 != 0L;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)Z", line = 32)
	@Override
	public boolean method25688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4427 = arg0;
		this.aByte153 = (byte) arg1;
		if (this.anInt4427 > this.anInt4426) {
			@Pc(13) int local13 = 8;
			@Pc(18) byte local18;
			if (this.aBoolean711) {
				local18 = 0;
				local13 |= 0x200;
			} else {
				local18 = 1;
			}
			if (this.aLong259 != 0L) {
				IUnknown.Release(this.aLong259);
			}
			this.aLong259 = IDirect3DDevice.CreateVertexBuffer(this.aClass21_Sub3_Sub2_11.aLong104, this.anInt4427, local13, 0, local18);
			this.anInt4426 = this.anInt4427;
		}
		return this.aLong259 != 0L;
	}

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "(II)J", line = 50)
	@Override
	public long method25710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong259, arg0, arg1, this.aBoolean711 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "(II)J", line = 50)
	@Override
	public long method25708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong259, arg0, arg1, this.aBoolean711 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(II)J", line = 50)
	@Override
	public long method25713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DVertexBuffer.Lock(this.aLong259, arg0, arg1, this.aBoolean711 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "()V", line = 54)
	@Override
	public void method25707() {
		IDirect3DVertexBuffer.Unlock(this.aLong259);
	}

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "()V", line = 54)
	@Override
	public void method25716() {
		IDirect3DVertexBuffer.Unlock(this.aLong259);
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "()V", line = 54)
	@Override
	public void method25715() {
		IDirect3DVertexBuffer.Unlock(this.aLong259);
	}

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "(IIJ)Z", line = 58)
	@Override
	public boolean method25705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method25092(IDirect3DVertexBuffer.Upload(this.aLong259, arg0, arg1, this.aBoolean711 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "(IIJ)Z", line = 58)
	@Override
	public boolean method25711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method25092(IDirect3DVertexBuffer.Upload(this.aLong259, arg0, arg1, this.aBoolean711 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "(IIJ)Z", line = 58)
	@Override
	public boolean method25712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method25092(IDirect3DVertexBuffer.Upload(this.aLong259, arg0, arg1, this.aBoolean711 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "()V", line = 62)
	@Override
	public void method27210() {
		if (this.aLong259 != 0L) {
			IUnknown.Release(this.aLong259);
			this.aLong259 = 0L;
		}
		this.anInt4426 = 0;
		this.anInt4427 = 0;
		this.aClass21_Sub3_Sub2_11.method17430(this);
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "()V", line = 62)
	@Override
	public void method27209() {
		if (this.aLong259 != 0L) {
			IUnknown.Release(this.aLong259);
			this.aLong259 = 0L;
		}
		this.anInt4426 = 0;
		this.anInt4427 = 0;
		this.aClass21_Sub3_Sub2_11.method17430(this);
	}

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "()V", line = 62)
	@Override
	public void method27208() {
		if (this.aLong259 != 0L) {
			IUnknown.Release(this.aLong259);
			this.aLong259 = 0L;
		}
		this.anInt4426 = 0;
		this.anInt4427 = 0;
		this.aClass21_Sub3_Sub2_11.method17430(this);
	}

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "()V", line = 72)
	void method25690() {
		if (this.aLong259 != 0L) {
			this.aClass21_Sub3_Sub2_11.method17837(this.aLong259);
			this.aLong259 = 0L;
			this.anInt4426 = 0;
			this.anInt4427 = 0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "()V", line = 72)
	void method25691() {
		if (this.aLong259 != 0L) {
			this.aClass21_Sub3_Sub2_11.method17837(this.aLong259);
			this.aLong259 = 0L;
			this.anInt4426 = 0;
			this.anInt4427 = 0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "()V", line = 72)
	void method25695() {
		if (this.aLong259 != 0L) {
			this.aClass21_Sub3_Sub2_11.method17837(this.aLong259);
			this.aLong259 = 0L;
			this.anInt4426 = 0;
			this.anInt4427 = 0;
		}
	}

	@OriginalMember(owner = "client!ln", name = "finalize", descriptor = "()V", line = 81)
	@Override
	void finalize() {
		this.method25690();
	}

	@OriginalMember(owner = "client!ln", name = "hh", descriptor = "()V", line = 81)
	void method25692() {
		this.method25690();
	}
}
