package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sz")
public class Class565 {

	@OriginalMember(owner = "client!sz", name = "y", descriptor = "I")
	int anInt5384;

	@OriginalMember(owner = "client!sz", name = "e", descriptor = "Lclient!ru;")
	Class538 aClass538_1 = new Class538();

	@OriginalMember(owner = "client!sz", name = "n", descriptor = "Lclient!jp;")
	Class365 aClass365_1 = new Class365();

	@OriginalMember(owner = "client!sz", name = "m", descriptor = "[S")
	short[] aShortArray138 = new short[192];

	@OriginalMember(owner = "client!sz", name = "k", descriptor = "[S")
	short[] aShortArray132 = new short[12];

	@OriginalMember(owner = "client!sz", name = "f", descriptor = "[S")
	short[] aShortArray133 = new short[12];

	@OriginalMember(owner = "client!sz", name = "w", descriptor = "[S")
	short[] aShortArray136 = new short[12];

	@OriginalMember(owner = "client!sz", name = "l", descriptor = "[S")
	short[] aShortArray134 = new short[12];

	@OriginalMember(owner = "client!sz", name = "u", descriptor = "[S")
	short[] aShortArray135 = new short[192];

	@OriginalMember(owner = "client!sz", name = "z", descriptor = "[Lclient!jg;")
	Class360[] aClass360Array3 = new Class360[4];

	@OriginalMember(owner = "client!sz", name = "p", descriptor = "[S")
	short[] aShortArray137 = new short[114];

	@OriginalMember(owner = "client!sz", name = "d", descriptor = "Lclient!jg;")
	Class360 aClass360_2 = new Class360(4);

	@OriginalMember(owner = "client!sz", name = "c", descriptor = "Lclient!sc;")
	Class546 aClass546_2 = new Class546(this);

	@OriginalMember(owner = "client!sz", name = "r", descriptor = "Lclient!sc;")
	Class546 aClass546_1 = new Class546(this);

	@OriginalMember(owner = "client!sz", name = "v", descriptor = "Lclient!sj;")
	Class552 aClass552_1 = new Class552(this);

	@OriginalMember(owner = "client!sz", name = "o", descriptor = "I")
	int anInt5382 = 1955288547;

	@OriginalMember(owner = "client!sz", name = "s", descriptor = "I")
	int anInt5383 = -1434808789;

	@OriginalMember(owner = "client!sz", name = "<init>", descriptor = "()V", line = 26)
	Class565() {
		for (@Pc(75) int local75 = 0; local75 < 4; local75++) {
			this.aClass360Array3[local75] = new Class360(6);
		}
	}

	@OriginalMember(owner = "client!sz", name = "w", descriptor = "(I)Z", line = 31)
	boolean method31239(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (arg0 != this.anInt5382 * -1507760075) {
			this.anInt5382 = arg0 * -1955288547;
			this.anInt5383 = Math.max(this.anInt5382 * -1507760075, 1) * 1434808789;
			this.aClass538_1.method30763(Math.max(this.anInt5383 * 1636056957, 4096));
		}
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "l", descriptor = "(I)Z", line = 31)
	boolean method31240(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (arg0 != this.anInt5382 * -1507760075) {
			this.anInt5382 = arg0 * -1955288547;
			this.anInt5383 = Math.max(this.anInt5382 * -1507760075, 1) * 1434808789;
			this.aClass538_1.method30763(Math.max(this.anInt5383 * 1636056957, 4096));
		}
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "u", descriptor = "(I)Z", line = 31)
	boolean method31241(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (arg0 != this.anInt5382 * -1507760075) {
			this.anInt5382 = arg0 * -1955288547;
			this.anInt5383 = Math.max(this.anInt5382 * -1507760075, 1) * 1434808789;
			this.aClass538_1.method30763(Math.max(this.anInt5383 * 1636056957, 4096));
		}
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "e", descriptor = "(IB)Z", line = 31)
	boolean method31246(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (arg0 != this.anInt5382 * -1507760075) {
			this.anInt5382 = arg0 * -1955288547;
			this.anInt5383 = Math.max(this.anInt5382 * -1507760075, 1) * 1434808789;
			this.aClass538_1.method30763(Math.max(this.anInt5383 * 1636056957, 4096));
		}
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "p", descriptor = "(III)Z", line = 41)
	boolean method31234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.aClass552_1.method31037(arg1, arg0);
		@Pc(20) int local20 = 0x1 << arg2;
		this.aClass546_2.method30963(local20);
		this.aClass546_1.method30963(local20);
		this.anInt5384 = (local20 - 1) * 579102611;
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "z", descriptor = "(III)Z", line = 41)
	boolean method31242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.aClass552_1.method31037(arg1, arg0);
		@Pc(20) int local20 = 0x1 << arg2;
		this.aClass546_2.method30963(local20);
		this.aClass546_1.method30963(local20);
		this.anInt5384 = (local20 - 1) * 579102611;
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "d", descriptor = "(III)Z", line = 41)
	boolean method31243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.aClass552_1.method31037(arg1, arg0);
		@Pc(20) int local20 = 0x1 << arg2;
		this.aClass546_2.method30963(local20);
		this.aClass546_1.method30963(local20);
		this.anInt5384 = (local20 - 1) * 579102611;
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "n", descriptor = "(IIII)Z", line = 41)
	boolean method31249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.aClass552_1.method31037(arg1, arg0);
		@Pc(20) int local20 = 0x1 << arg2;
		this.aClass546_2.method30963(local20);
		this.aClass546_1.method30963(local20);
		this.anInt5384 = (local20 - 1) * 579102611;
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "m", descriptor = "(I)V", line = 51)
	void method31233() throws IOException {
		this.aClass538_1.method30765(false);
		Class294.method26596(this.aShortArray138);
		Class294.method26596(this.aShortArray135);
		Class294.method26596(this.aShortArray132);
		Class294.method26596(this.aShortArray133);
		Class294.method26596(this.aShortArray136);
		Class294.method26596(this.aShortArray134);
		Class294.method26596(this.aShortArray137);
		this.aClass552_1.method31044();
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass360Array3[local38].method27793();
		}
		this.aClass546_2.method30964();
		this.aClass546_1.method30964();
		this.aClass360_2.method27793();
		this.aClass365_1.method27903();
	}

	@OriginalMember(owner = "client!sz", name = "v", descriptor = "()V", line = 51)
	void method31236() throws IOException {
		this.aClass538_1.method30765(false);
		Class294.method26596(this.aShortArray138);
		Class294.method26596(this.aShortArray135);
		Class294.method26596(this.aShortArray132);
		Class294.method26596(this.aShortArray133);
		Class294.method26596(this.aShortArray136);
		Class294.method26596(this.aShortArray134);
		Class294.method26596(this.aShortArray137);
		this.aClass552_1.method31044();
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass360Array3[local38].method27793();
		}
		this.aClass546_2.method30964();
		this.aClass546_1.method30964();
		this.aClass360_2.method27793();
		this.aClass365_1.method27903();
	}

	@OriginalMember(owner = "client!sz", name = "c", descriptor = "()V", line = 51)
	void method31244() throws IOException {
		this.aClass538_1.method30765(false);
		Class294.method26596(this.aShortArray138);
		Class294.method26596(this.aShortArray135);
		Class294.method26596(this.aShortArray132);
		Class294.method26596(this.aShortArray133);
		Class294.method26596(this.aShortArray136);
		Class294.method26596(this.aShortArray134);
		Class294.method26596(this.aShortArray137);
		this.aClass552_1.method31044();
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass360Array3[local38].method27793();
		}
		this.aClass546_2.method30964();
		this.aClass546_1.method30964();
		this.aClass360_2.method27793();
		this.aClass365_1.method27903();
	}

	@OriginalMember(owner = "client!sz", name = "r", descriptor = "()V", line = 51)
	void method31245() throws IOException {
		this.aClass538_1.method30765(false);
		Class294.method26596(this.aShortArray138);
		Class294.method26596(this.aShortArray135);
		Class294.method26596(this.aShortArray132);
		Class294.method26596(this.aShortArray133);
		Class294.method26596(this.aShortArray136);
		Class294.method26596(this.aShortArray134);
		Class294.method26596(this.aShortArray137);
		this.aClass552_1.method31044();
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass360Array3[local38].method27793();
		}
		this.aClass546_2.method30964();
		this.aClass546_1.method30964();
		this.aClass360_2.method27793();
		this.aClass365_1.method27903();
	}

	@OriginalMember(owner = "client!sz", name = "o", descriptor = "()V", line = 51)
	void method31247() throws IOException {
		this.aClass538_1.method30765(false);
		Class294.method26596(this.aShortArray138);
		Class294.method26596(this.aShortArray135);
		Class294.method26596(this.aShortArray132);
		Class294.method26596(this.aShortArray133);
		Class294.method26596(this.aShortArray136);
		Class294.method26596(this.aShortArray134);
		Class294.method26596(this.aShortArray137);
		this.aClass552_1.method31044();
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass360Array3[local38].method27793();
		}
		this.aClass546_2.method30964();
		this.aClass546_1.method30964();
		this.aClass360_2.method27793();
		this.aClass365_1.method27903();
	}

	@OriginalMember(owner = "client!sz", name = "k", descriptor = "(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z", line = 69)
	boolean method31235(@OriginalArg(0) InputStream arg0, @OriginalArg(1) OutputStream arg1, @OriginalArg(2) long arg2) throws IOException {
		this.aClass365_1.method27901(arg0);
		this.aClass538_1.method30781(arg1);
		this.method31233();
		@Pc(15) int local15 = Class607.method31928();
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) long local25 = 0L;
		@Pc(27) byte local27 = 0;
		while (arg2 < 0L || local25 < arg2) {
			@Pc(43) int local43 = (int) local25 & this.anInt5384 * -609235301;
			if (this.aClass365_1.method27905(this.aShortArray138, local43 + (local15 << 4)) == 0) {
				@Pc(63) Class544 local63 = this.aClass552_1.method31039((int) local25, local27);
				if (Class334.method27401(local15)) {
					local27 = local63.method30953(this.aClass365_1);
				} else {
					local27 = local63.method30951(this.aClass365_1, this.aClass538_1.method30762(local17));
				}
				this.aClass538_1.method30768(local27);
				local15 = Class625.method32240(local15);
				local25++;
			} else {
				@Pc(110) int local110;
				@Pc(147) int local147;
				if (this.aClass365_1.method27905(this.aShortArray132, local15) == 1) {
					local110 = 0;
					if (this.aClass365_1.method27905(this.aShortArray133, local15) != 0) {
						if (this.aClass365_1.method27905(this.aShortArray136, local15) == 0) {
							local147 = local19;
						} else {
							if (this.aClass365_1.method27905(this.aShortArray134, local15) == 0) {
								local147 = local21;
							} else {
								local147 = local23;
								local23 = local21;
							}
							local21 = local19;
						}
						local19 = local17;
						local17 = local147;
					} else if (this.aClass365_1.method27905(this.aShortArray135, (local15 << 4) + local43) == 0) {
						local15 = Class291.method26574(local15);
						local110 = 1;
					}
					if (local110 == 0) {
						local110 = this.aClass546_1.method30965(this.aClass365_1, local43) + 2;
						local15 = Class529.method30400(local15);
					}
				} else {
					local23 = local21;
					local21 = local19;
					local19 = local17;
					local110 = this.aClass546_2.method30965(this.aClass365_1, local43) + 2;
					local15 = Class655.method32745(local15);
					local147 = this.aClass360Array3[Class507.method30231(local110)].method27794(this.aClass365_1);
					if (local147 >= 4) {
						@Pc(226) int local226 = (local147 >> 1) - 1;
						local17 = (local147 & 0x1 | 0x2) << local226;
						if (local147 < 14) {
							local17 += Class432.method28788(this.aShortArray137, local17 - local147 - 1, this.aClass365_1, local226);
						} else {
							local17 += this.aClass365_1.method27904(local226 - 4) << 4;
							local17 += this.aClass360_2.method27797(this.aClass365_1);
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
				if ((long) local17 >= local25 || local17 >= this.anInt5383 * 1636056957) {
					return false;
				}
				this.aClass538_1.method30767(local17, local110);
				local25 += local110;
				local27 = this.aClass538_1.method30762(0);
			}
		}
		this.aClass538_1.method30779();
		this.aClass538_1.method30764();
		this.aClass365_1.method27907();
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "y", descriptor = "(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z", line = 69)
	boolean method31237(@OriginalArg(0) InputStream arg0, @OriginalArg(1) OutputStream arg1, @OriginalArg(2) long arg2) throws IOException {
		this.aClass365_1.method27901(arg0);
		this.aClass538_1.method30781(arg1);
		this.method31233();
		@Pc(15) int local15 = Class607.method31928();
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) long local25 = 0L;
		@Pc(27) byte local27 = 0;
		while (arg2 < 0L || local25 < arg2) {
			@Pc(43) int local43 = (int) local25 & this.anInt5384 * -609235301;
			if (this.aClass365_1.method27905(this.aShortArray138, local43 + (local15 << 4)) == 0) {
				@Pc(63) Class544 local63 = this.aClass552_1.method31039((int) local25, local27);
				if (Class334.method27401(local15)) {
					local27 = local63.method30953(this.aClass365_1);
				} else {
					local27 = local63.method30951(this.aClass365_1, this.aClass538_1.method30762(local17));
				}
				this.aClass538_1.method30768(local27);
				local15 = Class625.method32240(local15);
				local25++;
			} else {
				@Pc(110) int local110;
				@Pc(147) int local147;
				if (this.aClass365_1.method27905(this.aShortArray132, local15) == 1) {
					local110 = 0;
					if (this.aClass365_1.method27905(this.aShortArray133, local15) != 0) {
						if (this.aClass365_1.method27905(this.aShortArray136, local15) == 0) {
							local147 = local19;
						} else {
							if (this.aClass365_1.method27905(this.aShortArray134, local15) == 0) {
								local147 = local21;
							} else {
								local147 = local23;
								local23 = local21;
							}
							local21 = local19;
						}
						local19 = local17;
						local17 = local147;
					} else if (this.aClass365_1.method27905(this.aShortArray135, (local15 << 4) + local43) == 0) {
						local15 = Class291.method26574(local15);
						local110 = 1;
					}
					if (local110 == 0) {
						local110 = this.aClass546_1.method30965(this.aClass365_1, local43) + 2;
						local15 = Class529.method30400(local15);
					}
				} else {
					local23 = local21;
					local21 = local19;
					local19 = local17;
					local110 = this.aClass546_2.method30965(this.aClass365_1, local43) + 2;
					local15 = Class655.method32745(local15);
					local147 = this.aClass360Array3[Class507.method30231(local110)].method27794(this.aClass365_1);
					if (local147 >= 4) {
						@Pc(226) int local226 = (local147 >> 1) - 1;
						local17 = (local147 & 0x1 | 0x2) << local226;
						if (local147 < 14) {
							local17 += Class432.method28788(this.aShortArray137, local17 - local147 - 1, this.aClass365_1, local226);
						} else {
							local17 += this.aClass365_1.method27904(local226 - 4) << 4;
							local17 += this.aClass360_2.method27797(this.aClass365_1);
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
				if ((long) local17 >= local25 || local17 >= this.anInt5383 * 1636056957) {
					return false;
				}
				this.aClass538_1.method30767(local17, local110);
				local25 += local110;
				local27 = this.aClass538_1.method30762(0);
			}
		}
		this.aClass538_1.method30779();
		this.aClass538_1.method30764();
		this.aClass365_1.method27907();
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "s", descriptor = "(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z", line = 69)
	boolean method31248(@OriginalArg(0) InputStream arg0, @OriginalArg(1) OutputStream arg1, @OriginalArg(2) long arg2) throws IOException {
		this.aClass365_1.method27901(arg0);
		this.aClass538_1.method30781(arg1);
		this.method31233();
		@Pc(15) int local15 = Class607.method31928();
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) long local25 = 0L;
		@Pc(27) byte local27 = 0;
		while (arg2 < 0L || local25 < arg2) {
			@Pc(43) int local43 = (int) local25 & this.anInt5384 * -609235301;
			if (this.aClass365_1.method27905(this.aShortArray138, local43 + (local15 << 4)) == 0) {
				@Pc(63) Class544 local63 = this.aClass552_1.method31039((int) local25, local27);
				if (Class334.method27401(local15)) {
					local27 = local63.method30953(this.aClass365_1);
				} else {
					local27 = local63.method30951(this.aClass365_1, this.aClass538_1.method30762(local17));
				}
				this.aClass538_1.method30768(local27);
				local15 = Class625.method32240(local15);
				local25++;
			} else {
				@Pc(110) int local110;
				@Pc(147) int local147;
				if (this.aClass365_1.method27905(this.aShortArray132, local15) == 1) {
					local110 = 0;
					if (this.aClass365_1.method27905(this.aShortArray133, local15) != 0) {
						if (this.aClass365_1.method27905(this.aShortArray136, local15) == 0) {
							local147 = local19;
						} else {
							if (this.aClass365_1.method27905(this.aShortArray134, local15) == 0) {
								local147 = local21;
							} else {
								local147 = local23;
								local23 = local21;
							}
							local21 = local19;
						}
						local19 = local17;
						local17 = local147;
					} else if (this.aClass365_1.method27905(this.aShortArray135, (local15 << 4) + local43) == 0) {
						local15 = Class291.method26574(local15);
						local110 = 1;
					}
					if (local110 == 0) {
						local110 = this.aClass546_1.method30965(this.aClass365_1, local43) + 2;
						local15 = Class529.method30400(local15);
					}
				} else {
					local23 = local21;
					local21 = local19;
					local19 = local17;
					local110 = this.aClass546_2.method30965(this.aClass365_1, local43) + 2;
					local15 = Class655.method32745(local15);
					local147 = this.aClass360Array3[Class507.method30231(local110)].method27794(this.aClass365_1);
					if (local147 >= 4) {
						@Pc(226) int local226 = (local147 >> 1) - 1;
						local17 = (local147 & 0x1 | 0x2) << local226;
						if (local147 < 14) {
							local17 += Class432.method28788(this.aShortArray137, local17 - local147 - 1, this.aClass365_1, local226);
						} else {
							local17 += this.aClass365_1.method27904(local226 - 4) << 4;
							local17 += this.aClass360_2.method27797(this.aClass365_1);
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
				if ((long) local17 >= local25 || local17 >= this.anInt5383 * 1636056957) {
					return false;
				}
				this.aClass538_1.method30767(local17, local110);
				local25 += local110;
				local27 = this.aClass538_1.method30762(0);
			}
		}
		this.aClass538_1.method30779();
		this.aClass538_1.method30764();
		this.aClass365_1.method27907();
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "f", descriptor = "([BI)Z", line = 155)
	boolean method31238(@OriginalArg(0) byte[] arg0) {
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
		return this.method31249(local15, local23, local27) ? this.method31246(local29) : false;
	}

	@OriginalMember(owner = "client!sz", name = "q", descriptor = "([B)Z", line = 155)
	boolean method31250(@OriginalArg(0) byte[] arg0) {
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
		return this.method31249(local15, local23, local27) ? this.method31246(local29) : false;
	}

	@OriginalMember(owner = "client!sz", name = "x", descriptor = "([B)Z", line = 155)
	boolean method31251(@OriginalArg(0) byte[] arg0) {
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
		return this.method31249(local15, local23, local27) ? this.method31246(local29) : false;
	}

	@OriginalMember(owner = "client!sz", name = "fb", descriptor = "(I)V", line = 2726)
	static final void method31254() {
		if (Class56.method18034(client.anInt3435 * -849002901) || Class1.method15(client.anInt3435 * -849002901)) {
			client.aClass67_15 = Class67.aClass67_5;
			Class642.method32522(false);
		} else {
			client.aClass67_15 = Class67.aClass67_11;
			Class166_Sub20.aClass160_2 = client.aClass175_2.method24356();
			client.aClass175_2.method24358();
			Class481.method29756(14);
		}
	}

	@OriginalMember(owner = "client!sz", name = "asb", descriptor = "(Lclient!yf;B)V", line = 13125)
	static final void method31253(@OriginalArg(0) Class681 arg0) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub12_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]);
		Class106_Sub1.method5148();
		client.aBoolean601 = false;
	}

	@OriginalMember(owner = "client!sz", name = "azl", descriptor = "(Lclient!yf;I)V", line = 14193)
	static final void method31252(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub29_1.method16057() ? 1 : 0;
	}

	@OriginalMember(owner = "client!sz", name = "bdw", descriptor = "(Lclient!yf;I)V", line = 14798)
	static final void method31255(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26278(local12).method26392();
	}
}
