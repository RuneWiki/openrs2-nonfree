package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yq")
public class Class673 {

	@OriginalMember(owner = "client!yq", name = "p", descriptor = "Ljava/util/Map;")
	static Map aMap24 = new HashMap();

	@OriginalMember(owner = "client!yq", name = "<init>", descriptor = "()V", line = 10)
	Class673() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yq", name = "y", descriptor = "(Ljava/lang/Class;I)Lclient!yp;", line = 15)
	public static Interface75 method33216(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = aMap24;
		synchronized (aMap24) {
			@Pc(8) Map local8 = (Map) aMap24.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(19) Interface75[] local19 = (Interface75[]) arg0.getEnumConstants();
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					@Pc(29) Interface75 local29 = local19[local21];
					local8.put(local29.method36479(), local29);
				}
				aMap24.put(arg0, local8);
			}
			return (Interface75) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!yq", name = "t", descriptor = "(Ljava/lang/Class;I)Lclient!yp;", line = 15)
	public static Interface75 method33217(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = aMap24;
		synchronized (aMap24) {
			@Pc(8) Map local8 = (Map) aMap24.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(19) Interface75[] local19 = (Interface75[]) arg0.getEnumConstants();
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					@Pc(29) Interface75 local29 = local19[local21];
					local8.put(local29.method36479(), local29);
				}
				aMap24.put(arg0, local8);
			}
			return (Interface75) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!yq", name = "q", descriptor = "(Ljava/lang/Class;I)Lclient!yp;", line = 15)
	public static Interface75 method33218(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = aMap24;
		synchronized (aMap24) {
			@Pc(8) Map local8 = (Map) aMap24.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(19) Interface75[] local19 = (Interface75[]) arg0.getEnumConstants();
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					@Pc(29) Interface75 local29 = local19[local21];
					local8.put(local29.method36479(), local29);
				}
				aMap24.put(arg0, local8);
			}
			return (Interface75) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!yq", name = "w", descriptor = "(Ljava/lang/Class;I)Lclient!yp;", line = 15)
	public static Interface75 method33219(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Map local2 = aMap24;
		synchronized (aMap24) {
			@Pc(8) Map local8 = (Map) aMap24.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(19) Interface75[] local19 = (Interface75[]) arg0.getEnumConstants();
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					@Pc(29) Interface75 local29 = local19[local21];
					local8.put(local29.method36479(), local29);
				}
				aMap24.put(arg0, local8);
			}
			return (Interface75) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!yq", name = "x", descriptor = "(Ljava/lang/Iterable;Lclient!akv;)V", line = 46)
	public static void method33220(@OriginalArg(0) Iterable arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		@Pc(3) int local3 = Class338.method27695(arg0);
		arg1.method22471(local3);
		if (local3 == 0) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local3; local12++) {
			arg1.aByteArray53[local12 + arg1.anInt3089 * 31645619] = 0;
		}
		@Pc(30) Iterator local30 = arg0.iterator();
		while (local30.hasNext()) {
			@Pc(37) Interface75 local37 = (Interface75) local30.next();
			@Pc(40) int local40 = local37.method36479();
			@Pc(44) int local44 = local40 / 8;
			arg1.aByteArray53[arg1.anInt3089 * 31645619 + local44] = (byte) (arg1.aByteArray53[arg1.anInt3089 * 31645619 + local44] | 0x1 << (local40 & 0x7));
		}
		arg1.anInt3089 += local3 * -1387468933;
	}

	@OriginalMember(owner = "client!yq", name = "d", descriptor = "(Ljava/lang/Iterable;Lclient!akv;)V", line = 46)
	public static void method33221(@OriginalArg(0) Iterable arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		@Pc(3) int local3 = Class338.method27695(arg0);
		arg1.method22471(local3);
		if (local3 == 0) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local3; local12++) {
			arg1.aByteArray53[local12 + arg1.anInt3089 * 31645619] = 0;
		}
		@Pc(30) Iterator local30 = arg0.iterator();
		while (local30.hasNext()) {
			@Pc(37) Interface75 local37 = (Interface75) local30.next();
			@Pc(40) int local40 = local37.method36479();
			@Pc(44) int local44 = local40 / 8;
			arg1.aByteArray53[arg1.anInt3089 * 31645619 + local44] = (byte) (arg1.aByteArray53[arg1.anInt3089 * 31645619 + local44] | 0x1 << (local40 & 0x7));
		}
		arg1.anInt3089 += local3 * -1387468933;
	}

	@OriginalMember(owner = "client!yq", name = "s", descriptor = "(Ljava/lang/Iterable;)I", line = 62)
	static int method33222(@OriginalArg(0) Iterable arg0) {
		@Pc(1) int local1 = -1;
		@Pc(4) Iterator local4 = arg0.iterator();
		while (local4.hasNext()) {
			@Pc(11) Interface75 local11 = (Interface75) local4.next();
			if (local11.method36479() > local1) {
				local1 = local11.method36479();
			}
		}
		return (local1 + 8) / 8;
	}

	@OriginalMember(owner = "client!yq", name = "r", descriptor = "(Ljava/lang/Iterable;)I", line = 62)
	static int method33223(@OriginalArg(0) Iterable arg0) {
		@Pc(1) int local1 = -1;
		@Pc(4) Iterator local4 = arg0.iterator();
		while (local4.hasNext()) {
			@Pc(11) Interface75 local11 = (Interface75) local4.next();
			if (local11.method36479() > local1) {
				local1 = local11.method36479();
			}
		}
		return (local1 + 8) / 8;
	}

	@OriginalMember(owner = "client!yq", name = "jp", descriptor = "(IIIIIIII)V", line = 6313)
	static final void method33224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg6 - 334;
		if (local3 < 0) {
			local3 = 0;
		} else if (local3 > 100) {
			local3 = 100;
		}
		@Pc(23) int local23 = local3 * (client.aShort157 - client.aShort156) / 100 + client.aShort156;
		@Pc(29) int local29 = local23 * arg5 >> 8;
		@Pc(35) int local35 = 16384 - arg3 & 0x3FFF;
		@Pc(41) int local41 = 16384 - arg4 & 0x3FFF;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = local29;
		if (local35 != 0) {
			local45 = -local29 * Class436.anIntArray464[local35] >> 14;
			local47 = local29 * Class436.anIntArray463[local35] >> 14;
		}
		if (local41 != 0) {
			local43 = local47 * Class436.anIntArray464[local41] >> 14;
			local47 = Class436.anIntArray463[local41] * local47 >> 14;
		}
		Class96_Sub13.anInt883 = (arg0 - local43) * -2079086379;
		Class672.anInt5796 = (arg1 - local45) * 996845503;
		Class633.anInt5710 = (arg2 - local47) * -866237299;
		Class565.anInt5338 = arg3 * -1539495063;
		Class639.anInt5720 = arg4 * 486346273;
		Class4.anInt17 = 0;
	}
}
