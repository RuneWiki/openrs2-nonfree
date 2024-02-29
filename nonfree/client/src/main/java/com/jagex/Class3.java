package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public class Class3 implements Interface12, Interface6 {

	@OriginalMember(owner = "client!aaa", name = "us", descriptor = "J")
	static long aLong1;

	@OriginalMember(owner = "client!aaa", name = "w", descriptor = "I")
	public int anInt9;

	@OriginalMember(owner = "client!aaa", name = "t", descriptor = "I")
	public int anInt10;

	@OriginalMember(owner = "client!aaa", name = "q", descriptor = "I")
	public int anInt12;

	@OriginalMember(owner = "client!aaa", name = "x", descriptor = "I")
	public int anInt13;

	@OriginalMember(owner = "client!aaa", name = "p", descriptor = "I")
	int anInt7 = 0;

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
	public int anInt8 = 14511443;

	@OriginalMember(owner = "client!aaa", name = "v", descriptor = "I")
	public int anInt11 = 650527232;

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "Z")
	public boolean aBoolean1 = true;

	@OriginalMember(owner = "client!aaa", name = "y", descriptor = "Z")
	public boolean aBoolean2 = true;

	@OriginalMember(owner = "client!aaa", name = "p", descriptor = "(Lclient!akv;B)Lclient!uf;", line = 12)
	public static Interface64 method24(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(5) Class592 local5 = Class327.method27538(arg0.method22478());
		if (local5 == Class592.aClass592_3) {
			return Class35_Sub17.method17429(arg0);
		} else if (Class592.aClass592_2 == local5) {
			return Class77.method24067(arg0);
		} else if (local5 == Class592.aClass592_1) {
			return Class551.method30989(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V", line = 20)
	Class3() {
	}

	@OriginalMember(owner = "client!aaa", name = "p", descriptor = "(Lclient!akv;B)V", line = 24)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method25(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "(Lclient!akv;)V", line = 24)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method25(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "y", descriptor = "(Lclient!akv;)V", line = 24)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method25(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "v", descriptor = "(Lclient!akv;)V", line = 24)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method25(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "q", descriptor = "(Lclient!akv;II)V", line = 31)
	void method25(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt7 = arg0.method22492() * 433662529;
			this.method29(this.anInt7 * -1547967039);
		} else if (arg1 == 2) {
			this.anInt8 = arg0.method22483() * -14511443;
			if (this.anInt8 * 587899173 == 65535) {
				this.anInt8 = 14511443;
			}
		} else if (arg1 == 3) {
			this.anInt11 = (arg0.method22483() << 2) * 546530081;
		} else if (arg1 == 4) {
			this.aBoolean1 = false;
		} else if (arg1 == 5) {
			this.aBoolean2 = false;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "s", descriptor = "(Lclient!akv;I)V", line = 31)
	void method26(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt7 = arg0.method22492() * 433662529;
			this.method29(this.anInt7 * -1547967039);
		} else if (arg1 == 2) {
			this.anInt8 = arg0.method22483() * -14511443;
			if (this.anInt8 * 587899173 == 65535) {
				this.anInt8 = 14511443;
			}
		} else if (arg1 == 3) {
			this.anInt11 = (arg0.method22483() << 2) * 546530081;
		} else if (arg1 == 4) {
			this.aBoolean1 = false;
		} else if (arg1 == 5) {
			this.aBoolean2 = false;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "r", descriptor = "(Lclient!akv;I)V", line = 31)
	void method27(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt7 = arg0.method22492() * 433662529;
			this.method29(this.anInt7 * -1547967039);
		} else if (arg1 == 2) {
			this.anInt8 = arg0.method22483() * -14511443;
			if (this.anInt8 * 587899173 == 65535) {
				this.anInt8 = 14511443;
			}
		} else if (arg1 == 3) {
			this.anInt11 = (arg0.method22483() << 2) * 546530081;
		} else if (arg1 == 4) {
			this.aBoolean1 = false;
		} else if (arg1 == 5) {
			this.aBoolean2 = false;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "j", descriptor = "(Lclient!akv;I)V", line = 31)
	void method28(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt7 = arg0.method22492() * 433662529;
			this.method29(this.anInt7 * -1547967039);
		} else if (arg1 == 2) {
			this.anInt8 = arg0.method22483() * -14511443;
			if (this.anInt8 * 587899173 == 65535) {
				this.anInt8 = 14511443;
			}
		} else if (arg1 == 3) {
			this.anInt11 = (arg0.method22483() << 2) * 546530081;
		} else if (arg1 == 4) {
			this.aBoolean1 = false;
		} else if (arg1 == 5) {
			this.aBoolean2 = false;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "(II)V", line = 46)
	void method29(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local40 + local26) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt10 = (int) (local56 * 256.0D) * -460664459;
		this.anInt12 = (int) (local62 * 256.0D) * -1195531791;
		if (this.anInt10 * 1312863965 < 0) {
			this.anInt10 = 0;
		} else if (this.anInt10 * 1312863965 > 255) {
			this.anInt10 = -1505320053;
		}
		if (this.anInt12 * 1484599057 < 0) {
			this.anInt12 = 0;
		} else if (this.anInt12 * 1484599057 > 255) {
			this.anInt12 = 82071311;
		}
		if (local62 > 0.5D) {
			this.anInt13 = (int) ((1.0D - local62) * 512.0D * local56) * -1294595001;
		} else {
			this.anInt13 = (int) (local56 * 512.0D * local62) * -1294595001;
		}
		if (this.anInt13 * -1721639561 < 1) {
			this.anInt13 = -1294595001;
		}
		this.anInt9 = (int) ((double) (this.anInt13 * -1721639561) * local54) * -1023186795;
	}

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "(I)V", line = 46)
	void method30(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local40 + local26) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt10 = (int) (local56 * 256.0D) * -460664459;
		this.anInt12 = (int) (local62 * 256.0D) * -1195531791;
		if (this.anInt10 * 1312863965 < 0) {
			this.anInt10 = 0;
		} else if (this.anInt10 * 1312863965 > 255) {
			this.anInt10 = -1505320053;
		}
		if (this.anInt12 * 1484599057 < 0) {
			this.anInt12 = 0;
		} else if (this.anInt12 * 1484599057 > 255) {
			this.anInt12 = 82071311;
		}
		if (local62 > 0.5D) {
			this.anInt13 = (int) ((1.0D - local62) * 512.0D * local56) * -1294595001;
		} else {
			this.anInt13 = (int) (local56 * 512.0D * local62) * -1294595001;
		}
		if (this.anInt13 * -1721639561 < 1) {
			this.anInt13 = -1294595001;
		}
		this.anInt9 = (int) ((double) (this.anInt13 * -1721639561) * local54) * -1023186795;
	}

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "(I)V", line = 46)
	void method31(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local40 + local26) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt10 = (int) (local56 * 256.0D) * -460664459;
		this.anInt12 = (int) (local62 * 256.0D) * -1195531791;
		if (this.anInt10 * 1312863965 < 0) {
			this.anInt10 = 0;
		} else if (this.anInt10 * 1312863965 > 255) {
			this.anInt10 = -1505320053;
		}
		if (this.anInt12 * 1484599057 < 0) {
			this.anInt12 = 0;
		} else if (this.anInt12 * 1484599057 > 255) {
			this.anInt12 = 82071311;
		}
		if (local62 > 0.5D) {
			this.anInt13 = (int) ((1.0D - local62) * 512.0D * local56) * -1294595001;
		} else {
			this.anInt13 = (int) (local56 * 512.0D * local62) * -1294595001;
		}
		if (this.anInt13 * -1721639561 < 1) {
			this.anInt13 = -1294595001;
		}
		this.anInt9 = (int) ((double) (this.anInt13 * -1721639561) * local54) * -1023186795;
	}

	@OriginalMember(owner = "client!aaa", name = "u", descriptor = "(I)V", line = 46)
	void method32(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local40 + local26) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt10 = (int) (local56 * 256.0D) * -460664459;
		this.anInt12 = (int) (local62 * 256.0D) * -1195531791;
		if (this.anInt10 * 1312863965 < 0) {
			this.anInt10 = 0;
		} else if (this.anInt10 * 1312863965 > 255) {
			this.anInt10 = -1505320053;
		}
		if (this.anInt12 * 1484599057 < 0) {
			this.anInt12 = 0;
		} else if (this.anInt12 * 1484599057 > 255) {
			this.anInt12 = 82071311;
		}
		if (local62 > 0.5D) {
			this.anInt13 = (int) ((1.0D - local62) * 512.0D * local56) * -1294595001;
		} else {
			this.anInt13 = (int) (local56 * 512.0D * local62) * -1294595001;
		}
		if (this.anInt13 * -1721639561 < 1) {
			this.anInt13 = -1294595001;
		}
		this.anInt9 = (int) ((double) (this.anInt13 * -1721639561) * local54) * -1023186795;
	}

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "(I)V", line = 46)
	void method33(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local40 + local26) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local26 + local40);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		this.anInt10 = (int) (local56 * 256.0D) * -460664459;
		this.anInt12 = (int) (local62 * 256.0D) * -1195531791;
		if (this.anInt10 * 1312863965 < 0) {
			this.anInt10 = 0;
		} else if (this.anInt10 * 1312863965 > 255) {
			this.anInt10 = -1505320053;
		}
		if (this.anInt12 * 1484599057 < 0) {
			this.anInt12 = 0;
		} else if (this.anInt12 * 1484599057 > 255) {
			this.anInt12 = 82071311;
		}
		if (local62 > 0.5D) {
			this.anInt13 = (int) ((1.0D - local62) * 512.0D * local56) * -1294595001;
		} else {
			this.anInt13 = (int) (local56 * 512.0D * local62) * -1294595001;
		}
		if (this.anInt13 * -1721639561 < 1) {
			this.anInt13 = -1294595001;
		}
		this.anInt9 = (int) ((double) (this.anInt13 * -1721639561) * local54) * -1023186795;
	}

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)V", line = 78)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!aaa", name = "w", descriptor = "()V", line = 78)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!aaa", name = "t", descriptor = "()V", line = 78)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!aaa", name = "x", descriptor = "(II)V", line = 79)
	@Override
	public void method32874(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "(I)V", line = 79)
	@Override
	public void method32873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aaa", name = "z", descriptor = "(I)V", line = 79)
	@Override
	public void method32872(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aaa", name = "amd", descriptor = "(Lclient!yf;I)V", line = 11647)
	static final void method34(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(51) Class447 local51 = Class447.method29120((float) local13, (float) local23, (float) local33);
		if (-1.0F == local51.aFloat277) {
			local51.aFloat277 = Float.POSITIVE_INFINITY;
		}
		if (local51.aFloat276 == -1.0F) {
			local51.aFloat276 = Float.POSITIVE_INFINITY;
		}
		if (-1.0F == local51.aFloat278) {
			local51.aFloat278 = Float.POSITIVE_INFINITY;
		}
		Class597.aClass107_Sub1_2.method8810(local51);
		Class597.aClass107_Sub1_2.method8797((float) local43 / 1000.0F);
		local51.method29130();
	}
}
