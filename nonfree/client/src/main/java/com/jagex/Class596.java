package com.jagex;

import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public class Class596 implements Interface13 {

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
	static final int anInt5488 = 70;

	@OriginalMember(owner = "client!uk", name = "sr", descriptor = "Lclient!afu;")
	public static Class113_Sub1 aClass113_Sub1_1;

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
	public int anInt5495 = -211070433;

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
	public int anInt5490 = 175136337;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
	public int anInt5491 = -1574465001;

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
	public int anInt5492 = 1096236339;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
	public int anInt5498 = 1414489714;

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
	public int anInt5489 = -1792977653;

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
	public int anInt5487 = 585876987;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
	public int anInt5496 = 1912693335;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public int anInt5497 = -903374255;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	public int anInt5494 = -1845932589;

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
	public int anInt5493 = -1355432475;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "Lclient!uy;")
	final Class156 aClass156_1;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V", line = 23)
	public static void method31764(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1) {
		Class564.anApplet3 = arg0;
		Class564.aString228 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(ILclient!uy;)V", line = 25)
	Class596(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1) {
		this.aClass156_1 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(Lclient!alw;B)V", line = 31)
	@Override
	public void method36654(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method31750(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "(Lclient!alw;)V", line = 31)
	@Override
	public void method36655(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method31750(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "(Lclient!alw;)V", line = 31)
	@Override
	public void method36656(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method31750(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "(Lclient!alw;)V", line = 31)
	@Override
	public void method36657(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method31750(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "(Lclient!alw;)V", line = 31)
	@Override
	public void method36658(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method31750(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "(Lclient!alw;II)V", line = 38)
	void method31750(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22415();
		} else if (arg1 == 2) {
			this.anInt5495 = arg0.method22413() * 807636705;
		} else if (arg1 == 3) {
			this.anInt5490 = arg0.method22413() * -706719569;
		} else if (arg1 == 4) {
			this.anInt5491 = 0;
		} else if (arg1 == 5) {
			this.anInt5498 = arg0.method22415() * 1615480563;
		} else if (arg1 == 6) {
			arg0.method22413();
		} else if (arg1 == 7) {
			this.anInt5489 = arg0.method22436() * 1792977653;
		} else if (arg1 == 8) {
			this.anInt5487 = arg0.method22436() * -585876987;
		} else if (arg1 == 9) {
			this.anInt5496 = arg0.method22436() * -1912693335;
		} else if (arg1 == 10) {
			this.anInt5497 = arg0.method22436() * 903374255;
		} else if (arg1 == 11) {
			this.anInt5491 = arg0.method22415() * 1574465001;
		} else if (arg1 == 12) {
			this.anInt5494 = arg0.method22436() * 1845932589;
		} else if (arg1 == 13) {
			this.anInt5493 = arg0.method22436() * 1355432475;
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(Lclient!alw;I)V", line = 38)
	void method31755(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22415();
		} else if (arg1 == 2) {
			this.anInt5495 = arg0.method22413() * 807636705;
		} else if (arg1 == 3) {
			this.anInt5490 = arg0.method22413() * -706719569;
		} else if (arg1 == 4) {
			this.anInt5491 = 0;
		} else if (arg1 == 5) {
			this.anInt5498 = arg0.method22415() * 1615480563;
		} else if (arg1 == 6) {
			arg0.method22413();
		} else if (arg1 == 7) {
			this.anInt5489 = arg0.method22436() * 1792977653;
		} else if (arg1 == 8) {
			this.anInt5487 = arg0.method22436() * -585876987;
		} else if (arg1 == 9) {
			this.anInt5496 = arg0.method22436() * -1912693335;
		} else if (arg1 == 10) {
			this.anInt5497 = arg0.method22436() * 903374255;
		} else if (arg1 == 11) {
			this.anInt5491 = arg0.method22415() * 1574465001;
		} else if (arg1 == 12) {
			this.anInt5494 = arg0.method22436() * 1845932589;
		} else if (arg1 == 13) {
			this.anInt5493 = arg0.method22436() * 1355432475;
		}
	}

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "(Lclient!alw;I)V", line = 38)
	void method31756(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22415();
		} else if (arg1 == 2) {
			this.anInt5495 = arg0.method22413() * 807636705;
		} else if (arg1 == 3) {
			this.anInt5490 = arg0.method22413() * -706719569;
		} else if (arg1 == 4) {
			this.anInt5491 = 0;
		} else if (arg1 == 5) {
			this.anInt5498 = arg0.method22415() * 1615480563;
		} else if (arg1 == 6) {
			arg0.method22413();
		} else if (arg1 == 7) {
			this.anInt5489 = arg0.method22436() * 1792977653;
		} else if (arg1 == 8) {
			this.anInt5487 = arg0.method22436() * -585876987;
		} else if (arg1 == 9) {
			this.anInt5496 = arg0.method22436() * -1912693335;
		} else if (arg1 == 10) {
			this.anInt5497 = arg0.method22436() * 903374255;
		} else if (arg1 == 11) {
			this.anInt5491 = arg0.method22415() * 1574465001;
		} else if (arg1 == 12) {
			this.anInt5494 = arg0.method22436() * 1845932589;
		} else if (arg1 == 13) {
			this.anInt5493 = arg0.method22436() * 1355432475;
		}
	}

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "(Lclient!dh;IB)Lclient!cm;", line = 59)
	public Class100 method31751(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class100 local11 = (Class100) this.aClass156_1.aClass240_23.method25839((long) arg1);
		if (local11 == null) {
			this.method31753(arg0);
			local11 = (Class100) this.aClass156_1.aClass240_23.method25839((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "(Lclient!dh;I)Lclient!cm;", line = 59)
	public Class100 method31757(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class100 local11 = (Class100) this.aClass156_1.aClass240_23.method25839((long) arg1);
		if (local11 == null) {
			this.method31753(arg0);
			local11 = (Class100) this.aClass156_1.aClass240_23.method25839((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "(Lclient!dh;I)Lclient!cm;", line = 59)
	public Class100 method31758(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class100 local11 = (Class100) this.aClass156_1.aClass240_23.method25839((long) arg1);
		if (local11 == null) {
			this.method31753(arg0);
			local11 = (Class100) this.aClass156_1.aClass240_23.method25839((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "(Lclient!dh;I)Lclient!cm;", line = 59)
	public Class100 method31759(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class100 local11 = (Class100) this.aClass156_1.aClass240_23.method25839((long) arg1);
		if (local11 == null) {
			this.method31753(arg0);
			local11 = (Class100) this.aClass156_1.aClass240_23.method25839((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "(II)I", line = 66)
	static int method31761(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class682.method33276(arg0);
	}

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "(Lclient!dh;II)V", line = 69)
	void method31752(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class497 local3 = this.aClass156_1.aClass497_47;
		if (arg1 >= 0 && this.aClass156_1.aClass240_23.method25839((long) arg1) == null && local3.method30054(arg1)) {
			@Pc(21) Class105 local21 = Class203.method24650(local3, arg1);
			this.aClass156_1.aClass240_23.method25830(arg0.method20499(local21, true), (long) arg1);
		}
	}

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "(Lclient!dh;I)V", line = 69)
	void method31760(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class497 local3 = this.aClass156_1.aClass497_47;
		if (arg1 >= 0 && this.aClass156_1.aClass240_23.method25839((long) arg1) == null && local3.method30054(arg1)) {
			@Pc(21) Class105 local21 = Class203.method24650(local3, arg1);
			this.aClass156_1.aClass240_23.method25830(arg0.method20499(local21, true), (long) arg1);
		}
	}

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "(Lclient!dh;)V", line = 79)
	void method31749(@OriginalArg(0) Class104 arg0) {
		this.method31752(arg0, this.anInt5489 * -1393086115);
		this.method31752(arg0, this.anInt5487 * 816546509);
		this.method31752(arg0, this.anInt5496 * 857036441);
		this.method31752(arg0, this.anInt5497 * 168300879);
		this.method31752(arg0, this.anInt5494 * -128291419);
		this.method31752(arg0, this.anInt5493 * -1920415725);
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(Lclient!dh;I)V", line = 79)
	void method31753(@OriginalArg(0) Class104 arg0) {
		this.method31752(arg0, this.anInt5489 * -1393086115);
		this.method31752(arg0, this.anInt5487 * 816546509);
		this.method31752(arg0, this.anInt5496 * 857036441);
		this.method31752(arg0, this.anInt5497 * 168300879);
		this.method31752(arg0, this.anInt5494 * -128291419);
		this.method31752(arg0, this.anInt5493 * -1920415725);
	}

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "(Lclient!dh;)V", line = 79)
	void method31754(@OriginalArg(0) Class104 arg0) {
		this.method31752(arg0, this.anInt5489 * -1393086115);
		this.method31752(arg0, this.anInt5487 * 816546509);
		this.method31752(arg0, this.anInt5496 * 857036441);
		this.method31752(arg0, this.anInt5497 * 168300879);
		this.method31752(arg0, this.anInt5494 * -128291419);
		this.method31752(arg0, this.anInt5493 * -1920415725);
	}

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "(I)V", line = 87)
	@Override
	public void method36653() {
	}

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "()V", line = 87)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)[Lclient!db;", line = 140)
	static Class222[] method31765() {
		return new Class222[] { Class222.aClass222_2, Class222.aClass222_5, Class222.aClass222_3, Class222.aClass222_4, Class222.aClass222_1 };
	}

	@OriginalMember(owner = "client!uk", name = "pc", descriptor = "(Lclient!yf;B)V", line = 7860)
	static final void method31762(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class28.method603(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!uk", name = "asl", descriptor = "(Lclient!yf;I)V", line = 13142)
	static final void method31763(@OriginalArg(0) Class681 arg0) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]);
		Class106_Sub1.method5148();
	}
}
