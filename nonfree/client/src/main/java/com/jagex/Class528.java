package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public class Class528 {

	@OriginalMember(owner = "client!sb", name = "fv", descriptor = "Lclient!pr;")
	public static Class473 aClass473_1;

	@OriginalMember(owner = "client!sb", name = "if", descriptor = "Lclient!ady;")
	public static Class80_Sub1_Sub2 aClass80_Sub1_Sub2_5;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
	int anInt5169;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Lclient!rz;")
	Class525 aClass525_1 = new Class525();

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!jh;")
	Class342 aClass342_1 = new Class342();

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "[S")
	short[] aShortArray131 = new short[192];

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "[S")
	short[] aShortArray132 = new short[12];

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "[S")
	short[] aShortArray130 = new short[12];

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "[S")
	short[] aShortArray133 = new short[12];

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "[S")
	short[] aShortArray136 = new short[12];

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "[S")
	short[] aShortArray134 = new short[192];

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "[Lclient!jg;")
	Class341[] aClass341Array1 = new Class341[4];

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[S")
	short[] aShortArray135 = new short[114];

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Lclient!jg;")
	Class341 aClass341_1 = new Class341(4);

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!sg;")
	Class533 aClass533_1 = new Class533(this);

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!sg;")
	Class533 aClass533_2 = new Class533(this);

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "Lclient!sw;")
	Class545 aClass545_1 = new Class545(this);

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	int anInt5167 = -802802155;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	int anInt5168 = -1791194049;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V", line = 26)
	Class528() {
		for (@Pc(75) int local75 = 0; local75 < 4; local75++) {
			this.aClass341Array1[local75] = new Class341(6);
		}
	}

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "(IB)Z", line = 31)
	boolean method30687(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (arg0 != this.anInt5167 * 1745032899) {
			this.anInt5167 = arg0 * 802802155;
			this.anInt5168 = Math.max(this.anInt5167 * 1745032899, 1) * 1791194049;
			this.aClass525_1.method30642(Math.max(this.anInt5168 * -1487496127, 4096));
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "(I)Z", line = 31)
	boolean method30688(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (arg0 != this.anInt5167 * 1745032899) {
			this.anInt5167 = arg0 * 802802155;
			this.anInt5168 = Math.max(this.anInt5167 * 1745032899, 1) * 1791194049;
			this.aClass525_1.method30642(Math.max(this.anInt5168 * -1487496127, 4096));
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "(I)Z", line = 31)
	boolean method30689(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (arg0 != this.anInt5167 * 1745032899) {
			this.anInt5167 = arg0 * 802802155;
			this.anInt5168 = Math.max(this.anInt5167 * 1745032899, 1) * 1791194049;
			this.aClass525_1.method30642(Math.max(this.anInt5168 * -1487496127, 4096));
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "(I)Z", line = 31)
	boolean method30690(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (arg0 != this.anInt5167 * 1745032899) {
			this.anInt5167 = arg0 * 802802155;
			this.anInt5168 = Math.max(this.anInt5167 * 1745032899, 1) * 1791194049;
			this.aClass525_1.method30642(Math.max(this.anInt5168 * -1487496127, 4096));
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(IIII)Z", line = 41)
	boolean method30691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.aClass545_1.method30959(arg1, arg0);
		@Pc(20) int local20 = 0x1 << arg2;
		this.aClass533_1.method30765(local20);
		this.aClass533_2.method30765(local20);
		this.anInt5169 = (local20 - 1) * 925045027;
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "()V", line = 51)
	void method30692() throws IOException {
		this.aClass525_1.method30652(false);
		Class350.method27880(this.aShortArray131);
		Class350.method27880(this.aShortArray134);
		Class350.method27880(this.aShortArray132);
		Class350.method27880(this.aShortArray130);
		Class350.method27880(this.aShortArray133);
		Class350.method27880(this.aShortArray136);
		Class350.method27880(this.aShortArray135);
		this.aClass545_1.method30962();
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass341Array1[local38].method27748();
		}
		this.aClass533_1.method30771();
		this.aClass533_2.method30771();
		this.aClass341_1.method27748();
		this.aClass342_1.method27771();
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "()V", line = 51)
	void method30693() throws IOException {
		this.aClass525_1.method30652(false);
		Class350.method27880(this.aShortArray131);
		Class350.method27880(this.aShortArray134);
		Class350.method27880(this.aShortArray132);
		Class350.method27880(this.aShortArray130);
		Class350.method27880(this.aShortArray133);
		Class350.method27880(this.aShortArray136);
		Class350.method27880(this.aShortArray135);
		this.aClass545_1.method30962();
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass341Array1[local38].method27748();
		}
		this.aClass533_1.method30771();
		this.aClass533_2.method30771();
		this.aClass341_1.method27748();
		this.aClass342_1.method27771();
	}

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "()V", line = 51)
	void method30694() throws IOException {
		this.aClass525_1.method30652(false);
		Class350.method27880(this.aShortArray131);
		Class350.method27880(this.aShortArray134);
		Class350.method27880(this.aShortArray132);
		Class350.method27880(this.aShortArray130);
		Class350.method27880(this.aShortArray133);
		Class350.method27880(this.aShortArray136);
		Class350.method27880(this.aShortArray135);
		this.aClass545_1.method30962();
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass341Array1[local38].method27748();
		}
		this.aClass533_1.method30771();
		this.aClass533_2.method30771();
		this.aClass341_1.method27748();
		this.aClass342_1.method27771();
	}

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "(I)V", line = 51)
	void method30695() throws IOException {
		this.aClass525_1.method30652(false);
		Class350.method27880(this.aShortArray131);
		Class350.method27880(this.aShortArray134);
		Class350.method27880(this.aShortArray132);
		Class350.method27880(this.aShortArray130);
		Class350.method27880(this.aShortArray133);
		Class350.method27880(this.aShortArray136);
		Class350.method27880(this.aShortArray135);
		this.aClass545_1.method30962();
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass341Array1[local38].method27748();
		}
		this.aClass533_1.method30771();
		this.aClass533_2.method30771();
		this.aClass341_1.method27748();
		this.aClass342_1.method27771();
	}

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "()V", line = 51)
	void method30696() throws IOException {
		this.aClass525_1.method30652(false);
		Class350.method27880(this.aShortArray131);
		Class350.method27880(this.aShortArray134);
		Class350.method27880(this.aShortArray132);
		Class350.method27880(this.aShortArray130);
		Class350.method27880(this.aShortArray133);
		Class350.method27880(this.aShortArray136);
		Class350.method27880(this.aShortArray135);
		this.aClass545_1.method30962();
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass341Array1[local38].method27748();
		}
		this.aClass533_1.method30771();
		this.aClass533_2.method30771();
		this.aClass341_1.method27748();
		this.aClass342_1.method27771();
	}

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z", line = 69)
	boolean method30697(@OriginalArg(0) InputStream arg0, @OriginalArg(1) OutputStream arg1, @OriginalArg(2) long arg2) throws IOException {
		this.aClass342_1.method27766(arg0);
		this.aClass525_1.method30645(arg1);
		this.method30695();
		@Pc(15) int local15 = Class305.method27239();
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) long local25 = 0L;
		@Pc(27) byte local27 = 0;
		while (arg2 < 0L || local25 < arg2) {
			@Pc(43) int local43 = (int) local25 & this.anInt5169 * -1311529333;
			if (this.aClass342_1.method27779(this.aShortArray131, local43 + (local15 << 4)) == 0) {
				@Pc(63) Class544 local63 = this.aClass545_1.method30964((int) local25, local27);
				if (Class574.method31490(local15)) {
					local27 = local63.method30954(this.aClass342_1);
				} else {
					local27 = local63.method30957(this.aClass342_1, this.aClass525_1.method30670(local17));
				}
				this.aClass525_1.method30666(local27);
				local15 = Class285.method26722(local15);
				local25++;
			} else {
				@Pc(110) int local110;
				@Pc(147) int local147;
				if (this.aClass342_1.method27779(this.aShortArray132, local15) == 1) {
					local110 = 0;
					if (this.aClass342_1.method27779(this.aShortArray130, local15) != 0) {
						if (this.aClass342_1.method27779(this.aShortArray133, local15) == 0) {
							local147 = local19;
						} else {
							if (this.aClass342_1.method27779(this.aShortArray136, local15) == 0) {
								local147 = local21;
							} else {
								local147 = local23;
								local23 = local21;
							}
							local21 = local19;
						}
						local19 = local17;
						local17 = local147;
					} else if (this.aClass342_1.method27779(this.aShortArray134, (local15 << 4) + local43) == 0) {
						local15 = Exception_Sub6.method18118(local15);
						local110 = 1;
					}
					if (local110 == 0) {
						local110 = this.aClass533_2.method30775(this.aClass342_1, local43) + 2;
						local15 = Class90_Sub2.method6677(local15);
					}
				} else {
					local23 = local21;
					local21 = local19;
					local19 = local17;
					local110 = this.aClass533_1.method30775(this.aClass342_1, local43) + 2;
					local15 = Class243.method26023(local15);
					local147 = this.aClass341Array1[Class240.method25934(local110)].method27753(this.aClass342_1);
					if (local147 >= 4) {
						@Pc(227) int local227 = (local147 >> 1) - 1;
						local17 = (local147 & 0x1 | 0x2) << local227;
						if (local147 < 14) {
							local17 += Class292.method27010(this.aShortArray135, local17 - local147 - 1, this.aClass342_1, local227);
						} else {
							local17 += this.aClass342_1.method27774(local227 - 4) << 4;
							local17 += this.aClass341_1.method27756(this.aClass342_1);
							if (local17 < 0) {
								if (local17 != -1) {
									return false;
								}
								break;
							}
						}
					} else {
						local17 = local147;
					}
				}
				if ((long) local17 >= local25 || local17 >= this.anInt5168 * -1487496127) {
					return false;
				}
				this.aClass525_1.method30659(local17, local110);
				local25 += local110;
				local27 = this.aClass525_1.method30670(0);
			}
		}
		this.aClass525_1.method30655();
		this.aClass525_1.method30649();
		this.aClass342_1.method27769();
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z", line = 69)
	boolean method30698(@OriginalArg(0) InputStream arg0, @OriginalArg(1) OutputStream arg1, @OriginalArg(2) long arg2) throws IOException {
		this.aClass342_1.method27766(arg0);
		this.aClass525_1.method30645(arg1);
		this.method30695();
		@Pc(15) int local15 = Class305.method27239();
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) long local25 = 0L;
		@Pc(27) byte local27 = 0;
		while (arg2 < 0L || local25 < arg2) {
			@Pc(43) int local43 = (int) local25 & this.anInt5169 * -1311529333;
			if (this.aClass342_1.method27779(this.aShortArray131, local43 + (local15 << 4)) == 0) {
				@Pc(63) Class544 local63 = this.aClass545_1.method30964((int) local25, local27);
				if (Class574.method31490(local15)) {
					local27 = local63.method30954(this.aClass342_1);
				} else {
					local27 = local63.method30957(this.aClass342_1, this.aClass525_1.method30670(local17));
				}
				this.aClass525_1.method30666(local27);
				local15 = Class285.method26722(local15);
				local25++;
			} else {
				@Pc(110) int local110;
				@Pc(147) int local147;
				if (this.aClass342_1.method27779(this.aShortArray132, local15) == 1) {
					local110 = 0;
					if (this.aClass342_1.method27779(this.aShortArray130, local15) != 0) {
						if (this.aClass342_1.method27779(this.aShortArray133, local15) == 0) {
							local147 = local19;
						} else {
							if (this.aClass342_1.method27779(this.aShortArray136, local15) == 0) {
								local147 = local21;
							} else {
								local147 = local23;
								local23 = local21;
							}
							local21 = local19;
						}
						local19 = local17;
						local17 = local147;
					} else if (this.aClass342_1.method27779(this.aShortArray134, (local15 << 4) + local43) == 0) {
						local15 = Exception_Sub6.method18118(local15);
						local110 = 1;
					}
					if (local110 == 0) {
						local110 = this.aClass533_2.method30775(this.aClass342_1, local43) + 2;
						local15 = Class90_Sub2.method6677(local15);
					}
				} else {
					local23 = local21;
					local21 = local19;
					local19 = local17;
					local110 = this.aClass533_1.method30775(this.aClass342_1, local43) + 2;
					local15 = Class243.method26023(local15);
					local147 = this.aClass341Array1[Class240.method25934(local110)].method27753(this.aClass342_1);
					if (local147 >= 4) {
						@Pc(227) int local227 = (local147 >> 1) - 1;
						local17 = (local147 & 0x1 | 0x2) << local227;
						if (local147 < 14) {
							local17 += Class292.method27010(this.aShortArray135, local17 - local147 - 1, this.aClass342_1, local227);
						} else {
							local17 += this.aClass342_1.method27774(local227 - 4) << 4;
							local17 += this.aClass341_1.method27756(this.aClass342_1);
							if (local17 < 0) {
								if (local17 != -1) {
									return false;
								}
								break;
							}
						}
					} else {
						local17 = local147;
					}
				}
				if ((long) local17 >= local25 || local17 >= this.anInt5168 * -1487496127) {
					return false;
				}
				this.aClass525_1.method30659(local17, local110);
				local25 += local110;
				local27 = this.aClass525_1.method30670(0);
			}
		}
		this.aClass525_1.method30655();
		this.aClass525_1.method30649();
		this.aClass342_1.method27769();
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z", line = 69)
	boolean method30699(@OriginalArg(0) InputStream arg0, @OriginalArg(1) OutputStream arg1, @OriginalArg(2) long arg2) throws IOException {
		this.aClass342_1.method27766(arg0);
		this.aClass525_1.method30645(arg1);
		this.method30695();
		@Pc(15) int local15 = Class305.method27239();
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) long local25 = 0L;
		@Pc(27) byte local27 = 0;
		while (arg2 < 0L || local25 < arg2) {
			@Pc(43) int local43 = (int) local25 & this.anInt5169 * -1311529333;
			if (this.aClass342_1.method27779(this.aShortArray131, local43 + (local15 << 4)) == 0) {
				@Pc(63) Class544 local63 = this.aClass545_1.method30964((int) local25, local27);
				if (Class574.method31490(local15)) {
					local27 = local63.method30954(this.aClass342_1);
				} else {
					local27 = local63.method30957(this.aClass342_1, this.aClass525_1.method30670(local17));
				}
				this.aClass525_1.method30666(local27);
				local15 = Class285.method26722(local15);
				local25++;
			} else {
				@Pc(110) int local110;
				@Pc(147) int local147;
				if (this.aClass342_1.method27779(this.aShortArray132, local15) == 1) {
					local110 = 0;
					if (this.aClass342_1.method27779(this.aShortArray130, local15) != 0) {
						if (this.aClass342_1.method27779(this.aShortArray133, local15) == 0) {
							local147 = local19;
						} else {
							if (this.aClass342_1.method27779(this.aShortArray136, local15) == 0) {
								local147 = local21;
							} else {
								local147 = local23;
								local23 = local21;
							}
							local21 = local19;
						}
						local19 = local17;
						local17 = local147;
					} else if (this.aClass342_1.method27779(this.aShortArray134, (local15 << 4) + local43) == 0) {
						local15 = Exception_Sub6.method18118(local15);
						local110 = 1;
					}
					if (local110 == 0) {
						local110 = this.aClass533_2.method30775(this.aClass342_1, local43) + 2;
						local15 = Class90_Sub2.method6677(local15);
					}
				} else {
					local23 = local21;
					local21 = local19;
					local19 = local17;
					local110 = this.aClass533_1.method30775(this.aClass342_1, local43) + 2;
					local15 = Class243.method26023(local15);
					local147 = this.aClass341Array1[Class240.method25934(local110)].method27753(this.aClass342_1);
					if (local147 >= 4) {
						@Pc(227) int local227 = (local147 >> 1) - 1;
						local17 = (local147 & 0x1 | 0x2) << local227;
						if (local147 < 14) {
							local17 += Class292.method27010(this.aShortArray135, local17 - local147 - 1, this.aClass342_1, local227);
						} else {
							local17 += this.aClass342_1.method27774(local227 - 4) << 4;
							local17 += this.aClass341_1.method27756(this.aClass342_1);
							if (local17 < 0) {
								if (local17 != -1) {
									return false;
								}
								break;
							}
						}
					} else {
						local17 = local147;
					}
				}
				if ((long) local17 >= local25 || local17 >= this.anInt5168 * -1487496127) {
					return false;
				}
				this.aClass525_1.method30659(local17, local110);
				local25 += local110;
				local27 = this.aClass525_1.method30670(0);
			}
		}
		this.aClass525_1.method30655();
		this.aClass525_1.method30649();
		this.aClass342_1.method27769();
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V", line = 72)
	static void method30700() {
		if (!Class241.method25966()) {
			return;
		}
		if (Class96_Sub12.aStringArray10 == null) {
			Class41.method696();
		}
		Class157.aBoolean553 = true;
		Class157.anInt3245 = 0;
	}

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "([BB)Z", line = 155)
	boolean method30701(@OriginalArg(0) byte[] arg0) {
		if (arg0.length < 5) {
			return false;
		}
		@Pc(11) int local11 = arg0[0] & 0xFF;
		@Pc(15) int local15 = local11 % 9;
		@Pc(19) int local19 = local11 / 9;
		@Pc(23) int local23 = local19 % 5;
		@Pc(27) int local27 = local19 / 5;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			local29 += (arg0[local31 + 1] & 0xFF) << local31 * 8;
		}
		return this.method30691(local15, local23, local27) ? this.method30687(local29) : false;
	}

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "([B)Z", line = 155)
	boolean method30702(@OriginalArg(0) byte[] arg0) {
		if (arg0.length < 5) {
			return false;
		}
		@Pc(11) int local11 = arg0[0] & 0xFF;
		@Pc(15) int local15 = local11 % 9;
		@Pc(19) int local19 = local11 / 9;
		@Pc(23) int local23 = local19 % 5;
		@Pc(27) int local27 = local19 / 5;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			local29 += (arg0[local31 + 1] & 0xFF) << local31 * 8;
		}
		return this.method30691(local15, local23, local27) ? this.method30687(local29) : false;
	}

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "([B)Z", line = 155)
	boolean method30703(@OriginalArg(0) byte[] arg0) {
		if (arg0.length < 5) {
			return false;
		}
		@Pc(11) int local11 = arg0[0] & 0xFF;
		@Pc(15) int local15 = local11 % 9;
		@Pc(19) int local19 = local11 / 9;
		@Pc(23) int local23 = local19 % 5;
		@Pc(27) int local27 = local19 / 5;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			local29 += (arg0[local31 + 1] & 0xFF) << local31 * 8;
		}
		return this.method30691(local15, local23, local27) ? this.method30687(local29) : false;
	}

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "([B)Z", line = 155)
	boolean method30704(@OriginalArg(0) byte[] arg0) {
		if (arg0.length < 5) {
			return false;
		}
		@Pc(11) int local11 = arg0[0] & 0xFF;
		@Pc(15) int local15 = local11 % 9;
		@Pc(19) int local19 = local11 / 9;
		@Pc(23) int local23 = local19 % 5;
		@Pc(27) int local27 = local19 / 5;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			local29 += (arg0[local31 + 1] & 0xFF) << local31 * 8;
		}
		return this.method30691(local15, local23, local27) ? this.method30687(local29) : false;
	}

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "([B)Z", line = 155)
	boolean method30705(@OriginalArg(0) byte[] arg0) {
		if (arg0.length < 5) {
			return false;
		}
		@Pc(11) int local11 = arg0[0] & 0xFF;
		@Pc(15) int local15 = local11 % 9;
		@Pc(19) int local19 = local11 / 9;
		@Pc(23) int local23 = local19 % 5;
		@Pc(27) int local27 = local19 / 5;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			local29 += (arg0[local31 + 1] & 0xFF) << local31 * 8;
		}
		return this.method30691(local15, local23, local27) ? this.method30687(local29) : false;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "([B)Z", line = 155)
	boolean method30706(@OriginalArg(0) byte[] arg0) {
		if (arg0.length < 5) {
			return false;
		}
		@Pc(11) int local11 = arg0[0] & 0xFF;
		@Pc(15) int local15 = local11 % 9;
		@Pc(19) int local19 = local11 / 9;
		@Pc(23) int local23 = local19 % 5;
		@Pc(27) int local27 = local19 / 5;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			local29 += (arg0[local31 + 1] & 0xFF) << local31 * 8;
		}
		return this.method30691(local15, local23, local27) ? this.method30687(local29) : false;
	}

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "(Lclient!dx;I)V", line = 286)
	static void method30707(@OriginalArg(0) Class86 arg0) {
		if (Class257.method26227() && Class329.method27586()) {
			Class667.method33162(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		}
		arg0.method20151(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		arg0.method20088(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350, Class157.anInt3245 * 431834035 << 24 | 0x332277, 1);
		@Pc(43) int local43 = 350 / (Class157.anInt3239 * -103516429);
		@Pc(55) int local55;
		if (Class157.anInt3240 * -1716872169 > 0) {
			local55 = 346 - Class157.anInt3239 * -103516429 - 4;
			@Pc(67) int local67 = local55 * local43 / (local43 + Class157.anInt3240 * -1716872169 - 1);
			@Pc(69) int local69 = 4;
			if (Class157.anInt3240 * -1716872169 > 1) {
				local69 += (Class157.anInt3240 * -1716872169 - 1 - Class157.anInt3247 * -596800939) * (local55 - local67) / (Class157.anInt3240 * -1716872169 - 1);
			}
			arg0.method20088(Class149_Sub4.anInt2368 * 1771907305 - 16, local69, 12, local67, Class157.anInt3245 * 431834035 << 24 | 0x332277, 2);
			for (@Pc(118) int local118 = Class157.anInt3247 * -596800939; local118 < local43 + Class157.anInt3247 * -596800939 && local118 < Class157.anInt3240 * -1716872169; local118++) {
				@Pc(137) String[] local137 = Class398.method28452(Class96_Sub12.aStringArray10[local118], '\b');
				@Pc(148) int local148 = (Class149_Sub4.anInt2368 * 1771907305 - 8 - 16) / local137.length;
				for (@Pc(150) int local150 = 0; local150 < local137.length; local150++) {
					@Pc(160) int local160 = local148 * local150 + 8;
					arg0.method20151(local160, 0, local160 + local148 - 8, 350);
					Class128_Sub1.aClass94_5.method7602(Class338.method27696(local137[local150]), local160, 350 - Class157.anInt3241 * -583687411 - 2 - Class611.aClass17_13.anInt51 * 728893755 - (local118 - Class157.anInt3247 * -596800939) * Class157.anInt3239 * -103516429, -1, -16777216);
				}
			}
		}
		Class248.aClass94_7.method7607("881 1", Class149_Sub4.anInt2368 * 1771907305 - 25, 330, -1, -16777216);
		arg0.method20151(0, 0, Class149_Sub4.anInt2368 * 1771907305, 350);
		arg0.method19994(0, 350 - Class157.anInt3241 * -583687411, Class149_Sub4.anInt2368 * 1771907305, -1);
		Class260.aClass94_8.method7602("--> " + Class338.method27696(Class157.aString126), 10, 350 - Class346.aClass17_12.anInt51 * 728893755 - 1, -1, -16777216);
		if (Class77_Sub36.aBoolean351) {
			local55 = -1;
			if (client.anInt3414 % 30 > 15) {
				local55 = 16777215;
			}
			arg0.method19998(Class346.aClass17_12.method297("--> " + Class338.method27696(Class157.aString126).substring(0, Class157.anInt3244 * -1360080309)) + 10, 350 - Class346.aClass17_12.anInt51 * 728893755 - 11, 12, local55);
		}
		arg0.method20299();
		Class28.method497();
	}

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "(ILjava/lang/String;II)V", line = 328)
	public static void method30708(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class77_Sub1_Sub9 local5 = Class438.method28917(Class135.aClass135_33, arg0, -1);
		if (local5 == null) {
			return;
		}
		@Pc(12) Class665 local12 = Class566.method31372();
		local12.anIntArray537 = new int[local5.anInt3012 * -39710947];
		local12.anObjectArray46 = new String[local5.anInt3013 * 1127446605];
		local12.anObjectArray46[0] = arg1;
		local12.anIntArray537[0] = arg2;
		Class320.method27452(local5, 500000, local12);
	}

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "(II)V", line = 959)
	static void method30709(@OriginalArg(0) int arg0) {
		if (Class675.anInt5802 * 513656689 == 131) {
			Class589.anInt5465 = arg0 * -829940197;
		} else if (Class675.anInt5802 * 513656689 == 220) {
			Class589.anInt5490 = arg0 * 1385443459;
		}
	}

	@OriginalMember(owner = "client!sb", name = "mg", descriptor = "(Lclient!yf;B)V", line = 6854)
	static final void method30710(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class502.method30230(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!sb", name = "wk", descriptor = "(Lclient!yf;B)V", line = 8512)
	static final void method30711(@OriginalArg(0) Class665 arg0) {
		if (client.anInt3467 * 136304939 >= 5 && client.anInt3467 * 136304939 <= 9) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3467 * 136304939;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "agr", descriptor = "(Lclient!yf;I)V", line = 10541)
	static final void method30712(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(34) int local34 = RuntimeException_Sub4.aClass41_2.method688(local13).method22318(local23).anInt5714 * 41641943;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local34;
	}

	@OriginalMember(owner = "client!sb", name = "alm", descriptor = "(Lclient!yf;S)V", line = 11584)
	static final void method30713(@OriginalArg(0) Class665 arg0) {
		if (!Class597.aClass107_Sub1_2.method8880().method27600()) {
			throw new RuntimeException();
		}
		@Pc(14) Class115_Sub3 local14 = (Class115_Sub3) Class597.aClass107_Sub1_2.method8871();
		local14.method21231(Class497.aClass443_2, -1, 0.0F);
		client.aBoolean612 = true;
	}

	@OriginalMember(owner = "client!sb", name = "azh", descriptor = "(Lclient!yf;I)V", line = 13680)
	static final void method30714(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(18) Class671 local18 = (Class671) Class457.method29479(Class671.method33202(), arg0.anIntArray536[arg0.anInt5784 * 2088438307]);
		@Pc(31) Class595 local31 = new Class595(arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1]);
		if (-217302955 * local31.anInt5505 == -1) {
			throw new RuntimeException("");
		} else if (local18 != Class671.aClass671_1 && local18 != Class671.aClass671_4 && Class671.aClass671_5 != local18) {
			throw new RuntimeException("");
		} else if (client.aClass82_2 != null) {
			@Pc(64) Class77_Sub20 local64 = Class365.method28132(Class414.aClass414_88, client.aClass82_2.aClass16_1);
			local64.aClass77_Sub39_Sub1_2.method22610(local31.anInt5504 * -424199969);
			local64.aClass77_Sub39_Sub1_2.method22408(local31.anInt5506 * -1166289421);
			local64.aClass77_Sub39_Sub1_2.method22578(local18.method36479());
			client.aClass82_2.method2004(local64);
		}
	}
}
