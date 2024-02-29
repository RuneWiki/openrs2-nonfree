package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class Class435 implements Interface50 {

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Lclient!apn;")
	final Class86_Sub1_Sub1 aClass86_Sub1_Sub1_13;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
	final int anInt4910;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
	final int anInt4911;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!dl;")
	final Class206 aClass206_31;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "J")
	long aLong273;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!apn;Lclient!dl;III)V", line = 16)
	Class435(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass86_Sub1_Sub1_13 = arg0;
		this.anInt4910 = arg2;
		this.anInt4911 = arg3;
		this.aClass206_31 = arg1;
		this.aLong273 = IDirect3DDevice.CreateDepthStencilSurface(this.aClass86_Sub1_Sub1_13.aLong119, arg2, arg3, Class86_Sub1_Sub1.method19582(this.aClass206_31), arg4, 0, false);
		this.aClass86_Sub1_Sub1_13.method20382(this);
	}

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "()I", line = 26)
	@Override
	public int method30324() {
		return this.anInt4910;
	}

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "()I", line = 26)
	@Override
	public int method30325() {
		return this.anInt4910;
	}

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "()I", line = 26)
	@Override
	public int method30326() {
		return this.anInt4910;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()I", line = 30)
	@Override
	public int method30329() {
		return this.anInt4911;
	}

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "()I", line = 30)
	@Override
	public int method30323() {
		return this.anInt4911;
	}

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "()I", line = 30)
	@Override
	public int method30328() {
		return this.anInt4911;
	}

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "()I", line = 30)
	@Override
	public int method30330() {
		return this.anInt4911;
	}

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "()I", line = 30)
	@Override
	public int method30327() {
		return this.anInt4911;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()I", line = 30)
	@Override
	public int method30331() {
		return this.anInt4911;
	}

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "()J", line = 34)
	@Override
	public long method29383() {
		return this.aLong273;
	}

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "()J", line = 34)
	@Override
	public long method29377() {
		return this.aLong273;
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "()J", line = 34)
	@Override
	public long method29379() {
		return this.aLong273;
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "()J", line = 34)
	@Override
	public long method29378() {
		return this.aLong273;
	}

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "()V", line = 38)
	@Override
	public void method30322() {
		if (this.aLong273 != 0L) {
			IUnknown.Release(this.aLong273);
			this.aLong273 = 0L;
		}
		this.aClass86_Sub1_Sub1_13.method20385(this);
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "()V", line = 38)
	@Override
	public void method30319() {
		if (this.aLong273 != 0L) {
			IUnknown.Release(this.aLong273);
			this.aLong273 = 0L;
		}
		this.aClass86_Sub1_Sub1_13.method20385(this);
	}

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "()V", line = 38)
	@Override
	public void method30320() {
		if (this.aLong273 != 0L) {
			IUnknown.Release(this.aLong273);
			this.aLong273 = 0L;
		}
		this.aClass86_Sub1_Sub1_13.method20385(this);
	}

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "()V", line = 38)
	@Override
	public void method30321() {
		if (this.aLong273 != 0L) {
			IUnknown.Release(this.aLong273);
			this.aLong273 = 0L;
		}
		this.aClass86_Sub1_Sub1_13.method20385(this);
	}

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "()V", line = 46)
	@Override
	public void method29376() {
		if (this.aLong273 != 0L) {
			this.aClass86_Sub1_Sub1_13.method19590(this.aLong273);
			this.aLong273 = 0L;
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()V", line = 46)
	@Override
	public void method29375() {
		if (this.aLong273 != 0L) {
			this.aClass86_Sub1_Sub1_13.method19590(this.aLong273);
			this.aLong273 = 0L;
		}
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "()V", line = 46)
	@Override
	public void method29381() {
		if (this.aLong273 != 0L) {
			this.aClass86_Sub1_Sub1_13.method19590(this.aLong273);
			this.aLong273 = 0L;
		}
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "()V", line = 46)
	@Override
	public void method29380() {
		if (this.aLong273 != 0L) {
			this.aClass86_Sub1_Sub1_13.method19590(this.aLong273);
			this.aLong273 = 0L;
		}
	}

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "()V", line = 46)
	@Override
	public void method29382() {
		if (this.aLong273 != 0L) {
			this.aClass86_Sub1_Sub1_13.method19590(this.aLong273);
			this.aLong273 = 0L;
		}
	}

	@OriginalMember(owner = "client!oa", name = "hd", descriptor = "()V", line = 53)
	void method28908() {
		this.method29376();
	}

	@OriginalMember(owner = "client!oa", name = "hc", descriptor = "()V", line = 53)
	void method28909() {
		this.method29376();
	}

	@OriginalMember(owner = "client!oa", name = "hp", descriptor = "()V", line = 53)
	void method28910() {
		this.method29376();
	}

	@OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 53)
	@Override
	void finalize() {
		this.method29376();
	}
}
