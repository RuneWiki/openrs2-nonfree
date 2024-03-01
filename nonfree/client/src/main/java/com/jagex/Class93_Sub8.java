package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajt")
public final class Class93_Sub8 extends Class93 {

	@OriginalMember(owner = "client!ajt", name = "x", descriptor = "Lclient!aat;")
	public static Class22 aClass22_18 = new Class22();

	@OriginalMember(owner = "client!ajt", name = "b", descriptor = "Lclient!aat;")
	public static Class22 aClass22_19 = new Class22();

	@OriginalMember(owner = "client!ajt", name = "h", descriptor = "J")
	static long aLong63 = 7408032350761746613L;

	@OriginalMember(owner = "client!ajt", name = "w", descriptor = "I")
	public int anInt1462;

	@OriginalMember(owner = "client!ajt", name = "u", descriptor = "I")
	int anInt1463;

	@OriginalMember(owner = "client!ajt", name = "l", descriptor = "I")
	public int anInt1464;

	@OriginalMember(owner = "client!ajt", name = "f", descriptor = "I")
	int anInt1465;

	@OriginalMember(owner = "client!ajt", name = "o", descriptor = "Lclient!oe;")
	Class458 aClass458_48;

	@OriginalMember(owner = "client!ajt", name = "z", descriptor = "I")
	int anInt1466;

	@OriginalMember(owner = "client!ajt", name = "p", descriptor = "I")
	int anInt1467;

	@OriginalMember(owner = "client!ajt", name = "d", descriptor = "Lclient!oe;")
	Class458 aClass458_49;

	@OriginalMember(owner = "client!ajt", name = "c", descriptor = "I")
	public int anInt1468;

	@OriginalMember(owner = "client!ajt", name = "r", descriptor = "I")
	public int anInt1469;

	@OriginalMember(owner = "client!ajt", name = "v", descriptor = "I")
	int anInt1470;

	@OriginalMember(owner = "client!ajt", name = "k", descriptor = "I")
	int anInt1471;

	@OriginalMember(owner = "client!ajt", name = "s", descriptor = "Lclient!vp;")
	Class620 aClass620_1;

	@OriginalMember(owner = "client!ajt", name = "y", descriptor = "Z")
	boolean aBoolean308 = true;

	@OriginalMember(owner = "client!ajt", name = "q", descriptor = "Z")
	boolean aBoolean309 = false;

	@OriginalMember(owner = "client!ajt", name = "<init>", descriptor = "()V", line = 36)
	Class93_Sub8() {
	}

	@OriginalMember(owner = "client!ajt", name = "z", descriptor = "(IIIIIIILclient!oe;)V", line = 39)
	public static void method12974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7) {
		@Pc(1) Class93_Sub8 local1 = null;
		for (@Pc(6) Class93_Sub8 local6 = (Class93_Sub8) aClass22_18.method445(); local6 != null; local6 = (Class93_Sub8) aClass22_18.method415()) {
			if (arg0 == local6.anInt1471 * -960255437 && local6.anInt1462 * -1824529811 == arg1 && arg2 == local6.anInt1464 * 275343381 && arg3 == local6.anInt1465 * -408185941) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class93_Sub8();
			local1.anInt1471 = arg0 * 2102878459;
			local1.anInt1465 = arg3 * -272445693;
			local1.anInt1462 = arg1 * -1126729883;
			local1.anInt1464 = arg2 * -89446595;
			if (arg1 >= 0 && arg2 >= 0 && arg1 < client.aClass532_1.method30444() && arg2 < client.aClass532_1.method30474()) {
				Class593.method31720(local1);
			}
			aClass22_18.method407(local1);
		}
		local1.anInt1468 = arg4 * -911028101;
		local1.anInt1470 = arg5 * -498027109;
		local1.anInt1469 = arg6 * -2025107705;
		if (arg7 != null) {
			local1.aClass458_48 = new Class458(arg7);
		}
		local1.aBoolean308 = true;
		local1.aBoolean309 = false;
	}

	@OriginalMember(owner = "client!ajt", name = "p", descriptor = "(IIIIIILclient!vp;)V", line = 68)
	static void method12975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class620 arg6) {
		@Pc(1) Class93_Sub8 local1 = null;
		for (@Pc(6) Class93_Sub8 local6 = (Class93_Sub8) aClass22_19.method445(); local6 != null; local6 = (Class93_Sub8) aClass22_19.method415()) {
			if (arg0 == local6.anInt1471 * -960255437 && local6.anInt1462 * -1824529811 == arg1 && local6.anInt1464 * 275343381 == arg2 && arg3 == local6.anInt1465 * -408185941) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class93_Sub8();
			local1.anInt1471 = arg0 * 2102878459;
			local1.anInt1465 = arg3 * -272445693;
			local1.anInt1462 = arg1 * -1126729883;
			local1.anInt1464 = arg2 * -89446595;
			aClass22_19.method407(local1);
		}
		local1.anInt1468 = arg4 * -911028101;
		local1.anInt1470 = arg5 * -498027109;
		local1.aClass620_1 = arg6;
		local1.aBoolean308 = true;
		local1.aBoolean309 = false;
	}

	@OriginalMember(owner = "client!ajt", name = "d", descriptor = "(IIIIIILclient!vp;)V", line = 68)
	static void method12976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class620 arg6) {
		@Pc(1) Class93_Sub8 local1 = null;
		for (@Pc(6) Class93_Sub8 local6 = (Class93_Sub8) aClass22_19.method445(); local6 != null; local6 = (Class93_Sub8) aClass22_19.method415()) {
			if (arg0 == local6.anInt1471 * -960255437 && local6.anInt1462 * -1824529811 == arg1 && local6.anInt1464 * 275343381 == arg2 && arg3 == local6.anInt1465 * -408185941) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class93_Sub8();
			local1.anInt1471 = arg0 * 2102878459;
			local1.anInt1465 = arg3 * -272445693;
			local1.anInt1462 = arg1 * -1126729883;
			local1.anInt1464 = arg2 * -89446595;
			aClass22_19.method407(local1);
		}
		local1.anInt1468 = arg4 * -911028101;
		local1.anInt1470 = arg5 * -498027109;
		local1.aClass620_1 = arg6;
		local1.aBoolean308 = true;
		local1.aBoolean309 = false;
	}

	@OriginalMember(owner = "client!ajt", name = "c", descriptor = "()V", line = 93)
	public static final void method12977() {
		@Pc(4) Class93_Sub8 local4;
		for (local4 = (Class93_Sub8) aClass22_18.method445(); local4 != null; local4 = (Class93_Sub8) aClass22_18.method415()) {
			if (local4.aBoolean309) {
				local4.method23969();
			} else {
				local4.aBoolean308 = true;
				if (local4.anInt1462 * -1824529811 >= 0 && local4.anInt1464 * 275343381 >= 0 && local4.anInt1462 * -1824529811 < client.aClass532_1.method30444() && local4.anInt1464 * 275343381 < client.aClass532_1.method30474()) {
					Class593.method31720(local4);
				}
			}
		}
		for (local4 = (Class93_Sub8) aClass22_19.method445(); local4 != null; local4 = (Class93_Sub8) aClass22_19.method415()) {
			if (local4.aBoolean309) {
				local4.method23969();
			} else {
				local4.aBoolean308 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ajt", name = "r", descriptor = "()V", line = 93)
	public static final void method12978() {
		@Pc(4) Class93_Sub8 local4;
		for (local4 = (Class93_Sub8) aClass22_18.method445(); local4 != null; local4 = (Class93_Sub8) aClass22_18.method415()) {
			if (local4.aBoolean309) {
				local4.method23969();
			} else {
				local4.aBoolean308 = true;
				if (local4.anInt1462 * -1824529811 >= 0 && local4.anInt1464 * 275343381 >= 0 && local4.anInt1462 * -1824529811 < client.aClass532_1.method30444() && local4.anInt1464 * 275343381 < client.aClass532_1.method30474()) {
					Class593.method31720(local4);
				}
			}
		}
		for (local4 = (Class93_Sub8) aClass22_19.method445(); local4 != null; local4 = (Class93_Sub8) aClass22_19.method415()) {
			if (local4.aBoolean309) {
				local4.method23969();
			} else {
				local4.aBoolean308 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ajt", name = "v", descriptor = "(Lclient!ajt;)V", line = 113)
	static final void method12979(@OriginalArg(0) Class93_Sub8 arg0) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30459();
		if (local3 == null) {
			return;
		}
		@Pc(9) Interface61 local9 = null;
		if (arg0.anInt1465 * -408185941 == 0) {
			local9 = (Interface61) local3.method31440(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381);
		}
		if (arg0.anInt1465 * -408185941 == 1) {
			local9 = (Interface61) local3.method31464(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381);
		}
		if (arg0.anInt1465 * -408185941 == 2) {
			local9 = (Interface61) local3.method31585(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, client.anInterface62_1);
		}
		if (arg0.anInt1465 * -408185941 == 3) {
			local9 = (Interface61) local3.method31496(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381);
		}
		if (local9 == null) {
			arg0.anInt1463 = -1906814085;
			arg0.anInt1467 = 0;
			arg0.anInt1466 = 0;
		} else {
			arg0.anInt1463 = local9.method13423() * 1906814085;
			arg0.anInt1467 = local9.method13420() * -878129807;
			arg0.anInt1466 = local9.method13404() * -1218208213;
		}
		if (local9 instanceof Class132_Sub1) {
			@Pc(140) Class132_Sub1 local140 = (Class132_Sub1) local9;
			arg0.aClass458_48 = local140.aClass458_89 == null ? null : new Class458(local140.aClass458_89);
		}
	}

	@OriginalMember(owner = "client!ajt", name = "y", descriptor = "(Lclient!ajt;)V", line = 113)
	static final void method12980(@OriginalArg(0) Class93_Sub8 arg0) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30459();
		if (local3 == null) {
			return;
		}
		@Pc(9) Interface61 local9 = null;
		if (arg0.anInt1465 * -408185941 == 0) {
			local9 = (Interface61) local3.method31440(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381);
		}
		if (arg0.anInt1465 * -408185941 == 1) {
			local9 = (Interface61) local3.method31464(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381);
		}
		if (arg0.anInt1465 * -408185941 == 2) {
			local9 = (Interface61) local3.method31585(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, client.anInterface62_1);
		}
		if (arg0.anInt1465 * -408185941 == 3) {
			local9 = (Interface61) local3.method31496(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381);
		}
		if (local9 == null) {
			arg0.anInt1463 = -1906814085;
			arg0.anInt1467 = 0;
			arg0.anInt1466 = 0;
		} else {
			arg0.anInt1463 = local9.method13423() * 1906814085;
			arg0.anInt1467 = local9.method13420() * -878129807;
			arg0.anInt1466 = local9.method13404() * -1218208213;
		}
		if (local9 instanceof Class132_Sub1) {
			@Pc(140) Class132_Sub1 local140 = (Class132_Sub1) local9;
			arg0.aClass458_48 = local140.aClass458_89 == null ? null : new Class458(local140.aClass458_89);
		}
	}

	@OriginalMember(owner = "client!ajt", name = "x", descriptor = "(Lclient!ajt;)V", line = 113)
	static final void method12981(@OriginalArg(0) Class93_Sub8 arg0) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30459();
		if (local3 == null) {
			return;
		}
		@Pc(9) Interface61 local9 = null;
		if (arg0.anInt1465 * -408185941 == 0) {
			local9 = (Interface61) local3.method31440(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381);
		}
		if (arg0.anInt1465 * -408185941 == 1) {
			local9 = (Interface61) local3.method31464(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381);
		}
		if (arg0.anInt1465 * -408185941 == 2) {
			local9 = (Interface61) local3.method31585(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, client.anInterface62_1);
		}
		if (arg0.anInt1465 * -408185941 == 3) {
			local9 = (Interface61) local3.method31496(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381);
		}
		if (local9 == null) {
			arg0.anInt1463 = -1906814085;
			arg0.anInt1467 = 0;
			arg0.anInt1466 = 0;
		} else {
			arg0.anInt1463 = local9.method13423() * 1906814085;
			arg0.anInt1467 = local9.method13420() * -878129807;
			arg0.anInt1466 = local9.method13404() * -1218208213;
		}
		if (local9 instanceof Class132_Sub1) {
			@Pc(140) Class132_Sub1 local140 = (Class132_Sub1) local9;
			arg0.aClass458_48 = local140.aClass458_89 == null ? null : new Class458(local140.aClass458_89);
		}
	}

	@OriginalMember(owner = "client!ajt", name = "h", descriptor = "(Lclient!ajt;)V", line = 113)
	static final void method12982(@OriginalArg(0) Class93_Sub8 arg0) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30459();
		if (local3 == null) {
			return;
		}
		@Pc(9) Interface61 local9 = null;
		if (arg0.anInt1465 * -408185941 == 0) {
			local9 = (Interface61) local3.method31440(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381);
		}
		if (arg0.anInt1465 * -408185941 == 1) {
			local9 = (Interface61) local3.method31464(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381);
		}
		if (arg0.anInt1465 * -408185941 == 2) {
			local9 = (Interface61) local3.method31585(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, client.anInterface62_1);
		}
		if (arg0.anInt1465 * -408185941 == 3) {
			local9 = (Interface61) local3.method31496(arg0.anInt1471 * -960255437, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381);
		}
		if (local9 == null) {
			arg0.anInt1463 = -1906814085;
			arg0.anInt1467 = 0;
			arg0.anInt1466 = 0;
		} else {
			arg0.anInt1463 = local9.method13423() * 1906814085;
			arg0.anInt1467 = local9.method13420() * -878129807;
			arg0.anInt1466 = local9.method13404() * -1218208213;
		}
		if (local9 instanceof Class132_Sub1) {
			@Pc(140) Class132_Sub1 local140 = (Class132_Sub1) local9;
			arg0.aClass458_48 = local140.aClass458_89 == null ? null : new Class458(local140.aClass458_89);
		}
	}

	@OriginalMember(owner = "client!ajt", name = "a", descriptor = "(Lclient!ajt;Z)V", line = 150)
	static final void method12972(@OriginalArg(0) Class93_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean309) {
			if (arg0.anInt1463 * -1082823603 < 0 || Class29.method604(client.aClass532_1.method30466(), arg0.anInt1463 * -1082823603, arg0.anInt1467 * -750234735)) {
				if (arg1) {
					Class591.method31701(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, null);
				} else {
					Class71.method1250(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1463 * -1082823603, arg0.anInt1466 * 1041903747, arg0.anInt1467 * -750234735, arg0.aClass458_49, -1, 0);
				}
				arg0.method23969();
			}
		} else if (arg0.aBoolean308 && arg0.anInt1462 * -1824529811 >= 1 && arg0.anInt1464 * 275343381 >= 1 && arg0.anInt1462 * -1824529811 <= client.aClass532_1.method30444() - 2 && arg0.anInt1464 * 275343381 <= client.aClass532_1.method30474() - 2 && (arg0.anInt1468 * -1430483277 < 0 || Class29.method604(client.aClass532_1.method30466(), arg0.anInt1468 * -1430483277, arg0.anInt1470 * -770791277))) {
			if (arg1) {
				Class591.method31701(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.aClass620_1);
			} else {
				Class71.method1250(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1468 * -1430483277, arg0.anInt1469 * 1312747191, arg0.anInt1470 * -770791277, arg0.aClass458_48, -1, 0);
			}
			arg0.aBoolean308 = false;
			if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1463 * -1082823603 == -1) {
				arg0.method23969();
			} else if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1469 * 1312747191 == arg0.anInt1466 * 1041903747 && arg0.anInt1470 * -770791277 == arg0.anInt1467 * -750234735) {
				arg0.method23969();
			}
		}
	}

	@OriginalMember(owner = "client!ajt", name = "i", descriptor = "(Lclient!ajt;Z)V", line = 150)
	static final void method12984(@OriginalArg(0) Class93_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean309) {
			if (arg0.anInt1463 * -1082823603 < 0 || Class29.method604(client.aClass532_1.method30466(), arg0.anInt1463 * -1082823603, arg0.anInt1467 * -750234735)) {
				if (arg1) {
					Class591.method31701(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, null);
				} else {
					Class71.method1250(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1463 * -1082823603, arg0.anInt1466 * 1041903747, arg0.anInt1467 * -750234735, arg0.aClass458_49, -1, 0);
				}
				arg0.method23969();
			}
		} else if (arg0.aBoolean308 && arg0.anInt1462 * -1824529811 >= 1 && arg0.anInt1464 * 275343381 >= 1 && arg0.anInt1462 * -1824529811 <= client.aClass532_1.method30444() - 2 && arg0.anInt1464 * 275343381 <= client.aClass532_1.method30474() - 2 && (arg0.anInt1468 * -1430483277 < 0 || Class29.method604(client.aClass532_1.method30466(), arg0.anInt1468 * -1430483277, arg0.anInt1470 * -770791277))) {
			if (arg1) {
				Class591.method31701(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.aClass620_1);
			} else {
				Class71.method1250(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1468 * -1430483277, arg0.anInt1469 * 1312747191, arg0.anInt1470 * -770791277, arg0.aClass458_48, -1, 0);
			}
			arg0.aBoolean308 = false;
			if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1463 * -1082823603 == -1) {
				arg0.method23969();
			} else if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1469 * 1312747191 == arg0.anInt1466 * 1041903747 && arg0.anInt1470 * -770791277 == arg0.anInt1467 * -750234735) {
				arg0.method23969();
			}
		}
	}

	@OriginalMember(owner = "client!ajt", name = "g", descriptor = "(Lclient!ajt;Z)V", line = 150)
	static final void method12986(@OriginalArg(0) Class93_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean309) {
			if (arg0.anInt1463 * -1082823603 < 0 || Class29.method604(client.aClass532_1.method30466(), arg0.anInt1463 * -1082823603, arg0.anInt1467 * -750234735)) {
				if (arg1) {
					Class591.method31701(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, null);
				} else {
					Class71.method1250(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1463 * -1082823603, arg0.anInt1466 * 1041903747, arg0.anInt1467 * -750234735, arg0.aClass458_49, -1, 0);
				}
				arg0.method23969();
			}
		} else if (arg0.aBoolean308 && arg0.anInt1462 * -1824529811 >= 1 && arg0.anInt1464 * 275343381 >= 1 && arg0.anInt1462 * -1824529811 <= client.aClass532_1.method30444() - 2 && arg0.anInt1464 * 275343381 <= client.aClass532_1.method30474() - 2 && (arg0.anInt1468 * -1430483277 < 0 || Class29.method604(client.aClass532_1.method30466(), arg0.anInt1468 * -1430483277, arg0.anInt1470 * -770791277))) {
			if (arg1) {
				Class591.method31701(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.aClass620_1);
			} else {
				Class71.method1250(arg0.anInt1471 * -960255437, arg0.anInt1465 * -408185941, arg0.anInt1462 * -1824529811, arg0.anInt1464 * 275343381, arg0.anInt1468 * -1430483277, arg0.anInt1469 * 1312747191, arg0.anInt1470 * -770791277, arg0.aClass458_48, -1, 0);
			}
			arg0.aBoolean308 = false;
			if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1463 * -1082823603 == -1) {
				arg0.method23969();
			} else if (!arg1 && arg0.anInt1463 * -1082823603 == arg0.anInt1468 * -1430483277 && arg0.anInt1469 * 1312747191 == arg0.anInt1466 * 1041903747 && arg0.anInt1470 * -770791277 == arg0.anInt1467 * -750234735) {
				arg0.method23969();
			}
		}
	}

	@OriginalMember(owner = "client!ajt", name = "t", descriptor = "(IIIIIIILclient!oe;II)V", line = 171)
	static final void method12983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30444() - 2 || arg3 > client.aClass532_1.method30474() - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass532_1.method30509().method30330(arg2, arg3)) {
			local21 = arg0 + 1;
		}
		if (client.aClass532_1.method30459() == null) {
			return;
		}
		client.aClass532_1.method30460().method10959(Class694.aClass104_14, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15402();
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
			client.aClass532_1.method30460().method10955(Class694.aClass104_14, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7);
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, local55);
		}
		Class110_Sub15.method20151(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100);
	}

	@OriginalMember(owner = "client!ajt", name = "j", descriptor = "(IIIIIIILclient!oe;II)V", line = 171)
	static final void method12985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30444() - 2 || arg3 > client.aClass532_1.method30474() - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass532_1.method30509().method30330(arg2, arg3)) {
			local21 = arg0 + 1;
		}
		if (client.aClass532_1.method30459() == null) {
			return;
		}
		client.aClass532_1.method30460().method10959(Class694.aClass104_14, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15402();
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
			client.aClass532_1.method30460().method10955(Class694.aClass104_14, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7);
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, local55);
		}
		Class110_Sub15.method20151(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100);
	}

	@OriginalMember(owner = "client!ajt", name = "ae", descriptor = "(IIIIIIILclient!oe;II)V", line = 171)
	static final void method12987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30444() - 2 || arg3 > client.aClass532_1.method30474() - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass532_1.method30509().method30330(arg2, arg3)) {
			local21 = arg0 + 1;
		}
		if (client.aClass532_1.method30459() == null) {
			return;
		}
		client.aClass532_1.method30460().method10959(Class694.aClass104_14, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15402();
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
			client.aClass532_1.method30460().method10955(Class694.aClass104_14, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7);
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, local55);
		}
		Class110_Sub15.method20151(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100);
	}

	@OriginalMember(owner = "client!ajt", name = "ag", descriptor = "(IIIIIIILclient!oe;II)V", line = 171)
	static final void method12988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30444() - 2 || arg3 > client.aClass532_1.method30474() - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass532_1.method30509().method30330(arg2, arg3)) {
			local21 = arg0 + 1;
		}
		if (client.aClass532_1.method30459() == null) {
			return;
		}
		client.aClass532_1.method30460().method10959(Class694.aClass104_14, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15402();
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
			client.aClass532_1.method30460().method10955(Class694.aClass104_14, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7);
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, local55);
		}
		Class110_Sub15.method20151(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100);
	}

	@OriginalMember(owner = "client!ajt", name = "ah", descriptor = "(IIIIIIILclient!oe;II)V", line = 171)
	static final void method12989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30444() - 2 || arg3 > client.aClass532_1.method30474() - 2) {
			return;
		}
		@Pc(21) int local21 = arg0;
		if (arg0 < 3 && client.aClass532_1.method30509().method30330(arg2, arg3)) {
			local21 = arg0 + 1;
		}
		if (client.aClass532_1.method30459() == null) {
			return;
		}
		client.aClass532_1.method30460().method10959(Class694.aClass104_14, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			@Pc(55) int local55 = Class51.aClass93_Sub36_1.aClass166_Sub3_1.method15402();
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, 1);
			client.aClass532_1.method30460().method10955(Class694.aClass104_14, local21, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7);
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub3_1, local55);
		}
		Class110_Sub15.method20151(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100);
	}

	@OriginalMember(owner = "client!ajt", name = "ac", descriptor = "(IIIILclient!vp;)V", line = 187)
	static final void method12973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class620 arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30444() - 2 || arg3 > client.aClass532_1.method30474() - 2) {
			return;
		}
		if (client.aClass532_1.method30459() == null) {
			return;
		}
		@Pc(34) Interface61 local34 = client.aClass532_1.method30460().method10987(arg0, arg1, arg2, arg3);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class132_Sub1_Sub1_Sub3) {
			((Class132_Sub1_Sub1_Sub3) local34).method13295(arg4);
		} else if (local34 instanceof Class132_Sub1_Sub4_Sub1) {
			((Class132_Sub1_Sub4_Sub1) local34).method12961(arg4);
		} else if (local34 instanceof Class132_Sub1_Sub2_Sub2) {
			((Class132_Sub1_Sub2_Sub2) local34).method12446(arg4);
		} else if (local34 instanceof Class132_Sub1_Sub3_Sub1) {
			((Class132_Sub1_Sub3_Sub1) local34).method12301(arg4);
		}
	}

	@OriginalMember(owner = "client!ajt", name = "al", descriptor = "(IIIILclient!vp;)V", line = 187)
	static final void method12990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class620 arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass532_1.method30444() - 2 || arg3 > client.aClass532_1.method30474() - 2) {
			return;
		}
		if (client.aClass532_1.method30459() == null) {
			return;
		}
		@Pc(34) Interface61 local34 = client.aClass532_1.method30460().method10987(arg0, arg1, arg2, arg3);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class132_Sub1_Sub1_Sub3) {
			((Class132_Sub1_Sub1_Sub3) local34).method13295(arg4);
		} else if (local34 instanceof Class132_Sub1_Sub4_Sub1) {
			((Class132_Sub1_Sub4_Sub1) local34).method12961(arg4);
		} else if (local34 instanceof Class132_Sub1_Sub2_Sub2) {
			((Class132_Sub1_Sub2_Sub2) local34).method12446(arg4);
		} else if (local34 instanceof Class132_Sub1_Sub3_Sub1) {
			((Class132_Sub1_Sub3_Sub1) local34).method12301(arg4);
		}
	}

	@OriginalMember(owner = "client!ajt", name = "z", descriptor = "(I)V", line = 712)
	static void method12992() {
		Class174.anInt3293 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2048; local3++) {
			Class174.aClass93_Sub41Array2[local3] = null;
			Class174.aClass93_Sub41Array1[local3] = null;
			Class174.aByteArray64[local3] = Class707.aClass707_2.aByte176;
			Class174.aClass200Array1[local3] = null;
		}
	}

	@OriginalMember(owner = "client!ajt", name = "ki", descriptor = "(I)V", line = 11715)
	public static final void method12991() {
		client.aBoolean616 = true;
	}
}
