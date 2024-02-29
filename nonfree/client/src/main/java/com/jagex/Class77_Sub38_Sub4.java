package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arx")
public class Class77_Sub38_Sub4 extends Class77_Sub38 {

	@OriginalMember(owner = "client!arx", name = "w", descriptor = "Lclient!yo;")
	final Class672 aClass672_1;

	@OriginalMember(owner = "client!arx", name = "<init>", descriptor = "(IILclient!yo;)V", line = 12)
	public Class77_Sub38_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class672 arg2) {
		super(arg0, arg1);
		this.aClass672_1 = arg2;
	}

	@OriginalMember(owner = "client!arx", name = "p", descriptor = "(B)Z", line = 17)
	@Override
	public boolean method22851() {
		@Pc(4) Class104_Sub1_Sub5_Sub1 local4 = this.aClass672_1.method33208();
		if (local4 == null) {
			return false;
		} else {
			Class293.method27015(Class135.aClass135_40, this.anInt3113 * 1225863589, -1, this.aClass672_1, local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!arx", name = "c", descriptor = "()Z", line = 17)
	@Override
	public boolean method22852() {
		@Pc(4) Class104_Sub1_Sub5_Sub1 local4 = this.aClass672_1.method33208();
		if (local4 == null) {
			return false;
		} else {
			Class293.method27015(Class135.aClass135_40, this.anInt3113 * 1225863589, -1, this.aClass672_1, local4);
			return true;
		}
	}
}
