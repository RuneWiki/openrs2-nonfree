package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ars")
public class Class77_Sub38_Sub1 extends Class77_Sub38 {

	@OriginalMember(owner = "client!ars", name = "w", descriptor = "I")
	final int anInt3107;

	@OriginalMember(owner = "client!ars", name = "<init>", descriptor = "(III)V", line = 12)
	public Class77_Sub38_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg1);
		this.anInt3107 = arg2 * -904677305;
	}

	@OriginalMember(owner = "client!ars", name = "p", descriptor = "(B)Z", line = 17)
	@Override
	public boolean method22851() {
		@Pc(6) Class104_Sub1_Sub1_Sub1_Sub2 local6 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[this.anInt3107 * -1668124297];
		if (local6 == null) {
			return false;
		} else {
			Class214.method25636(Class135.aClass135_27, this.anInt3113 * 1225863589, -1, local6, this.anInt3107 * -1668124297);
			return true;
		}
	}

	@OriginalMember(owner = "client!ars", name = "c", descriptor = "()Z", line = 17)
	@Override
	public boolean method22852() {
		@Pc(6) Class104_Sub1_Sub1_Sub1_Sub2 local6 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[this.anInt3107 * -1668124297];
		if (local6 == null) {
			return false;
		} else {
			Class214.method25636(Class135.aClass135_27, this.anInt3113 * 1225863589, -1, local6, this.anInt3107 * -1668124297);
			return true;
		}
	}
}
