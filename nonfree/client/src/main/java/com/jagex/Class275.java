package com.jagex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class275 {

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "J")
	public static final long aLong251 = 60000L;

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "J")
	public static final long aLong252 = 1000L;

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "Ljava/util/Map;")
	static Map aMap16;

	@OriginalMember(owner = "client!gk", name = "bd", descriptor = "Lclient!cy;")
	public static Class83 aClass83_25;

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "Ljava/util/HashMap;")
	static final HashMap aHashMap9 = new HashMap();

	static {
		Calendar.getInstance(method26561("Europe/London"));
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 20)
	Class275() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;", line = 25)
	public static String method26551(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1) {
		return method26554(arg0, arg1, method26557(), Class667.aClass667_6);
	}

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "(Ljava/util/Date;Ljava/lang/String;B)Ljava/lang/String;", line = 25)
	public static String method26552(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1) {
		return method26554(arg0, arg1, method26557(), Class667.aClass667_6);
	}

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lclient!yi;)Ljava/lang/String;", line = 29)
	static String method26553(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1, @OriginalArg(2) TimeZone arg2, @OriginalArg(3) Class667 arg3) {
		if (aMap16 == null) {
			aMap16 = new HashMap(7);
			@Pc(10) Class667[] local10 = Class667.method33145();
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				@Pc(20) Class667 local20 = local10[local12];
				aMap16.put(local20, new ConcurrentLinkedQueue());
			}
		}
		@Pc(34) ConcurrentLinkedQueue local34 = (ConcurrentLinkedQueue) aMap16.get(arg3);
		@Pc(38) SimpleDateFormat local38 = (SimpleDateFormat) local34.poll();
		if (local38 == null) {
			local38 = new SimpleDateFormat(arg1, arg3.method33151());
		} else {
			local38.applyPattern(arg1);
		}
		local38.setTimeZone(arg2);
		@Pc(60) String local60 = local38.format(arg0);
		local34.add(local38);
		return local60;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lclient!yi;I)Ljava/lang/String;", line = 29)
	static String method26554(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1, @OriginalArg(2) TimeZone arg2, @OriginalArg(3) Class667 arg3) {
		if (aMap16 == null) {
			aMap16 = new HashMap(7);
			@Pc(10) Class667[] local10 = Class667.method33145();
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				@Pc(20) Class667 local20 = local10[local12];
				aMap16.put(local20, new ConcurrentLinkedQueue());
			}
		}
		@Pc(34) ConcurrentLinkedQueue local34 = (ConcurrentLinkedQueue) aMap16.get(arg3);
		@Pc(38) SimpleDateFormat local38 = (SimpleDateFormat) local34.poll();
		if (local38 == null) {
			local38 = new SimpleDateFormat(arg1, arg3.method33151());
		} else {
			local38.applyPattern(arg1);
		}
		local38.setTimeZone(arg2);
		@Pc(60) String local60 = local38.format(arg0);
		local34.add(local38);
		return local60;
	}

	@OriginalMember(owner = "client!gk", name = "t", descriptor = "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lclient!yi;)Ljava/lang/String;", line = 29)
	static String method26555(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1, @OriginalArg(2) TimeZone arg2, @OriginalArg(3) Class667 arg3) {
		if (aMap16 == null) {
			aMap16 = new HashMap(7);
			@Pc(10) Class667[] local10 = Class667.method33145();
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				@Pc(20) Class667 local20 = local10[local12];
				aMap16.put(local20, new ConcurrentLinkedQueue());
			}
		}
		@Pc(34) ConcurrentLinkedQueue local34 = (ConcurrentLinkedQueue) aMap16.get(arg3);
		@Pc(38) SimpleDateFormat local38 = (SimpleDateFormat) local34.poll();
		if (local38 == null) {
			local38 = new SimpleDateFormat(arg1, arg3.method33151());
		} else {
			local38.applyPattern(arg1);
		}
		local38.setTimeZone(arg2);
		@Pc(60) String local60 = local38.format(arg0);
		local34.add(local38);
		return local60;
	}

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lclient!yi;)Ljava/lang/String;", line = 29)
	static String method26556(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1, @OriginalArg(2) TimeZone arg2, @OriginalArg(3) Class667 arg3) {
		if (aMap16 == null) {
			aMap16 = new HashMap(7);
			@Pc(10) Class667[] local10 = Class667.method33145();
			for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
				@Pc(20) Class667 local20 = local10[local12];
				aMap16.put(local20, new ConcurrentLinkedQueue());
			}
		}
		@Pc(34) ConcurrentLinkedQueue local34 = (ConcurrentLinkedQueue) aMap16.get(arg3);
		@Pc(38) SimpleDateFormat local38 = (SimpleDateFormat) local34.poll();
		if (local38 == null) {
			local38 = new SimpleDateFormat(arg1, arg3.method33151());
		} else {
			local38.applyPattern(arg1);
		}
		local38.setTimeZone(arg2);
		@Pc(60) String local60 = local38.format(arg0);
		local34.add(local38);
		return local60;
	}

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "(I)Ljava/util/TimeZone;", line = 52)
	static TimeZone method26557() {
		return method26561("Europe/London");
	}

	@OriginalMember(owner = "client!gk", name = "x", descriptor = "()Ljava/util/TimeZone;", line = 52)
	static TimeZone method26558() {
		return method26561("Europe/London");
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "()Ljava/util/TimeZone;", line = 52)
	static TimeZone method26559() {
		return method26561("Europe/London");
	}

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;", line = 56)
	static TimeZone method26560(@OriginalArg(0) String arg0) {
		@Pc(2) HashMap local2 = aHashMap9;
		synchronized (aHashMap9) {
			@Pc(8) TimeZone local8 = (TimeZone) aHashMap9.get(arg0);
			if (local8 == null) {
				local8 = TimeZone.getTimeZone(arg0);
				aHashMap9.put(arg0, local8);
			}
			return local8;
		}
	}

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "(Ljava/lang/String;B)Ljava/util/TimeZone;", line = 56)
	static TimeZone method26561(@OriginalArg(0) String arg0) {
		@Pc(2) HashMap local2 = aHashMap9;
		synchronized (aHashMap9) {
			@Pc(8) TimeZone local8 = (TimeZone) aHashMap9.get(arg0);
			if (local8 == null) {
				local8 = TimeZone.getTimeZone(arg0);
				aHashMap9.put(arg0, local8);
			}
			return local8;
		}
	}

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "(Lclient!ako;III)V", line = 224)
	static void method26562(@OriginalArg(0) Class39_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.method14300(arg1);
		@Pc(10) byte local10;
		if (arg2 > 100000) {
			Class368.method28211();
			local10 = 4;
		} else if (arg2 > 50000) {
			Class471.method29623();
			local10 = 3;
		} else if (arg2 > 10000) {
			Class660.method33074();
			local10 = 2;
		} else {
			Class261.method26280();
			local10 = 1;
		}
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == arg1) {
			Class35_Sub6.aClass77_Sub35_45.method14383(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1, true);
		} else {
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2, arg1);
			Class533.method30776(arg1, false);
		}
		Class667.method33150();
		arg0.method14293(local10);
	}

	@OriginalMember(owner = "client!gk", name = "fz", descriptor = "(Lclient!yf;I)V", line = 5456)
	static final void method26563(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class670.method33196(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!gk", name = "kt", descriptor = "(Lclient!yf;B)V", line = 6455)
	static final void method26564(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		Class458.method29498(local11, arg0);
	}

	@OriginalMember(owner = "client!gk", name = "awa", descriptor = "(Lclient!yf;I)V", line = 13328)
	static final void method26565(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method16264(local12);
	}
}
