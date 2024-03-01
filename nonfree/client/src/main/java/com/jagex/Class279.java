package com.jagex;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public class Class279 implements Interface56 {

	@OriginalMember(owner = "client!kj", name = "ho", descriptor = "Lclient!rf;")
	public static Class429 aClass429_1;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "Lclient!kj;")
	static final Class279 aClass279_5 = new Class279(4, 1);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "Lclient!kj;")
	static final Class279 aClass279_4 = new Class279(2, 2);

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "Lclient!kj;")
	static final Class279 aClass279_2 = new Class279(6, 3);

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "Lclient!kj;")
	static final Class279 aClass279_3 = new Class279(0, 4);

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "Lclient!kj;")
	static final Class279 aClass279_1 = new Class279(12, 5);

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "Lclient!kj;")
	static final Class279 aClass279_7 = new Class279(3, 6);

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "Lclient!kj;")
	static final Class279 aClass279_6 = new Class279(5, 7);

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "Lclient!kj;")
	static final Class279 aClass279_13 = new Class279(9, 8);

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "Lclient!kj;")
	static final Class279 aClass279_8 = new Class279(11, 9);

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Lclient!kj;")
	static final Class279 aClass279_9 = new Class279(8, 10);

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "Lclient!kj;")
	static final Class279 aClass279_10 = new Class279(7, 11);

	@OriginalMember(owner = "client!kj", name = "z", descriptor = "Lclient!kj;")
	static final Class279 aClass279_11 = new Class279(1, 12);

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "Lclient!kj;")
	static final Class279 aClass279_12 = new Class279(10, 13);

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
	final int anInt4333;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
	final int anInt4332;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "()[Lclient!kj;", line = 25)
	static Class279[] method25415() {
		return new Class279[] { aClass279_6, aClass279_5, aClass279_10, aClass279_9, aClass279_3, aClass279_8, aClass279_11, aClass279_13, aClass279_12, aClass279_2, aClass279_7, aClass279_1, aClass279_4 };
	}

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "()[Lclient!kj;", line = 25)
	static Class279[] method25416() {
		return new Class279[] { aClass279_6, aClass279_5, aClass279_10, aClass279_9, aClass279_3, aClass279_8, aClass279_11, aClass279_13, aClass279_12, aClass279_2, aClass279_7, aClass279_1, aClass279_4 };
	}

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "()[Lclient!kj;", line = 25)
	static Class279[] method25417() {
		return new Class279[] { aClass279_6, aClass279_5, aClass279_10, aClass279_9, aClass279_3, aClass279_8, aClass279_11, aClass279_13, aClass279_12, aClass279_2, aClass279_7, aClass279_1, aClass279_4 };
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(II)V", line = 28)
	Class279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4333 = arg0 * 2128384457;
		this.anInt4332 = arg1 * 1975585287;
	}

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "()I", line = 34)
	@Override
	public int method33764() {
		return this.anInt4332 * -150060105;
	}

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "()I", line = 34)
	@Override
	public int method33766() {
		return this.anInt4332 * -150060105;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)I", line = 34)
	@Override
	public int method33765() {
		return this.anInt4332 * -150060105;
	}

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "()I", line = 34)
	@Override
	public int method33767() {
		return this.anInt4332 * -150060105;
	}

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "(JIZI)Ljava/lang/String;", line = 59)
	static String method25422(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class312.method25816(arg0);
			local5 = Class599.aCalendar3;
		} else {
			Class313.method25819(arg0);
			local5 = Class599.aCalendar2;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(20) int local20 = local5.get(2) + 1;
		@Pc(24) int local24 = local5.get(1);
		@Pc(28) int local28 = local5.get(11);
		@Pc(32) int local32 = local5.get(12);
		return Integer.toString(local14 / 10) + local14 % 10 + "/" + local20 / 10 + local20 % 10 + "/" + local24 % 100 / 10 + local24 % 10 + " " + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
	}

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "(Lclient!pp;Lclient!sj;III)Z", line = 295)
	static boolean method25419(@OriginalArg(0) Interface43 arg0, @OriginalArg(1) Class457 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return false;
		}
		@Pc(11) Class467 local11 = arg1.method28510(arg0.method11163());
		if (local11.aBoolean790 && !client.aBoolean590) {
			return false;
		}
		@Pc(23) int local23 = local11.anInt5076 * -465575861;
		if (local11.anIntArray464 != null) {
			for (@Pc(29) int local29 = 0; local29 < local11.anIntArray464.length; local29++) {
				if (local11.anIntArray464[local29] != -1) {
					@Pc(48) Class467 local48 = arg1.method28510(local11.anIntArray464[local29]);
					if (local48.anInt5076 * -465575861 >= 0) {
						local23 = local48.anInt5076 * -465575861;
					}
				}
			}
		}
		if (local23 < 0) {
			return false;
		}
		Class2.anIntArray1[Class2.anInt3 * -471644325] = local11.anInt5092 * 1978606771;
		Class2.anIntArray3[Class2.anInt3 * -471644325] = arg2;
		Class2.anIntArray2[Class2.anInt3 * -471644325] = arg3;
		Class2.anInt3 += -370437933;
		return true;
	}

	@OriginalMember(owner = "client!kj", name = "dr", descriptor = "(IIB)V", line = 605)
	static final void method25420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class58_Sub1.aFloat149 < Class58_Sub1.aFloat148) {
			Class58_Sub1.aFloat149 = (float) ((double) Class58_Sub1.aFloat149 + (double) Class58_Sub1.aFloat149 / 30.0D);
			if (Class58_Sub1.aFloat149 > Class58_Sub1.aFloat148) {
				Class58_Sub1.aFloat149 = Class58_Sub1.aFloat148;
			}
			Class538.method32566();
			Class58_Sub1.anInt1403 = (int) Class58_Sub1.aFloat148 >> 1;
			Class58_Sub1.aByteArrayArrayArray10 = Class377.method27243(Class58_Sub1.anInt1403);
		} else if (Class58_Sub1.aFloat149 > Class58_Sub1.aFloat148) {
			Class58_Sub1.aFloat149 = (float) ((double) Class58_Sub1.aFloat149 - (double) Class58_Sub1.aFloat149 / 30.0D);
			if (Class58_Sub1.aFloat149 < Class58_Sub1.aFloat148) {
				Class58_Sub1.aFloat149 = Class58_Sub1.aFloat148;
			}
			Class538.method32566();
			Class58_Sub1.anInt1403 = (int) Class58_Sub1.aFloat148 >> 1;
			Class58_Sub1.aByteArrayArrayArray10 = Class377.method27243(Class58_Sub1.anInt1403);
		}
		if (Class58_Sub1.anInt1437 * 51697525 != -1 && Class58_Sub1.anInt1435 * 1154453407 != -1) {
			@Pc(78) int local78 = Class58_Sub1.anInt1437 * 51697525 - Class485.anInt5182 * 826696483;
			if (local78 != 0) {
				local78 /= Math.min(Class58_Sub1.anInt1432 * -2103251401, Math.abs(local78));
			}
			@Pc(98) int local98 = Class58_Sub1.anInt1435 * 1154453407 - Class161.anInt3445 * 2105263663;
			if (local98 != 0) {
				local98 /= Math.min(Class58_Sub1.anInt1432 * -2103251401, Math.abs(local98));
			}
			Class485.anInt5182 = (Class485.anInt5182 * 826696483 + local78) * -1310727029;
			Class161.anInt3445 = (Class161.anInt3445 * 2105263663 + local98) * 634470607;
			if (local78 == 0 && local98 == 0) {
				Class58_Sub1.anInt1437 = -481951965;
				Class58_Sub1.anInt1435 = 1239823265;
			}
			Class538.method32566();
		}
		@Pc(140) Iterator local140 = Class58_Sub1.aHashMap3.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(149) Class472 local149;
				do {
					if (!local140.hasNext()) {
						local140 = Class58_Sub1.aHashMap4.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local140.hasNext()) {
										if (Class58_Sub1.aBoolean317 && Class269.aClass553_55 != null) {
											for (@Pc(241) Class3_Sub10 local241 = (Class3_Sub10) Class269.aClass553_55.method32768(); local241 != null; local241 = (Class3_Sub10) Class269.aClass553_55.method32709()) {
												@Pc(252) Class452 local252 = Class58_Sub1.aClass454_2.method28448(local241.aClass3_Sub26_1.anInt1304 * 1865552421);
												if (local241.method11190(arg0, arg1)) {
													if (local252.aStringArray16 != null) {
														if (local252.aStringArray16[4] != null) {
															Class531.method32488(local252.aStringArray16[4], local252.aString225, -1, 1012, -1, (long) (local241.aClass3_Sub26_1.anInt1304 * 1865552421), local252.anInt5054 * -589352987, 0, true, false, (long) (local241.aClass3_Sub26_1.anInt1304 * 1865552421), false);
														}
														if (local252.aStringArray16[3] != null) {
															Class531.method32488(local252.aStringArray16[3], local252.aString225, -1, 1011, -1, (long) (local241.aClass3_Sub26_1.anInt1304 * 1865552421), local252.anInt5054 * -589352987, 0, true, false, (long) (local241.aClass3_Sub26_1.anInt1304 * 1865552421), false);
														}
														if (local252.aStringArray16[2] != null) {
															Class531.method32488(local252.aStringArray16[2], local252.aString225, -1, 1010, -1, (long) (local241.aClass3_Sub26_1.anInt1304 * 1865552421), local252.anInt5054 * -589352987, 0, true, false, (long) (local241.aClass3_Sub26_1.anInt1304 * 1865552421), false);
														}
														if (local252.aStringArray16[1] != null) {
															Class531.method32488(local252.aStringArray16[1], local252.aString225, -1, 1009, -1, (long) (local241.aClass3_Sub26_1.anInt1304 * 1865552421), local252.anInt5054 * -589352987, 0, true, false, (long) (local241.aClass3_Sub26_1.anInt1304 * 1865552421), false);
														}
														if (local252.aStringArray16[0] != null) {
															Class531.method32488(local252.aStringArray16[0], local252.aString225, -1, 1008, -1, (long) (local241.aClass3_Sub26_1.anInt1304 * 1865552421), local252.anInt5054 * -589352987, 0, true, false, (long) (local241.aClass3_Sub26_1.anInt1304 * 1865552421), false);
														}
													}
													if (!local241.aClass3_Sub26_1.aBoolean300) {
														local241.aClass3_Sub26_1.aBoolean300 = true;
														Class291.method25543(Class634.aClass634_8, local241.aClass3_Sub26_1.anInt1304 * 1865552421, local252.anInt5054 * -589352987);
													}
													if (local241.aClass3_Sub26_1.aBoolean300) {
														Class291.method25543(Class634.aClass634_9, local241.aClass3_Sub26_1.anInt1304 * 1865552421, local252.anInt5054 * -589352987);
													}
												} else if (local241.aClass3_Sub26_1.aBoolean300) {
													local241.aClass3_Sub26_1.aBoolean300 = false;
													Class291.method25543(Class634.aClass634_10, local241.aClass3_Sub26_1.anInt1304 * 1865552421, local252.anInt5054 * -589352987);
												}
											}
										}
										return;
									}
									local149 = (Class472) ((Entry) local140.next()).getValue();
									local149.anInt5118 -= -883118159;
								} while (local149.anInt5118 * 250493265 != 0);
								if (local149.anInt5119 * -668806903 > 1 || Class58_Sub1.aBoolean316) {
									local149.anInt5119 -= 1628572985;
									local149.anInt5118 = Class58_Sub1.anInt1439 * 747886611;
								} else {
									local140.remove();
								}
							}
						}
					}
					local149 = (Class472) ((Entry) local140.next()).getValue();
					local149.anInt5118 -= -883118159;
				} while (local149.anInt5118 * 250493265 != 0);
				if (local149.anInt5119 * -668806903 > 1 || Class58_Sub1.aBoolean316) {
					local149.anInt5119 -= 1628572985;
					local149.anInt5118 = Class58_Sub1.anInt1439 * 747886611;
				} else {
					local140.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "nc", descriptor = "(Lclient!vs;I)V", line = 6525)
	static final void method25418(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class457.method28512(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!kj", name = "nu", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6637)
	static final void method25421(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray34 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}
}
