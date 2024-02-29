package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!art")
public class Class77_Sub38_Sub2 extends Class77_Sub38 {

	@OriginalMember(owner = "client!art", name = "w", descriptor = "I")
	final int anInt3110;

	@OriginalMember(owner = "client!art", name = "<init>", descriptor = "(III)V", line = 13)
	public Class77_Sub38_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1);
		this.anInt3110 = arg2 * 803089009;
	}

	@OriginalMember(owner = "client!art", name = "c", descriptor = "()Z", line = 18)
	@Override
	public boolean method22852() {
		@Pc(8) Class77_Sub6 local8 = (Class77_Sub6) client.aClass12_22.method173((long) (this.anInt3110 * -1285007727));
		if (local8 == null) {
			return false;
		} else {
			Class214.method25636(Class135.aClass135_37, this.anInt3113 * 1225863589, -1, (Class104_Sub1_Sub1_Sub1) local8.anObject5, this.anInt3110 * -1285007727);
			return true;
		}
	}

	@OriginalMember(owner = "client!art", name = "p", descriptor = "(B)Z", line = 18)
	@Override
	public boolean method22851() {
		@Pc(8) Class77_Sub6 local8 = (Class77_Sub6) client.aClass12_22.method173((long) (this.anInt3110 * -1285007727));
		if (local8 == null) {
			return false;
		} else {
			Class214.method25636(Class135.aClass135_37, this.anInt3113 * 1225863589, -1, (Class104_Sub1_Sub1_Sub1) local8.anObject5, this.anInt3110 * -1285007727);
			return true;
		}
	}

	@OriginalMember(owner = "client!art", name = "r", descriptor = "(II)I", line = 83)
	public static int method22788(@OriginalArg(0) int arg0) {
		@Pc(5) Class77_Sub1_Sub14 local5 = (Class77_Sub1_Sub14) Class304.aClass12_31.method173((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (local5.aClass77_Sub1_62 == Class304.aClass691_14.aClass77_Sub1_66) {
			return -1;
		} else {
			return ((Class77_Sub1_Sub14) local5.aClass77_Sub1_62).anInt3043 * -759944081;
		}
	}
}
