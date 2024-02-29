package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abv")
public class Class46 implements Interface5 {

	@OriginalMember(owner = "client!abv", name = "p", descriptor = "Ljava/lang/Class;")
	final Class aClass1;

	@OriginalMember(owner = "client!abv", name = "<init>", descriptor = "(Ljava/lang/Class;)V", line = 9)
	public Class46(@OriginalArg(0) Class arg0) {
		this.aClass1 = arg0;
	}

	@OriginalMember(owner = "client!abv", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 15)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		try {
			@Pc(4) Interface12 local4 = (Interface12) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface6) local4).method32874(arg0);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!abv", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 15)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		try {
			@Pc(4) Interface12 local4 = (Interface12) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface6) local4).method32874(arg0);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!abv", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 15)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		try {
			@Pc(4) Interface12 local4 = (Interface12) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface6) local4).method32874(arg0);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!abv", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 15)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		try {
			@Pc(4) Interface12 local4 = (Interface12) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface6) local4).method32874(arg0);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!abv", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 15)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		try {
			@Pc(4) Interface12 local4 = (Interface12) this.aClass1.getDeclaredConstructor().newInstance();
			((Interface6) local4).method32874(arg0);
			return local4;
		} catch (@Pc(12) Exception local12) {
			local12.printStackTrace();
			return null;
		}
	}

	@OriginalMember(owner = "client!abv", name = "i", descriptor = "()Ljava/lang/Class;", line = 26)
	@Override
	public Class method27824() {
		return this.aClass1;
	}

	@OriginalMember(owner = "client!abv", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 26)
	@Override
	public Class method27822() {
		return this.aClass1;
	}

	@OriginalMember(owner = "client!abv", name = "fj", descriptor = "(Lclient!yf;B)V", line = 5503)
	static final void method737(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class344.method27816(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!abv", name = "iv", descriptor = "(IIIIIIB)V", line = 5598)
	static final void method738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class73[] local1 = client.aClass73Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class73 local11 = local1[local3];
			if (local11 != null && local11.anInt215 * 652406965 == 2) {
				Class196.method25466(local11.anInt209 * 1440315947, local11.anInt210 * 487170425, local11.anInt211 * 631467137, 0, local11.anInt212 * 440583934, false, false);
				if (client.aFloatArray96[0] > -1.0F && client.anInt3414 % 20 < 10) {
					@Pc(60) Class83 local60 = Class515.aClass83Array8[local11.anInt216 * -1562758755];
					@Pc(70) int local70 = (int) (client.aFloatArray96[0] + (float) arg0 - 12.0F);
					@Pc(80) int local80 = (int) (client.aFloatArray96[1] + (float) arg1 - 28.0F);
					local60.method18123(local70, local80);
				}
			}
		}
	}
}
