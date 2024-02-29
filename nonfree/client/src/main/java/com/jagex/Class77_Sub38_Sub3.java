package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arv")
public class Class77_Sub38_Sub3 extends Class77_Sub38 {

	@OriginalMember(owner = "client!arv", name = "w", descriptor = "Lclient!yv;")
	final Class678 aClass678_1;

	@OriginalMember(owner = "client!arv", name = "<init>", descriptor = "(IILclient!yv;)V", line = 12)
	public Class77_Sub38_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class678 arg2) {
		super(arg0, arg1);
		this.aClass678_1 = arg2;
	}

	@OriginalMember(owner = "client!arv", name = "c", descriptor = "()Z", line = 17)
	@Override
	public boolean method22852() {
		@Pc(4) Interface61 local4 = this.aClass678_1.method36021();
		if (local4 == null) {
			return false;
		} else {
			Class681.method36082(Class135.aClass135_39, this.anInt3113 * 1225863589, -1, local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!arv", name = "p", descriptor = "(B)Z", line = 17)
	@Override
	public boolean method22851() {
		@Pc(4) Interface61 local4 = this.aClass678_1.method36021();
		if (local4 == null) {
			return false;
		} else {
			Class681.method36082(Class135.aClass135_39, this.anInt3113 * 1225863589, -1, local4);
			return true;
		}
	}
}
