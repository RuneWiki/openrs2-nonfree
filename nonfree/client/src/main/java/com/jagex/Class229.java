package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class229 {

	@OriginalMember(owner = "client!em", name = "r", descriptor = "Lclient!dg;")
	static Class89 aClass89_3;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "Lclient!ajq;")
	Class77_Sub1 aClass77_Sub1_63 = new Class77_Sub1();

	@OriginalMember(owner = "client!em", name = "y", descriptor = "Lclient!zi;")
	Class691 aClass691_12 = new Class691();

	@OriginalMember(owner = "client!em", name = "c", descriptor = "I")
	int anInt3755;

	@OriginalMember(owner = "client!em", name = "v", descriptor = "I")
	int anInt3756;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "Lclient!aak;")
	Class12 aClass12_23;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(I)V", line = 14)
	public Class229(@OriginalArg(0) int arg0) {
		this.anInt3755 = arg0 * -832217417;
		this.anInt3756 = arg0 * 1973169591;
		@Pc(23) int local23;
		for (local23 = 1; local23 + local23 < arg0; local23 += local23) {
		}
		this.aClass12_23 = new Class12(local23);
	}

	@OriginalMember(owner = "client!em", name = "y", descriptor = "(J)Lclient!ajq;", line = 23)
	public Class77_Sub1 method25811(@OriginalArg(0) long arg0) {
		@Pc(5) Class77_Sub1 local5 = (Class77_Sub1) this.aClass12_23.method173(arg0);
		if (local5 != null) {
			this.aClass691_12.method36326(local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!em", name = "l", descriptor = "(J)Lclient!ajq;", line = 23)
	public Class77_Sub1 method25812(@OriginalArg(0) long arg0) {
		@Pc(5) Class77_Sub1 local5 = (Class77_Sub1) this.aClass12_23.method173(arg0);
		if (local5 != null) {
			this.aClass691_12.method36326(local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!em", name = "p", descriptor = "(J)Lclient!ajq;", line = 23)
	public Class77_Sub1 method25813(@OriginalArg(0) long arg0) {
		@Pc(5) Class77_Sub1 local5 = (Class77_Sub1) this.aClass12_23.method173(arg0);
		if (local5 != null) {
			this.aClass691_12.method36326(local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!em", name = "w", descriptor = "(Lclient!ajq;J)V", line = 32)
	public void method25814(@OriginalArg(0) Class77_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3756 * 1830502407 == 0) {
			@Pc(9) Class77_Sub1 local9 = this.aClass691_12.method36331();
			local9.method24063();
			local9.method24069();
			if (local9 == this.aClass77_Sub1_63) {
				local9 = this.aClass691_12.method36331();
				local9.method24063();
				local9.method24069();
			}
		} else {
			this.anInt3756 -= 1973169591;
		}
		this.aClass12_23.method184(arg0, arg1);
		this.aClass691_12.method36326(arg0);
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(Lclient!ajq;J)V", line = 32)
	public void method25815(@OriginalArg(0) Class77_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3756 * 1830502407 == 0) {
			@Pc(9) Class77_Sub1 local9 = this.aClass691_12.method36331();
			local9.method24063();
			local9.method24069();
			if (local9 == this.aClass77_Sub1_63) {
				local9 = this.aClass691_12.method36331();
				local9.method24063();
				local9.method24069();
			}
		} else {
			this.anInt3756 -= 1973169591;
		}
		this.aClass12_23.method184(arg0, arg1);
		this.aClass691_12.method36326(arg0);
	}

	@OriginalMember(owner = "client!em", name = "q", descriptor = "(Lclient!ajq;J)V", line = 32)
	public void method25816(@OriginalArg(0) Class77_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3756 * 1830502407 == 0) {
			@Pc(9) Class77_Sub1 local9 = this.aClass691_12.method36331();
			local9.method24063();
			local9.method24069();
			if (local9 == this.aClass77_Sub1_63) {
				local9 = this.aClass691_12.method36331();
				local9.method24063();
				local9.method24069();
			}
		} else {
			this.anInt3756 -= 1973169591;
		}
		this.aClass12_23.method184(arg0, arg1);
		this.aClass691_12.method36326(arg0);
	}

	@OriginalMember(owner = "client!em", name = "t", descriptor = "(Lclient!ajq;J)V", line = 32)
	public void method25817(@OriginalArg(0) Class77_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3756 * 1830502407 == 0) {
			@Pc(9) Class77_Sub1 local9 = this.aClass691_12.method36331();
			local9.method24063();
			local9.method24069();
			if (local9 == this.aClass77_Sub1_63) {
				local9 = this.aClass691_12.method36331();
				local9.method24063();
				local9.method24069();
			}
		} else {
			this.anInt3756 -= 1973169591;
		}
		this.aClass12_23.method184(arg0, arg1);
		this.aClass691_12.method36326(arg0);
	}

	@OriginalMember(owner = "client!em", name = "v", descriptor = "(I)V", line = 48)
	public void method25818() {
		this.aClass691_12.method36321();
		this.aClass12_23.method188();
		this.aClass77_Sub1_63 = new Class77_Sub1();
		this.anInt3756 = this.anInt3755 * 1909500161;
	}

	@OriginalMember(owner = "client!em", name = "yp", descriptor = "(Lclient!yf;I)V", line = 8966)
	static final void method25819(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class622.aByte173;
	}

	@OriginalMember(owner = "client!em", name = "avr", descriptor = "(Lclient!yf;B)V", line = 13208)
	static final void method25820(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub14_1.method15383() ? 1 : 0;
	}
}
