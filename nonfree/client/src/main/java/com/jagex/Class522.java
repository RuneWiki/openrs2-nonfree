package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public class Class522 {

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "Ljava/util/Map;")
	static Map aMap14 = new HashMap();

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 9)
	Class522() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(Ljava/lang/Class;I)Lclient!vm;", line = 14)
	public static Interface56 method29813(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = aMap14;
		synchronized (aMap14) {
			@Pc(8) Map local8 = (Map) aMap14.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(20) Interface56[] local20 = (Interface56[]) arg0.getEnumConstants();
				for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
					@Pc(30) Interface56 local30 = local20[local22];
					local8.put(local30.method33765(), local30);
				}
				aMap14.put(arg0, local8);
			}
			return (Interface56) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "(Ljava/lang/Class;I)Lclient!vm;", line = 14)
	public static Interface56 method29814(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = aMap14;
		synchronized (aMap14) {
			@Pc(8) Map local8 = (Map) aMap14.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(20) Interface56[] local20 = (Interface56[]) arg0.getEnumConstants();
				for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
					@Pc(30) Interface56 local30 = local20[local22];
					local8.put(local30.method33765(), local30);
				}
				aMap14.put(arg0, local8);
			}
			return (Interface56) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "(Ljava/lang/Class;I)Lclient!vm;", line = 14)
	public static Interface56 method29815(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = aMap14;
		synchronized (aMap14) {
			@Pc(8) Map local8 = (Map) aMap14.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(20) Interface56[] local20 = (Interface56[]) arg0.getEnumConstants();
				for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
					@Pc(30) Interface56 local30 = local20[local22];
					local8.put(local30.method33765(), local30);
				}
				aMap14.put(arg0, local8);
			}
			return (Interface56) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "(B)Z", line = 19)
	public static boolean method29819() {
		try {
			if (!IcmpService_Sub1.available()) {
				return false;
			}
		} catch (@Pc(5) Throwable local5) {
			return false;
		}
		if (IcmpService_Sub1.anIcmpService_Sub1_1 != null) {
			throw new IllegalStateException("");
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = new IcmpService_Sub1();
		@Pc(26) Thread local26 = new Thread(new Class504());
		local26.setDaemon(true);
		local26.start();
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "s", descriptor = "([Lclient!vm;I)Lclient!vm;", line = 33)
	public static Interface56 method29812(@OriginalArg(0) Interface56[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Interface56[] local1 = arg0;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Interface56 local11 = local1[local3];
			if (arg1 == local11.method33765()) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "([Lclient!vm;I)Lclient!vm;", line = 33)
	public static Interface56 method29816(@OriginalArg(0) Interface56[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Interface56[] local1 = arg0;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Interface56 local11 = local1[local3];
			if (arg1 == local11.method33765()) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "([Lclient!vm;I)Lclient!vm;", line = 33)
	public static Interface56 method29817(@OriginalArg(0) Interface56[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Interface56[] local1 = arg0;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Interface56 local11 = local1[local3];
			if (arg1 == local11.method33765()) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vc", name = "na", descriptor = "(Lclient!vs;I)V", line = 6602)
	static final void method29818(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class183.method23690(local16, local22, arg0);
	}
}
