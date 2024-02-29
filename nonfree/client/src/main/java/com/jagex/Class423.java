package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DIndexBuffer;
import jagdx.IUnknown;
import jagdx.p;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public class Class423 implements Interface38 {

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
	int anInt4806;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
	int anInt4807;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "J")
	long aLong269 = 0L;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "Lclient!apn;")
	final Class86_Sub1_Sub1 aClass86_Sub1_Sub1_11;

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "Lclient!dl;")
	final Class206 aClass206_30;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Z")
	final boolean aBoolean747;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!apn;Lclient!dl;Z)V", line = 18)
	Class423(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass86_Sub1_Sub1_11 = arg0;
		this.aClass206_30 = arg1;
		this.aBoolean747 = arg2;
		this.aClass86_Sub1_Sub1_11.method20382(this);
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "()I", line = 26)
	@Override
	public int method28744() {
		return this.anInt4807;
	}

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "()I", line = 26)
	@Override
	public int method28747() {
		return this.anInt4807;
	}

	@OriginalMember(owner = "client!nm", name = "z", descriptor = "()I", line = 26)
	@Override
	public int method28753() {
		return this.anInt4807;
	}

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "()I", line = 26)
	@Override
	public int method28754() {
		return this.anInt4807;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "()Lclient!dl;", line = 30)
	@Override
	public Class206 method28729() {
		return this.aClass206_30;
	}

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "()Lclient!dl;", line = 30)
	@Override
	public Class206 method28727() {
		return this.aClass206_30;
	}

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "(I)V", line = 34)
	@Override
	public void method28728(@OriginalArg(0) int arg0) {
		this.anInt4807 = this.aClass206_30.anInt3581 * 1899960707 * arg0;
		if (this.anInt4807 <= this.anInt4806) {
			return;
		}
		if (this.aLong269 != 0L) {
			IUnknown.Release(this.aLong269);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean747) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong269 = IDirect3DDevice.CreateIndexBuffer(this.aClass86_Sub1_Sub1_11.aLong119, this.anInt4807, local24, this.aClass206_30 == Class206.aClass206_22 ? 101 : 102, local29);
		this.anInt4806 = this.anInt4807;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V", line = 34)
	@Override
	public void method28730(@OriginalArg(0) int arg0) {
		this.anInt4807 = this.aClass206_30.anInt3581 * 1899960707 * arg0;
		if (this.anInt4807 <= this.anInt4806) {
			return;
		}
		if (this.aLong269 != 0L) {
			IUnknown.Release(this.aLong269);
		}
		@Pc(24) int local24 = 8;
		@Pc(29) byte local29;
		if (this.aBoolean747) {
			local29 = 0;
			local24 |= 0x200;
		} else {
			local29 = 1;
		}
		this.aLong269 = IDirect3DDevice.CreateIndexBuffer(this.aClass86_Sub1_Sub1_11.aLong119, this.anInt4807, local24, this.aClass206_30 == Class206.aClass206_22 ? 101 : 102, local29);
		this.anInt4806 = this.anInt4807;
	}

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "(II)J", line = 52)
	@Override
	public long method28745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong269, arg0, arg1, this.aBoolean747 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "(II)J", line = 52)
	@Override
	public long method28749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return IDirect3DIndexBuffer.Lock(this.aLong269, arg0, arg1, this.aBoolean747 ? 8192 : 0);
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "()V", line = 56)
	@Override
	public void method28748() {
		IDirect3DIndexBuffer.Unlock(this.aLong269);
	}

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "()V", line = 56)
	@Override
	public void method28746() {
		IDirect3DIndexBuffer.Unlock(this.aLong269);
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "()V", line = 56)
	@Override
	public void method28743() {
		IDirect3DIndexBuffer.Unlock(this.aLong269);
	}

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "(IIJ)Z", line = 60)
	@Override
	public boolean method28755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method27710(IDirect3DIndexBuffer.Upload(this.aLong269, arg0, arg1, this.aBoolean747 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "(IIJ)Z", line = 60)
	@Override
	public boolean method28750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method27710(IDirect3DIndexBuffer.Upload(this.aLong269, arg0, arg1, this.aBoolean747 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "(IIJ)Z", line = 60)
	@Override
	public boolean method28751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method27710(IDirect3DIndexBuffer.Upload(this.aLong269, arg0, arg1, this.aBoolean747 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "(IIJ)Z", line = 60)
	@Override
	public boolean method28752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return p.method27710(IDirect3DIndexBuffer.Upload(this.aLong269, arg0, arg1, this.aBoolean747 ? 8192 : 0, arg2));
	}

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "()V", line = 64)
	@Override
	public void method30322() {
		if (this.aLong269 != 0L) {
			IUnknown.Release(this.aLong269);
			this.aLong269 = 0L;
		}
		this.anInt4806 = 0;
		this.anInt4807 = 0;
		this.aClass86_Sub1_Sub1_11.method20385(this);
	}

	@OriginalMember(owner = "client!nm", name = "s", descriptor = "()V", line = 64)
	@Override
	public void method30320() {
		if (this.aLong269 != 0L) {
			IUnknown.Release(this.aLong269);
			this.aLong269 = 0L;
		}
		this.anInt4806 = 0;
		this.anInt4807 = 0;
		this.aClass86_Sub1_Sub1_11.method20385(this);
	}

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "()V", line = 64)
	@Override
	public void method30319() {
		if (this.aLong269 != 0L) {
			IUnknown.Release(this.aLong269);
			this.aLong269 = 0L;
		}
		this.anInt4806 = 0;
		this.anInt4807 = 0;
		this.aClass86_Sub1_Sub1_11.method20385(this);
	}

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "()V", line = 64)
	@Override
	public void method30321() {
		if (this.aLong269 != 0L) {
			IUnknown.Release(this.aLong269);
			this.aLong269 = 0L;
		}
		this.anInt4806 = 0;
		this.anInt4807 = 0;
		this.aClass86_Sub1_Sub1_11.method20385(this);
	}

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "()V", line = 74)
	void method28731() {
		if (this.aLong269 != 0L) {
			this.aClass86_Sub1_Sub1_11.method19590(this.aLong269);
			this.aLong269 = 0L;
		}
		this.anInt4806 = 0;
		this.anInt4807 = 0;
	}

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "()V", line = 74)
	void method28732() {
		if (this.aLong269 != 0L) {
			this.aClass86_Sub1_Sub1_11.method19590(this.aLong269);
			this.aLong269 = 0L;
		}
		this.anInt4806 = 0;
		this.anInt4807 = 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()V", line = 74)
	void method28733() {
		if (this.aLong269 != 0L) {
			this.aClass86_Sub1_Sub1_11.method19590(this.aLong269);
			this.aLong269 = 0L;
		}
		this.anInt4806 = 0;
		this.anInt4807 = 0;
	}

	@OriginalMember(owner = "client!nm", name = "hd", descriptor = "()V", line = 83)
	void method28734() {
		this.method28731();
	}

	@OriginalMember(owner = "client!nm", name = "finalize", descriptor = "()V", line = 83)
	@Override
	void finalize() {
		this.method28731();
	}

	@OriginalMember(owner = "client!nm", name = "hc", descriptor = "()V", line = 83)
	void method28735() {
		this.method28731();
	}

	@OriginalMember(owner = "client!nm", name = "hp", descriptor = "()V", line = 83)
	void method28736() {
		this.method28731();
	}
}
