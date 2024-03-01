package com.jagex;

import java.io.File;
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

@OriginalClass("client!fp")
public final class Class179 {

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "Ljava/util/Map;")
	static Map aMap8;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "J")
	public static final long aLong240 = 1000L;

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "[I")
	public static int[] anIntArray372;

	@OriginalMember(owner = "client!fp", name = "dg", descriptor = "Lclient!amh;")
	static Class3_Sub1_Sub4 aClass3_Sub1_Sub4_3;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "Ljava/util/HashMap;")
	static final HashMap aHashMap5 = new HashMap();

	static {
		Calendar.getInstance(method23523("Europe/London"));
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V", line = 19)
	Class179() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!ny;II)Lclient!yx;", line = 23)
	public static Class611 method23534(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte[] local4 = arg0.method26705(arg1);
		return local4 == null ? null : new Class611(local4);
	}

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "(Ljava/util/Date;Ljava/lang/String;I)Ljava/lang/String;", line = 24)
	public static String method23520(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1) {
		return method23521(arg0, arg1, method23522(), Class530.aClass530_9);
	}

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;", line = 24)
	public static String method23524(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1) {
		return method23521(arg0, arg1, method23522(), Class530.aClass530_9);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lclient!vk;I)Ljava/lang/String;", line = 28)
	static String method23521(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1, @OriginalArg(2) TimeZone arg2, @OriginalArg(3) Class530 arg3) {
		if (aMap8 == null) {
			aMap8 = new HashMap(7);
			@Pc(9) Class530[] local9 = Class530.method32466();
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				@Pc(19) Class530 local19 = local9[local11];
				aMap8.put(local19, new ConcurrentLinkedQueue());
			}
		}
		@Pc(33) ConcurrentLinkedQueue local33 = (ConcurrentLinkedQueue) aMap8.get(arg3);
		@Pc(37) SimpleDateFormat local37 = (SimpleDateFormat) local33.poll();
		if (local37 == null) {
			local37 = new SimpleDateFormat(arg1, arg3.method32469());
		} else {
			local37.applyPattern(arg1);
		}
		local37.setTimeZone(arg2);
		@Pc(59) String local59 = local37.format(arg0);
		local33.add(local37);
		return local59;
	}

	@OriginalMember(owner = "client!fp", name = "x", descriptor = "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;Lclient!vk;)Ljava/lang/String;", line = 28)
	static String method23525(@OriginalArg(0) Date arg0, @OriginalArg(1) String arg1, @OriginalArg(2) TimeZone arg2, @OriginalArg(3) Class530 arg3) {
		if (aMap8 == null) {
			aMap8 = new HashMap(7);
			@Pc(9) Class530[] local9 = Class530.method32466();
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				@Pc(19) Class530 local19 = local9[local11];
				aMap8.put(local19, new ConcurrentLinkedQueue());
			}
		}
		@Pc(33) ConcurrentLinkedQueue local33 = (ConcurrentLinkedQueue) aMap8.get(arg3);
		@Pc(37) SimpleDateFormat local37 = (SimpleDateFormat) local33.poll();
		if (local37 == null) {
			local37 = new SimpleDateFormat(arg1, arg3.method32469());
		} else {
			local37.applyPattern(arg1);
		}
		local37.setTimeZone(arg2);
		@Pc(59) String local59 = local37.format(arg0);
		local33.add(local37);
		return local59;
	}

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "(B)Ljava/util/TimeZone;", line = 51)
	static TimeZone method23522() {
		return method23523("Europe/London");
	}

	@OriginalMember(owner = "client!fp", name = "s", descriptor = "()Ljava/util/TimeZone;", line = 51)
	static TimeZone method23526() {
		return method23523("Europe/London");
	}

	@OriginalMember(owner = "client!fp", name = "u", descriptor = "()Ljava/util/TimeZone;", line = 51)
	static TimeZone method23527() {
		return method23523("Europe/London");
	}

	@OriginalMember(owner = "client!fp", name = "y", descriptor = "()Ljava/util/TimeZone;", line = 51)
	static TimeZone method23528() {
		return method23523("Europe/London");
	}

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;", line = 55)
	static TimeZone method23523(@OriginalArg(0) String arg0) {
		@Pc(2) HashMap local2 = aHashMap5;
		synchronized (aHashMap5) {
			@Pc(8) TimeZone local8 = (TimeZone) aHashMap5.get(arg0);
			if (local8 == null) {
				local8 = TimeZone.getTimeZone(arg0);
				aHashMap5.put(arg0, local8);
			}
			return local8;
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(Ljava/lang/String;)Ljava/util/TimeZone;", line = 55)
	static TimeZone method23529(@OriginalArg(0) String arg0) {
		@Pc(2) HashMap local2 = aHashMap5;
		synchronized (aHashMap5) {
			@Pc(8) TimeZone local8 = (TimeZone) aHashMap5.get(arg0);
			if (local8 == null) {
				local8 = TimeZone.getTimeZone(arg0);
				aHashMap5.put(arg0, local8);
			}
			return local8;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 69)
	static void method23535() {
		Class2.anInt4 = 0;
		Class2.anInt5 = -2115862953;
		Class2.anInt2 = -383922831;
	}

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "(Lclient!fo;Lclient!ch;IIIIILjava/lang/String;Lclient!dw;Lclient!yx;II)V", line = 799)
	static void method23530(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(8) Class14 arg8, @OriginalArg(9) Class611 arg9, @OriginalArg(10) int arg10) {
		@Pc(18) int local18;
		if (Class72.anInt2086 * 81180077 == 3) {
			local18 = (int) ((double) Class80.aClass23_Sub1_1.method5836() * 2607.5945876176133D) + client.anInt3081 * 732347007 & 0x3FFF;
		} else if (Class72.anInt2086 * 81180077 == 4) {
			local18 = (int) client.aFloat238 & 0x3FFF;
		} else {
			local18 = (int) client.aFloat238 + client.anInt3081 * 732347007 & 0x3FFF;
		}
		@Pc(55) int local55 = Math.max(arg0.anInt3498 * -1494060731 / 2, arg0.anInt3499 * -751005789 / 2) + 10;
		@Pc(63) int local63 = arg4 * arg4 + arg5 * arg5;
		if (local63 > local55 * local55) {
			return;
		}
		@Pc(73) int local73 = Class317.anIntArray419[local18];
		@Pc(77) int local77 = Class317.anIntArray420[local18];
		if (Class72.anInt2086 * 81180077 != 4) {
			local73 = local73 * 256 / (client.anInt3083 * 1898621565 + 256);
			local77 = local77 * 256 / (client.anInt3083 * 1898621565 + 256);
		}
		@Pc(112) int local112 = local77 * arg4 + local73 * arg5 >> 14;
		@Pc(122) int local122 = local77 * arg5 - local73 * arg4 >> 14;
		@Pc(129) int local129 = arg9.method33586(arg7, 100, null);
		@Pc(137) int local137 = arg9.method33606(arg7, 100, 0, null);
		@Pc(143) int local143 = local112 - local129 / 2;
		if (local143 >= -(arg0.anInt3498 * -1494060731) && local143 <= arg0.anInt3498 * -1494060731 && local122 >= -(arg0.anInt3499 * -751005789) && local122 <= arg0.anInt3499 * -751005789) {
			arg8.method3283(arg7, arg2 + local143 + arg0.anInt3498 * -1494060731 / 2, arg0.anInt3499 * -751005789 / 2 + arg3 - local122 - arg6 - local137, local129, 50, arg10, 0, 1, 0, 0, null, null, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!fp", name = "nv", descriptor = "(Lclient!vs;I)V", line = 6609)
	static final void method23531(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class183.method23690(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!fp", name = "qi", descriptor = "(Lclient!vs;I)V", line = 6967)
	static final void method23532(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3574 * -1289212201;
	}

	@OriginalMember(owner = "client!fp", name = "aiw", descriptor = "(Lclient!vs;I)V", line = 10524)
	static final void method23533(@OriginalArg(0) Class536 arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) String local3 = "";
		if (arg0.aClass269_2 != null && arg0.aClass269_2.method25273()) {
			@Pc(16) File local16 = arg0.aClass269_2.method25272();
			if (local16 != null) {
				local3 = local16.getPath();
				if (local3 == null) {
					local3 = "";
				}
			}
			local1 = true;
			arg0.aClass269_2 = null;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local1 ? 1 : 0;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local3;
	}
}
