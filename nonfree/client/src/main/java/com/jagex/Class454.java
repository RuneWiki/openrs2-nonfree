package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class Class454 implements Interface52 {

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "Lclient!apn;")
	final Class86_Sub1_Sub1 aClass86_Sub1_Sub1_14;

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
	final int anInt4959;

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "I")
	final int anInt4958;

	@OriginalMember(owner = "client!ov", name = "v", descriptor = "Lclient!dt;")
	final Class212 aClass212_27;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "Lclient!dl;")
	final Class206 aClass206_32;

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "J")
	long aLong275;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!apn;Lclient!dt;Lclient!dl;III)V", line = 17)
	Class454(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass86_Sub1_Sub1_14 = arg0;
		this.anInt4959 = arg3;
		this.anInt4958 = arg4;
		this.aClass212_27 = arg1;
		this.aClass206_32 = arg2;
		this.aLong275 = IDirect3DDevice.CreateRenderTarget(this.aClass86_Sub1_Sub1_14.aLong119, arg3, arg4, Class86_Sub1_Sub1.method19578(this.aClass212_27, this.aClass206_32), arg5, 0, false);
		this.aClass86_Sub1_Sub1_14.method20382(this);
	}

	@OriginalMember(owner = "client!ov", name = "p", descriptor = "()I", line = 28)
	@Override
	public int method30324() {
		return this.anInt4959;
	}

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "()I", line = 28)
	@Override
	public int method30325() {
		return this.anInt4959;
	}

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "()I", line = 28)
	@Override
	public int method30326() {
		return this.anInt4959;
	}

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "()I", line = 32)
	@Override
	public int method30328() {
		return this.anInt4958;
	}

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "()I", line = 32)
	@Override
	public int method30323() {
		return this.anInt4958;
	}

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "()I", line = 32)
	@Override
	public int method30330() {
		return this.anInt4958;
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "()I", line = 32)
	@Override
	public int method30331() {
		return this.anInt4958;
	}

	@OriginalMember(owner = "client!ov", name = "x", descriptor = "()I", line = 32)
	@Override
	public int method30327() {
		return this.anInt4958;
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "()I", line = 32)
	@Override
	public int method30329() {
		return this.anInt4958;
	}

	@OriginalMember(owner = "client!ov", name = "z", descriptor = "()J", line = 36)
	@Override
	public long method29383() {
		return this.aLong275;
	}

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "()J", line = 36)
	@Override
	public long method29378() {
		return this.aLong275;
	}

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "()J", line = 36)
	@Override
	public long method29379() {
		return this.aLong275;
	}

	@OriginalMember(owner = "client!ov", name = "u", descriptor = "()J", line = 36)
	@Override
	public long method29377() {
		return this.aLong275;
	}

	@OriginalMember(owner = "client!ov", name = "v", descriptor = "()V", line = 40)
	@Override
	public void method30322() {
		if (this.aLong275 != 0L) {
			IUnknown.Release(this.aLong275);
			this.aLong275 = 0L;
		}
		this.aClass86_Sub1_Sub1_14.method20385(this);
	}

	@OriginalMember(owner = "client!ov", name = "r", descriptor = "()V", line = 40)
	@Override
	public void method30321() {
		if (this.aLong275 != 0L) {
			IUnknown.Release(this.aLong275);
			this.aLong275 = 0L;
		}
		this.aClass86_Sub1_Sub1_14.method20385(this);
	}

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "()V", line = 40)
	@Override
	public void method30320() {
		if (this.aLong275 != 0L) {
			IUnknown.Release(this.aLong275);
			this.aLong275 = 0L;
		}
		this.aClass86_Sub1_Sub1_14.method20385(this);
	}

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "()V", line = 40)
	@Override
	public void method30319() {
		if (this.aLong275 != 0L) {
			IUnknown.Release(this.aLong275);
			this.aLong275 = 0L;
		}
		this.aClass86_Sub1_Sub1_14.method20385(this);
	}

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "()V", line = 48)
	@Override
	public void method29382() {
		if (this.aLong275 != 0L) {
			this.aClass86_Sub1_Sub1_14.method19590(this.aLong275);
			this.aLong275 = 0L;
		}
	}

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "()V", line = 48)
	@Override
	public void method29376() {
		if (this.aLong275 != 0L) {
			this.aClass86_Sub1_Sub1_14.method19590(this.aLong275);
			this.aLong275 = 0L;
		}
	}

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "()V", line = 48)
	@Override
	public void method29381() {
		if (this.aLong275 != 0L) {
			this.aClass86_Sub1_Sub1_14.method19590(this.aLong275);
			this.aLong275 = 0L;
		}
	}

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "()V", line = 48)
	@Override
	public void method29380() {
		if (this.aLong275 != 0L) {
			this.aClass86_Sub1_Sub1_14.method19590(this.aLong275);
			this.aLong275 = 0L;
		}
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "()V", line = 48)
	@Override
	public void method29375() {
		if (this.aLong275 != 0L) {
			this.aClass86_Sub1_Sub1_14.method19590(this.aLong275);
			this.aLong275 = 0L;
		}
	}

	@OriginalMember(owner = "client!ov", name = "finalize", descriptor = "()V", line = 55)
	@Override
	void finalize() {
		this.method29376();
	}

	@OriginalMember(owner = "client!ov", name = "hd", descriptor = "()V", line = 55)
	void method29384() {
		this.method29376();
	}

	@OriginalMember(owner = "client!ov", name = "hc", descriptor = "()V", line = 55)
	void method29385() {
		this.method29376();
	}

	@OriginalMember(owner = "client!ov", name = "hp", descriptor = "()V", line = 55)
	void method29386() {
		this.method29376();
	}
}
