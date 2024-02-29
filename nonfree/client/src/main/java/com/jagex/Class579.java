package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public class Class579 implements Interface12 {

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	static final int anInt5431 = 70;

	@OriginalMember(owner = "client!uk", name = "bb", descriptor = "Lclient!cy;")
	public static Class83 aClass83_37;

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
	public int anInt5432 = 1558789815;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
	public int anInt5437 = 353580339;

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
	public int anInt5433 = -322066947;

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
	public int anInt5434 = -1942788665;

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
	public int anInt5435 = -75464246;

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
	public int anInt5436 = -280918055;

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
	public int anInt5440 = -1901011869;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public int anInt5438 = -1251445241;

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
	public int anInt5439 = 1454241591;

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
	public int anInt5430 = 1654398337;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
	public int anInt5441 = 1575953609;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "Lclient!uo;")
	final Class134 aClass134_1;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(ILclient!uo;)V", line = 25)
	Class579(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1) {
		this.aClass134_1 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "(Lclient!akv;B)V", line = 31)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method31665(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "(Lclient!akv;)V", line = 31)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method31665(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "(Lclient!akv;)V", line = 31)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method31665(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "(Lclient!akv;)V", line = 31)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method31665(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "(Lclient!akv;I)V", line = 38)
	void method31664(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22483();
		} else if (arg1 == 2) {
			this.anInt5432 = arg0.method22478() * -1004467639;
		} else if (arg1 == 3) {
			this.anInt5437 = arg0.method22478() * 1870960589;
		} else if (arg1 == 4) {
			this.anInt5433 = 0;
		} else if (arg1 == 5) {
			this.anInt5435 = arg0.method22483() * -2087205033;
		} else if (arg1 == 6) {
			arg0.method22478();
		} else if (arg1 == 7) {
			this.anInt5436 = arg0.method22549() * 280918055;
		} else if (arg1 == 8) {
			this.anInt5440 = arg0.method22549() * 1901011869;
		} else if (arg1 == 9) {
			this.anInt5438 = arg0.method22549() * 1251445241;
		} else if (arg1 == 10) {
			this.anInt5439 = arg0.method22549() * -1454241591;
		} else if (arg1 == 11) {
			this.anInt5433 = arg0.method22483() * 322066947;
		} else if (arg1 == 12) {
			this.anInt5430 = arg0.method22549() * -1654398337;
		} else if (arg1 == 13) {
			this.anInt5441 = arg0.method22549() * -1575953609;
		}
	}

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "(Lclient!akv;II)V", line = 38)
	void method31665(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22483();
		} else if (arg1 == 2) {
			this.anInt5432 = arg0.method22478() * -1004467639;
		} else if (arg1 == 3) {
			this.anInt5437 = arg0.method22478() * 1870960589;
		} else if (arg1 == 4) {
			this.anInt5433 = 0;
		} else if (arg1 == 5) {
			this.anInt5435 = arg0.method22483() * -2087205033;
		} else if (arg1 == 6) {
			arg0.method22478();
		} else if (arg1 == 7) {
			this.anInt5436 = arg0.method22549() * 280918055;
		} else if (arg1 == 8) {
			this.anInt5440 = arg0.method22549() * 1901011869;
		} else if (arg1 == 9) {
			this.anInt5438 = arg0.method22549() * 1251445241;
		} else if (arg1 == 10) {
			this.anInt5439 = arg0.method22549() * -1454241591;
		} else if (arg1 == 11) {
			this.anInt5433 = arg0.method22483() * 322066947;
		} else if (arg1 == 12) {
			this.anInt5430 = arg0.method22549() * -1654398337;
		} else if (arg1 == 13) {
			this.anInt5441 = arg0.method22549() * -1575953609;
		}
	}

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "(Lclient!akv;I)V", line = 38)
	void method31666(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22483();
		} else if (arg1 == 2) {
			this.anInt5432 = arg0.method22478() * -1004467639;
		} else if (arg1 == 3) {
			this.anInt5437 = arg0.method22478() * 1870960589;
		} else if (arg1 == 4) {
			this.anInt5433 = 0;
		} else if (arg1 == 5) {
			this.anInt5435 = arg0.method22483() * -2087205033;
		} else if (arg1 == 6) {
			arg0.method22478();
		} else if (arg1 == 7) {
			this.anInt5436 = arg0.method22549() * 280918055;
		} else if (arg1 == 8) {
			this.anInt5440 = arg0.method22549() * 1901011869;
		} else if (arg1 == 9) {
			this.anInt5438 = arg0.method22549() * 1251445241;
		} else if (arg1 == 10) {
			this.anInt5439 = arg0.method22549() * -1454241591;
		} else if (arg1 == 11) {
			this.anInt5433 = arg0.method22483() * 322066947;
		} else if (arg1 == 12) {
			this.anInt5430 = arg0.method22549() * -1654398337;
		} else if (arg1 == 13) {
			this.anInt5441 = arg0.method22549() * -1575953609;
		}
	}

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "(Lclient!akv;I)V", line = 38)
	void method31667(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22483();
		} else if (arg1 == 2) {
			this.anInt5432 = arg0.method22478() * -1004467639;
		} else if (arg1 == 3) {
			this.anInt5437 = arg0.method22478() * 1870960589;
		} else if (arg1 == 4) {
			this.anInt5433 = 0;
		} else if (arg1 == 5) {
			this.anInt5435 = arg0.method22483() * -2087205033;
		} else if (arg1 == 6) {
			arg0.method22478();
		} else if (arg1 == 7) {
			this.anInt5436 = arg0.method22549() * 280918055;
		} else if (arg1 == 8) {
			this.anInt5440 = arg0.method22549() * 1901011869;
		} else if (arg1 == 9) {
			this.anInt5438 = arg0.method22549() * 1251445241;
		} else if (arg1 == 10) {
			this.anInt5439 = arg0.method22549() * -1454241591;
		} else if (arg1 == 11) {
			this.anInt5433 = arg0.method22483() * 322066947;
		} else if (arg1 == 12) {
			this.anInt5430 = arg0.method22549() * -1654398337;
		} else if (arg1 == 13) {
			this.anInt5441 = arg0.method22549() * -1575953609;
		}
	}

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "(Lclient!ot;I)I", line = 45)
	public static int method31668(@OriginalArg(0) Class452 arg0) {
		@Pc(4) Class447 local4 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local4.method29198(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat277, (double) local4.aFloat278);
		local4.method29130();
		if (local15 < 0.0D) {
			local15 = 3.141592653589793D + 3.141592653589793D + local15;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "(Lclient!dx;IB)Lclient!cy;", line = 59)
	public Class83 method31669(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class83 local11 = (Class83) this.aClass134_1.aClass232_20.method25835((long) arg1);
		if (local11 == null) {
			this.method31674(arg0);
			local11 = (Class83) this.aClass134_1.aClass232_20.method25835((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "j", descriptor = "(Lclient!dx;I)Lclient!cy;", line = 59)
	public Class83 method31670(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class83 local11 = (Class83) this.aClass134_1.aClass232_20.method25835((long) arg1);
		if (local11 == null) {
			this.method31674(arg0);
			local11 = (Class83) this.aClass134_1.aClass232_20.method25835((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "(Lclient!dx;I)Lclient!cy;", line = 59)
	public Class83 method31671(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class83 local11 = (Class83) this.aClass134_1.aClass232_20.method25835((long) arg1);
		if (local11 == null) {
			this.method31674(arg0);
			local11 = (Class83) this.aClass134_1.aClass232_20.method25835((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(Lclient!dx;II)V", line = 69)
	void method31672(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class478 local3 = this.aClass134_1.aClass478_35;
		if (arg1 >= 0 && this.aClass134_1.aClass232_20.method25835((long) arg1) == null && local3.method29730(arg1)) {
			@Pc(21) Class89 local21 = Class210.method25594(local3, arg1);
			this.aClass134_1.aClass232_20.method25844(arg0.method20076(local21, true), (long) arg1);
		}
	}

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "(Lclient!dx;I)V", line = 69)
	void method31673(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class478 local3 = this.aClass134_1.aClass478_35;
		if (arg1 >= 0 && this.aClass134_1.aClass232_20.method25835((long) arg1) == null && local3.method29730(arg1)) {
			@Pc(21) Class89 local21 = Class210.method25594(local3, arg1);
			this.aClass134_1.aClass232_20.method25844(arg0.method20076(local21, true), (long) arg1);
		}
	}

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "(Lclient!dx;B)V", line = 79)
	void method31674(@OriginalArg(0) Class86 arg0) {
		this.method31672(arg0, this.anInt5436 * -1494517865);
		this.method31672(arg0, this.anInt5440 * 930052789);
		this.method31672(arg0, this.anInt5438 * 62974025);
		this.method31672(arg0, this.anInt5439 * 1463849337);
		this.method31672(arg0, this.anInt5430 * -1550459521);
		this.method31672(arg0, this.anInt5441 * 1417005703);
	}

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "(Lclient!dx;)V", line = 79)
	void method31675(@OriginalArg(0) Class86 arg0) {
		this.method31672(arg0, this.anInt5436 * -1494517865);
		this.method31672(arg0, this.anInt5440 * 930052789);
		this.method31672(arg0, this.anInt5438 * 62974025);
		this.method31672(arg0, this.anInt5439 * 1463849337);
		this.method31672(arg0, this.anInt5430 * -1550459521);
		this.method31672(arg0, this.anInt5441 * 1417005703);
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V", line = 87)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "()V", line = 87)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!uk", name = "t", descriptor = "()V", line = 87)
	@Override
	public void method36036() {
	}
}
