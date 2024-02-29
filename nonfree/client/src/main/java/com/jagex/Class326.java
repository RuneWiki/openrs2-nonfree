package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public class Class326 implements Interface12, Interface6 {

	@OriginalMember(owner = "client!in", name = "d", descriptor = "I")
	public int anInt4082;

	@OriginalMember(owner = "client!in", name = "v", descriptor = "I")
	public int anInt4083;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "I")
	public int anInt4084;

	@OriginalMember(owner = "client!in", name = "p", descriptor = "I")
	public int anInt4085;

	@OriginalMember(owner = "client!in", name = "w", descriptor = "Z")
	public boolean aBoolean704;

	@OriginalMember(owner = "client!in", name = "y", descriptor = "I")
	public int anInt4086;

	@OriginalMember(owner = "client!in", name = "x", descriptor = "I")
	public int anInt4088;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "I")
	public int anInt4089;

	@OriginalMember(owner = "client!in", name = "s", descriptor = "I")
	public int anInt4090;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "I")
	public int anInt4081 = 670689448;

	@OriginalMember(owner = "client!in", name = "t", descriptor = "I")
	public int anInt4087 = 1127781177;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 21)
	Class326() {
	}

	@OriginalMember(owner = "client!in", name = "v", descriptor = "(Lclient!akv;)V", line = 25)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method27529(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!in", name = "p", descriptor = "(Lclient!akv;B)V", line = 25)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method27529(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!in", name = "l", descriptor = "(Lclient!akv;)V", line = 25)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method27529(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!in", name = "y", descriptor = "(Lclient!akv;)V", line = 25)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method27529(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!in", name = "q", descriptor = "(Lclient!akv;II)V", line = 32)
	void method27529(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4081 = arg0.method22483() * -989905643;
		} else if (arg1 == 2) {
			this.aBoolean704 = true;
		} else if (arg1 == 3) {
			this.anInt4083 = arg0.method22487() * 759140553;
			this.anInt4084 = arg0.method22487() * -530423605;
			this.anInt4086 = arg0.method22487() * 400353089;
		} else if (arg1 == 4) {
			this.anInt4085 = arg0.method22478() * 1112851317;
		} else if (arg1 == 5) {
			this.anInt4089 = arg0.method22549() * -1540009587;
		} else if (arg1 == 6) {
			this.anInt4087 = arg0.method22492() * -2084082489;
		} else if (arg1 == 7) {
			this.anInt4088 = arg0.method22487() * -1249387025;
			this.anInt4082 = arg0.method22487() * -1832411745;
			this.anInt4090 = arg0.method22487() * -227090193;
		}
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(Lclient!akv;I)V", line = 32)
	void method27530(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4081 = arg0.method22483() * -989905643;
		} else if (arg1 == 2) {
			this.aBoolean704 = true;
		} else if (arg1 == 3) {
			this.anInt4083 = arg0.method22487() * 759140553;
			this.anInt4084 = arg0.method22487() * -530423605;
			this.anInt4086 = arg0.method22487() * 400353089;
		} else if (arg1 == 4) {
			this.anInt4085 = arg0.method22478() * 1112851317;
		} else if (arg1 == 5) {
			this.anInt4089 = arg0.method22549() * -1540009587;
		} else if (arg1 == 6) {
			this.anInt4087 = arg0.method22492() * -2084082489;
		} else if (arg1 == 7) {
			this.anInt4088 = arg0.method22487() * -1249387025;
			this.anInt4082 = arg0.method22487() * -1832411745;
			this.anInt4090 = arg0.method22487() * -227090193;
		}
	}

	@OriginalMember(owner = "client!in", name = "s", descriptor = "(Lclient!akv;I)V", line = 32)
	void method27531(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4081 = arg0.method22483() * -989905643;
		} else if (arg1 == 2) {
			this.aBoolean704 = true;
		} else if (arg1 == 3) {
			this.anInt4083 = arg0.method22487() * 759140553;
			this.anInt4084 = arg0.method22487() * -530423605;
			this.anInt4086 = arg0.method22487() * 400353089;
		} else if (arg1 == 4) {
			this.anInt4085 = arg0.method22478() * 1112851317;
		} else if (arg1 == 5) {
			this.anInt4089 = arg0.method22549() * -1540009587;
		} else if (arg1 == 6) {
			this.anInt4087 = arg0.method22492() * -2084082489;
		} else if (arg1 == 7) {
			this.anInt4088 = arg0.method22487() * -1249387025;
			this.anInt4082 = arg0.method22487() * -1832411745;
			this.anInt4090 = arg0.method22487() * -227090193;
		}
	}

	@OriginalMember(owner = "client!in", name = "z", descriptor = "(I)V", line = 56)
	@Override
	public void method32872(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!in", name = "g", descriptor = "(I)V", line = 56)
	@Override
	public void method32873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!in", name = "x", descriptor = "(II)V", line = 56)
	@Override
	public void method32874(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V", line = 57)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!in", name = "w", descriptor = "()V", line = 57)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!in", name = "t", descriptor = "()V", line = 57)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!in", name = "da", descriptor = "(Lclient!dx;Lclient!dp;I)V", line = 89)
	static final void method27532(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class209 arg1) {
		if (Class136_Sub1.anInt1702 * -1857977261 == 100 || Class136_Sub1.aClass77_Sub1_Sub8_2 == null) {
			return;
		}
		Class280.method26667();
		Class280.method26667();
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (Class136_Sub1.anInt1702 * -1857977261 < 10) {
			for (local20 = 0; local20 < Class136_Sub1.aClass94ArrayArray1.length; local20++) {
				for (local26 = 0; local26 < Class136_Sub1.aClass94ArrayArray1[local20].length; local26++) {
					Class470.aClass478_125.method29730(Class136_Sub1.aClass619_2.anIntArrayArray63[local20][local26]);
					Class145.aClass478_46.method29730(Class136_Sub1.aClass619_2.anIntArrayArray63[local20][local26]);
				}
			}
			if (!Class136_Sub1.aClass478_38.method29787(Class136_Sub1.aClass77_Sub1_Sub8_2.aString105)) {
				Class136_Sub1.anInt1702 = Class52.aClass478_9.method29789(Class136_Sub1.aClass77_Sub1_Sub8_2.aString105) / 10 * -1532796965;
				return;
			}
			Class136_Sub1.anInt1702 = 1851899534;
		}
		if (Class136_Sub1.anInt1702 * -1857977261 == 10) {
			Class136_Sub1.anInt1674 = Class136_Sub1.aClass77_Sub1_Sub8_2.anInt3003 * -192382841 >> 6 << 6;
			Class136_Sub1.anInt1675 = Class136_Sub1.aClass77_Sub1_Sub8_2.anInt3009 * -1004159431 >> 6 << 6;
			Class136_Sub1.anInt1676 = (Class136_Sub1.aClass77_Sub1_Sub8_2.anInt3008 * 36458189 >> 6 << 6) - Class136_Sub1.anInt1674 + 64;
			Class136_Sub1.anInt1677 = (Class136_Sub1.aClass77_Sub1_Sub8_2.anInt3010 * 189160645 >> 6 << 6) - Class136_Sub1.anInt1675 + 64;
			@Pc(127) int[] local127 = new int[3];
			local26 = -1;
			@Pc(131) int local131 = -1;
			@Pc(135) Class447 local135 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61;
			@Pc(139) Class595 local139 = client.aClass517_1.method30409();
			if (Class136_Sub1.aClass77_Sub1_Sub8_2.method21866(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100, local139.anInt5504 * -424199969 + ((int) local135.aFloat277 >> 9), ((int) local135.aFloat278 >> 9) + local139.anInt5506 * -1166289421, local127)) {
				local26 = local127[1] - Class136_Sub1.anInt1674;
				local131 = local127[2] - Class136_Sub1.anInt1675;
			}
			if (!Class136_Sub1.aBoolean344 && local26 >= 0 && local26 < Class136_Sub1.anInt1676 && local131 >= 0 && local131 < Class136_Sub1.anInt1677) {
				local26 += (int) (Math.random() * 10.0D) - 5;
				local131 += (int) (Math.random() * 10.0D) - 5;
				Class88.anInt610 = local26 * 704227181;
				Class349.anInt4496 = local131 * 980626489;
			} else if (Class136_Sub1.anInt1699 * -1404917313 == -1 || -2064661273 * Class136_Sub1.anInt1705 == -1) {
				Class136_Sub1.aClass77_Sub1_Sub8_2.method21864(Class136_Sub1.aClass77_Sub1_Sub8_2.anInt3007 * -1320299993 >> 14 & 0x3FFF, Class136_Sub1.aClass77_Sub1_Sub8_2.anInt3007 * -1320299993 & 0x3FFF, local127);
				Class88.anInt610 = (local127[1] - Class136_Sub1.anInt1674) * 704227181;
				Class349.anInt4496 = (local127[2] - Class136_Sub1.anInt1675) * 980626489;
			} else {
				Class136_Sub1.aClass77_Sub1_Sub8_2.method21864(Class136_Sub1.anInt1699 * -1404917313, Class136_Sub1.anInt1705 * -2064661273, local127);
				if (local127 != null) {
					Class88.anInt610 = (local127[1] - Class136_Sub1.anInt1674) * 704227181;
					Class349.anInt4496 = (local127[2] - Class136_Sub1.anInt1675) * 980626489;
				}
				Class136_Sub1.anInt1705 = -177934039;
				Class136_Sub1.anInt1699 = -2119321151;
				Class136_Sub1.aBoolean344 = false;
			}
			if (Class136_Sub1.aClass77_Sub1_Sub8_2.anInt3006 * 646871815 == 25) {
				Class136_Sub1.aFloat151 = 2.0F;
				Class136_Sub1.aFloat152 = 2.0F;
			} else if (Class136_Sub1.aClass77_Sub1_Sub8_2.anInt3006 * 646871815 == 37) {
				Class136_Sub1.aFloat151 = 3.0F;
				Class136_Sub1.aFloat152 = 3.0F;
			} else if (Class136_Sub1.aClass77_Sub1_Sub8_2.anInt3006 * 646871815 == 50) {
				Class136_Sub1.aFloat151 = 4.0F;
				Class136_Sub1.aFloat152 = 4.0F;
			} else if (Class136_Sub1.aClass77_Sub1_Sub8_2.anInt3006 * 646871815 == 75) {
				Class136_Sub1.aFloat151 = 6.0F;
				Class136_Sub1.aFloat152 = 6.0F;
			} else if (Class136_Sub1.aClass77_Sub1_Sub8_2.anInt3006 * 646871815 == 100) {
				Class136_Sub1.aFloat151 = 8.0F;
				Class136_Sub1.aFloat152 = 8.0F;
			} else if (Class136_Sub1.aClass77_Sub1_Sub8_2.anInt3006 * 646871815 == 200) {
				Class136_Sub1.aFloat151 = 16.0F;
				Class136_Sub1.aFloat152 = 16.0F;
			} else {
				Class136_Sub1.aFloat151 = 8.0F;
				Class136_Sub1.aFloat152 = 8.0F;
			}
			Class136_Sub1.anInt1685 = (int) Class136_Sub1.aFloat152 >> 1;
			Class136_Sub1.aByteArrayArrayArray11 = Class96_Sub19.method7726(Class136_Sub1.anInt1685);
			Class608.method32139();
			Class136_Sub1.method13898();
			Class612.aClass695_52 = new Class695();
			Class136_Sub1.anInt1669 += (int) (Math.random() * 5.0D) - 2;
			if (Class136_Sub1.anInt1669 < -8) {
				Class136_Sub1.anInt1669 = -8;
			}
			if (Class136_Sub1.anInt1669 > 8) {
				Class136_Sub1.anInt1669 = 8;
			}
			Class136_Sub1.anInt1670 += (int) (Math.random() * 5.0D) - 2;
			if (Class136_Sub1.anInt1670 < -16) {
				Class136_Sub1.anInt1670 = -16;
			}
			if (Class136_Sub1.anInt1670 > 16) {
				Class136_Sub1.anInt1670 = 16;
			}
			Class136_Sub1.method13915(arg1, Class136_Sub1.anInt1669 >> 2 << 10, Class136_Sub1.anInt1670 >> 1);
			Class136_Sub1.aClass35_Sub10_2.method17150(1024, 256);
			Class136_Sub1.aClass35_Sub18_3.method17668(256, 256);
			Class136_Sub1.aClass35_Sub12_8.method18326(4096);
			Class61.aClass35_Sub11_1.method18326(256);
			Class136_Sub1.anInt1702 = -591168228;
		} else if (Class136_Sub1.anInt1702 * -1857977261 == 20) {
			if (!Class136_Sub1.aBoolean338) {
				Class214.method25634(true);
				Class136_Sub1.method13929(arg0, Class136_Sub1.anInt1669, Class136_Sub1.anInt1670, Class136_Sub1.aBoolean338);
				Class136_Sub1.anInt1702 = -1773504684;
				Class214.method25634(true);
				Class138.method14216();
			} else if (Class136_Sub1.method13929(arg0, Class136_Sub1.anInt1669, Class136_Sub1.anInt1670, Class136_Sub1.aBoolean338)) {
				Class136_Sub1.anInt1702 = -1773504684;
			}
		} else if (Class136_Sub1.anInt1702 * -1857977261 == 60) {
			if (Class136_Sub1.aClass478_38.method29770(Class136_Sub1.aClass77_Sub1_Sub8_2.aString105)) {
				if (!Class136_Sub1.aClass478_38.method29787(Class136_Sub1.aClass77_Sub1_Sub8_2.aString105)) {
					return;
				}
				Class136_Sub1.aClass529_2 = Class379.method28303(Class136_Sub1.aClass478_38, Class136_Sub1.aClass77_Sub1_Sub8_2.aString105, client.aBoolean613);
			} else {
				Class136_Sub1.aClass529_2 = new Class529(0);
			}
			Class136_Sub1.method13937();
			Class136_Sub1.anInt1702 = 78394850;
			Class214.method25634(true);
			Class138.method14216();
		} else if (Class136_Sub1.anInt1702 * -1857977261 >= 70) {
			local20 = 0;
			while (true) {
				if (local20 >= 3) {
					Class136_Sub1.anInt1702 = 1339126156;
					System.gc();
					break;
				}
				for (local26 = 0; local26 < 5; local26++) {
					if (Class136_Sub1.aClass94ArrayArray1[local20][local26] == null || Class136_Sub1.aClass17ArrayArray1[local20][local26] == null) {
						Class136_Sub1.aClass94ArrayArray1[local20][local26] = (Class94) Class367.aClass415_1.method28640(client.anInterface51_1, Class136_Sub1.aClass619_2.anIntArrayArray63[local20][local26], true, true);
						Class136_Sub1.aClass17ArrayArray1[local20][local26] = Class367.aClass415_1.method28644(client.anInterface51_1, Class136_Sub1.aClass619_2.anIntArrayArray63[local20][local26]);
						if (Class136_Sub1.aClass94ArrayArray1[local20][local26] == null || Class136_Sub1.aClass17ArrayArray1[local20][local26] == null) {
							return;
						}
						Class136_Sub1.anInt1702 += -303423599;
					}
				}
				local20++;
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "([BI)V", line = 620)
	static void method27533(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method22478();
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				Class613.anInt5586 = local4.method22483() * -1285368653;
			} else if (local8 == 10) {
				local4.method22483();
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "rz", descriptor = "(Lclient!gm;Lclient!yf;I)V", line = 7682)
	static final void method27534(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(12) int local12 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307];
		@Pc(27) int local27 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307] - 1;
		if (arg0.anInt3888 * -1866862435 != 6) {
			throw new RuntimeException("");
		}
		@Pc(47) Class333 local47 = (Class333) Class578.aClass35_Sub3_1.method18319(arg0.anInt3889 * 939166901);
		if (arg0.aClass328_2 == null) {
			arg0.aClass328_2 = new Class328(local47, true);
		}
		arg0.aClass328_2.aLong257 = Class244.method26114() * 8855449811293583851L;
		if (local27 < 0 || local27 >= local47.anIntArray435.length) {
			throw new RuntimeException("" + local27);
		}
		arg0.aClass328_2.anIntArray434[local27] = local12;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!in", name = "yh", descriptor = "(Lclient!yf;B)V", line = 9025)
	static final void method27535(@OriginalArg(0) Class665 arg0) {
		if (client.aString162 == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = client.aString162;
		}
	}

	@OriginalMember(owner = "client!in", name = "adi", descriptor = "(Lclient!yf;I)V", line = 9727)
	static final void method27536(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		arg0.anInt5784 -= 617999126;
		@Pc(27) int local27 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(37) int local37 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(43) Class17 local43 = Class367.aClass415_1.method28644(client.anInterface51_1, local37);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local43.method308(local13, local27, Class148.aClass83Array6);
	}

	@OriginalMember(owner = "client!in", name = "apc", descriptor = "(Lclient!yf;B)V", line = 12288)
	static final void method27537(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local12 != Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1.method16065()) {
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1, local12);
			Class667.method33150();
			client.aBoolean593 = false;
		}
	}
}
