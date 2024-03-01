package com.jagex;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class285 {

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "J")
	public static final long aLong249 = 60000L;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "J")
	public static final long aLong250 = 1000L;

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "J")
	static final long aLong251 = 86400000L;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	static final int anInt3898 = 11745;

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Ljava/util/Map;")
	static Map aMap20;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Ljava/util/HashMap;")
	static final HashMap aHashMap9 = new HashMap();

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Ljava/util/Calendar;")
	static final Calendar aCalendar4 = Calendar.getInstance(method26491("Europe/London"));

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V", line = 19)
	Class285() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;", line = 24)
	public static String method26496(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1) {
		return method26489(arg0, arg1, method26490(), Class717.aClass717_15);
	}

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;", line = 24)
	public static String method26497(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1) {
		return method26489(arg0, arg1, method26490(), Class717.aClass717_15);
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(Ljava/util/Date;Ljava/lang/String;I)Ljava/lang/String;", line = 24)
	public static String method26512(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1) {
		return method26489(arg0, arg1, method26490(), Class717.aClass717_15);
	}

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lclient!zt;I)Ljava/lang/String;", line = 28)
	static String method26489(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1, @OriginalArg(2) TimeZone arg2, @OriginalArg(3) Class717 arg3) {
		if (aMap20 == null) {
			aMap20 = new HashMap(7);
			@Pc(9) Class717[] local9 = Class717.method36886();
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				@Pc(19) Class717 local19 = local9[local11];
				aMap20.put(local19, new ConcurrentLinkedQueue());
			}
		}
		@Pc(33) ConcurrentLinkedQueue local33 = (ConcurrentLinkedQueue) aMap20.get(arg3);
		@Pc(37) SimpleDateFormat local37 = (SimpleDateFormat) local33.poll();
		if (local37 == null) {
			local37 = new SimpleDateFormat(arg1, arg3.method36889());
		} else {
			local37.applyPattern(arg1);
		}
		local37.setTimeZone(arg2);
		@Pc(58) String local58 = local37.format(arg0);
		local33.add(local37);
		return local58;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lclient!zt;)Ljava/lang/String;", line = 28)
	static String method26498(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1, @OriginalArg(2) TimeZone arg2, @OriginalArg(3) Class717 arg3) {
		if (aMap20 == null) {
			aMap20 = new HashMap(7);
			@Pc(9) Class717[] local9 = Class717.method36886();
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				@Pc(19) Class717 local19 = local9[local11];
				aMap20.put(local19, new ConcurrentLinkedQueue());
			}
		}
		@Pc(33) ConcurrentLinkedQueue local33 = (ConcurrentLinkedQueue) aMap20.get(arg3);
		@Pc(37) SimpleDateFormat local37 = (SimpleDateFormat) local33.poll();
		if (local37 == null) {
			local37 = new SimpleDateFormat(arg1, arg3.method36889());
		} else {
			local37.applyPattern(arg1);
		}
		local37.setTimeZone(arg2);
		@Pc(58) String local58 = local37.format(arg0);
		local33.add(local37);
		return local58;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lclient!zt;)Ljava/lang/String;", line = 28)
	static String method26499(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1, @OriginalArg(2) TimeZone arg2, @OriginalArg(3) Class717 arg3) {
		if (aMap20 == null) {
			aMap20 = new HashMap(7);
			@Pc(9) Class717[] local9 = Class717.method36886();
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				@Pc(19) Class717 local19 = local9[local11];
				aMap20.put(local19, new ConcurrentLinkedQueue());
			}
		}
		@Pc(33) ConcurrentLinkedQueue local33 = (ConcurrentLinkedQueue) aMap20.get(arg3);
		@Pc(37) SimpleDateFormat local37 = (SimpleDateFormat) local33.poll();
		if (local37 == null) {
			local37 = new SimpleDateFormat(arg1, arg3.method36889());
		} else {
			local37.applyPattern(arg1);
		}
		local37.setTimeZone(arg2);
		@Pc(58) String local58 = local37.format(arg0);
		local33.add(local37);
		return local58;
	}

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lclient!zt;)Ljava/lang/String;", line = 28)
	static String method26501(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1, @OriginalArg(2) TimeZone arg2, @OriginalArg(3) Class717 arg3) {
		if (aMap20 == null) {
			aMap20 = new HashMap(7);
			@Pc(9) Class717[] local9 = Class717.method36886();
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				@Pc(19) Class717 local19 = local9[local11];
				aMap20.put(local19, new ConcurrentLinkedQueue());
			}
		}
		@Pc(33) ConcurrentLinkedQueue local33 = (ConcurrentLinkedQueue) aMap20.get(arg3);
		@Pc(37) SimpleDateFormat local37 = (SimpleDateFormat) local33.poll();
		if (local37 == null) {
			local37 = new SimpleDateFormat(arg1, arg3.method36889());
		} else {
			local37.applyPattern(arg1);
		}
		local37.setTimeZone(arg2);
		@Pc(58) String local58 = local37.format(arg0);
		local33.add(local37);
		return local58;
	}

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "(I)Ljava/util/TimeZone;", line = 51)
	static TimeZone method26490() {
		return method26491("Europe/London");
	}

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "()Ljava/util/TimeZone;", line = 51)
	static TimeZone method26506() {
		return method26491("Europe/London");
	}

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "(Ljava/lang/String;B)Ljava/util/TimeZone;", line = 55)
	static TimeZone method26491(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;", line = 55)
	static TimeZone method26502(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;", line = 55)
	static TimeZone method26503(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;", line = 55)
	static TimeZone method26508(@OriginalArg(0) String arg0) {
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

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;I)I", line = 66)
	public static int method26492(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(1);
		}
	}

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I", line = 66)
	public static int method26504(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(1);
		}
	}

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I", line = 66)
	public static int method26505(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(1);
		}
	}

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;I)I", line = 74)
	public static int method26488(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(2) + 1;
		}
	}

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I", line = 74)
	public static int method26494(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(2) + 1;
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I", line = 74)
	public static int method26507(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(2) + 1;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I", line = 74)
	public static int method26509(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(2) + 1;
		}
	}

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;I)I", line = 82)
	public static int method26493(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(5);
		}
	}

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(Ljava/util/Date;Ljava/util/TimeZone;)I", line = 82)
	public static int method26510(@OriginalArg(0) Date arg0, @OriginalArg(1) TimeZone arg1) {
		@Pc(2) Calendar local2 = aCalendar4;
		synchronized (aCalendar4) {
			aCalendar4.setTimeZone(arg1);
			aCalendar4.setTime(arg0);
			return aCalendar4.get(5);
		}
	}

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "(II)Ljava/util/Date;", line = 90)
	public static Date method26495(@OriginalArg(0) int arg0) {
		return new Date((long) (arg0 + 11745) * 86400000L);
	}

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "(I)Ljava/util/Date;", line = 90)
	public static Date method26500(@OriginalArg(0) int arg0) {
		return new Date((long) (arg0 + 11745) * 86400000L);
	}

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "(I)Ljava/util/Date;", line = 90)
	public static Date method26511(@OriginalArg(0) int arg0) {
		return new Date((long) (arg0 + 11745) * 86400000L);
	}

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "(I)V", line = 113)
	public static void method26513() {
		Class431.method28774();
		Class655.aClass163_Sub2_1.method14922();
		Class655.aClass163_Sub1_1.method14922();
		@Pc(17) Class93_Sub22 local17;
		@Pc(26) int local26;
		if (client.anInt3450 * -938319179 > 0) {
			local17 = Class102.method2592(Class446.aClass446_89, client.aClass175_2.aClass24_2);
			local17.aClass93_Sub41_Sub2_1.method22454(client.anInt3450 * 541690580);
			for (local26 = 0; local26 < client.anInt3450 * -938319179; local26++) {
				@Pc(35) Interface66 local35 = client.anInterface66Array1[local26];
				@Pc(43) long local43 = local35.method13688() - Class655.aLong299 * -4327737356022789177L;
				if (local43 > 16777215L) {
					local43 = 16777215L;
				}
				Class655.aLong299 = local35.method13688() * -2492000195029924361L;
				local17.aClass93_Sub41_Sub2_1.method22510(local35.method13696());
				local17.aClass93_Sub41_Sub2_1.method22394((int) local43);
			}
			client.aClass175_2.method24351(local17);
		}
		if (Class655.anInt5808 * 660178843 > 0) {
			Class655.anInt5808 -= 1066698387;
		}
		if (client.aBoolean619 && Class655.anInt5808 * 660178843 <= 0) {
			Class655.anInt5808 = -140868740;
			client.aBoolean619 = false;
			@Pc(114) int local114;
			if (Class429.anInt4781 * -1453926679 != 3) {
				local114 = (int) client.aFloat256 >> 3;
				local26 = (int) client.aFloat253 >> 3;
			} else if (Class65.aClass123_Sub1_2.method9023() == Class342.aClass342_3) {
				@Pc(107) Class124_Sub1 local107 = (Class124_Sub1) Class65.aClass123_Sub1_2.method8952();
				local114 = Class155.method15307(local107.aClass471_1) >> 3;
				@Pc(116) short local116 = 1024;
				local26 = (local116 * 3 - (Class230.method25652(local107.aClass471_1) >> 3)) % (local116 * 2);
			} else {
				local114 = 0;
				local26 = 0;
			}
			@Pc(153) Class93_Sub22 local153 = Class102.method2592(Class446.aClass446_39, client.aClass175_2.aClass24_2);
			local153.aClass93_Sub41_Sub2_1.method22456(local26);
			local153.aClass93_Sub41_Sub2_1.method22454(local114);
			client.aClass175_2.method24351(local153);
		}
		if (Class20.aBoolean10 != Class655.aBoolean861) {
			Class655.aBoolean861 = Class20.aBoolean10;
			local17 = Class102.method2592(Class446.aClass446_95, client.aClass175_2.aClass24_2);
			local17.aClass93_Sub41_Sub2_1.method22510(Class20.aBoolean10 ? 1 : 0);
			client.aClass175_2.method24351(local17);
		}
		if (!client.aBoolean601) {
			local17 = Class102.method2592(Class446.aClass446_19, client.aClass175_2.aClass24_2);
			local17.aClass93_Sub41_Sub2_1.method22510(0);
			local26 = local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
			@Pc(214) Class93_Sub41 local214 = Class51.aClass93_Sub36_1.method14356();
			local17.aClass93_Sub41_Sub2_1.method22405(local214.aByteArray58, 0, local214.anInt3070 * 212851357);
			local17.aClass93_Sub41_Sub2_1.method22537(local17.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local26);
			client.aClass175_2.method24351(local17);
			client.aBoolean601 = true;
		}
		if (client.aBoolean602 || Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15424() != 1) {
			return;
		}
		@Pc(253) int[] local253 = Class694.aClass104_14.method20712();
		@Pc(259) Class93_Sub22 local259 = Class102.method2592(Class446.aClass446_111, client.aClass175_2.aClass24_2);
		local259.aClass93_Sub41_Sub2_1.method22454(0);
		@Pc(270) int local270 = local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		if (local253 == null || local253.length == 0) {
			local259.aClass93_Sub41_Sub2_1.method22510(0);
		} else {
			local259.aClass93_Sub41_Sub2_1.method22510(1);
			@Pc(284) Class184[] local284 = Class184.method24580();
			@Pc(288) HashSet local288 = new HashSet();
			@Pc(292) ArrayList local292 = new ArrayList();
			@Pc(294) int local294 = 0;
			label94: while (true) {
				if (local294 >= local253.length) {
					Class281.method26463(local288, local259.aClass93_Sub41_Sub2_1);
					local259.aClass93_Sub41_Sub2_1.method22652(local292.size());
					if (local292.size() <= 0) {
						break;
					}
					local294 = Integer.MAX_VALUE;
					@Pc(355) Iterator local355 = local292.iterator();
					@Pc(362) Integer local362;
					while (local355.hasNext()) {
						local362 = (Integer) local355.next();
						if (local362 < local294) {
							local294 = local362;
						}
					}
					local259.aClass93_Sub41_Sub2_1.method22411(local294);
					local355 = local292.iterator();
					while (true) {
						if (!local355.hasNext()) {
							break label94;
						}
						local362 = (Integer) local355.next();
						if (local362 != local294) {
							local259.aClass93_Sub41_Sub2_1.method22411(local362 - local294);
						}
					}
				}
				@Pc(300) boolean local300 = false;
				for (@Pc(302) int local302 = 0; local302 < local284.length; local302++) {
					if (local284[local302].anInt3333 == local253[local294]) {
						local288.add(local284[local302]);
						local300 = true;
						break;
					}
				}
				if (!local300) {
					local292.add(local253[local294]);
				}
				local294++;
			}
		}
		local259.aClass93_Sub41_Sub2_1.method22407(local259.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local270);
		client.aClass175_2.method24351(local259);
		client.aBoolean602 = true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!hf;Lclient!ch;IIIIILjava/lang/String;Lclient!eu;Lclient!aac;II)V", line = 846)
	static void method26519(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) Class106 arg8, @OriginalArg(9) Class5 arg9, @OriginalArg(10) int arg10) {
		@Pc(18) int local18;
		if (Class429.anInt4781 * -1453926679 == 3) {
			local18 = (int) ((double) Class65.aClass123_Sub1_2.method8962() * 2607.5945876176133D) + client.anInt3477 * -1357343303 & 0x3FFF;
		} else if (Class429.anInt4781 * -1453926679 == 4) {
			local18 = (int) client.aFloat253 & 0x3FFF;
		} else {
			local18 = client.anInt3477 * -1357343303 + (int) client.aFloat253 & 0x3FFF;
		}
		@Pc(55) int local55 = Math.max(arg0.anInt3981 * 1215292027 / 2, arg0.anInt3982 * -1490598249 / 2) + 10;
		@Pc(63) int local63 = arg4 * arg4 + arg5 * arg5;
		if (local63 > local55 * local55) {
			return;
		}
		@Pc(73) int local73 = Class464.anIntArray451[local18];
		@Pc(77) int local77 = Class464.anIntArray452[local18];
		if (Class429.anInt4781 * -1453926679 != 4) {
			local73 = local73 * 256 / (client.anInt3478 * 663566609 + 256);
			local77 = local77 * 256 / (client.anInt3478 * 663566609 + 256);
		}
		@Pc(112) int local112 = arg4 * local77 + arg5 * local73 >> 14;
		@Pc(122) int local122 = arg5 * local77 - arg4 * local73 >> 14;
		@Pc(129) int local129 = arg9.method55(arg7, 100, null);
		@Pc(137) int local137 = arg9.method49(arg7, 100, 0, null);
		@Pc(143) int local143 = local112 - local129 / 2;
		if (local143 >= -(arg0.anInt3981 * 1215292027) && local143 <= arg0.anInt3981 * 1215292027 && local122 >= -(arg0.anInt3982 * -1490598249) && local122 <= arg0.anInt3982 * -1490598249) {
			arg8.method7563(arg7, arg0.anInt3981 * 1215292027 / 2 + local143 + arg2, arg0.anInt3982 * -1490598249 / 2 + arg3 - local122 - arg6 - local137, local129, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!gd", name = "fw", descriptor = "(I)V", line = 2523)
	static final void method26517() {
		client.anInt3462 = -654237073;
		client.anInt3463 = 1167039939;
		Class36.aClass93_Sub41_1 = null;
		Class287.method26541();
	}

	@OriginalMember(owner = "client!gd", name = "ga", descriptor = "(B)V", line = 3628)
	public static final void method26518() {
		if (!client.aBoolean618) {
			client.aFloat255 += (12.0F - client.aFloat255) / 2.0F;
			client.aBoolean619 = true;
			client.aBoolean618 = true;
		}
	}

	@OriginalMember(owner = "client!gd", name = "ry", descriptor = "(Lclient!yf;B)V", line = 8095)
	static final void method26514(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class375.method28041(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!gd", name = "xu", descriptor = "(Lclient!yf;I)V", line = 9126)
	static final void method26515(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local12 >> 14 & 0x3FFF;
	}

	@OriginalMember(owner = "client!gd", name = "azy", descriptor = "(Lclient!yf;B)V", line = 14181)
	static final void method26516(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub2_1.method15373() ? 1 : 0;
	}
}
