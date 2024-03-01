package com.jagex;

import java.lang.management.GarbageCollectorMXBean;
import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akr")
public class Class93_Sub28 extends Class93 {

	@OriginalMember(owner = "client!akr", name = "wk", descriptor = "Ljava/lang/management/GarbageCollectorMXBean;")
	static GarbageCollectorMXBean aGarbageCollectorMXBean1;

	@OriginalMember(owner = "client!akr", name = "d", descriptor = "B")
	public byte aByte55;

	@OriginalMember(owner = "client!akr", name = "w", descriptor = "[Lclient!kb;")
	public Class373[] aClass373Array1;

	@OriginalMember(owner = "client!akr", name = "u", descriptor = "[I")
	int[] anIntArray182;

	@OriginalMember(owner = "client!akr", name = "z", descriptor = "J")
	long aLong89;

	@OriginalMember(owner = "client!akr", name = "k", descriptor = "Z")
	boolean aBoolean339;

	@OriginalMember(owner = "client!akr", name = "c", descriptor = "B")
	public byte aByte56;

	@OriginalMember(owner = "client!akr", name = "f", descriptor = "Z")
	boolean aBoolean338 = true;

	@OriginalMember(owner = "client!akr", name = "l", descriptor = "I")
	public int anInt1602 = 0;

	@OriginalMember(owner = "client!akr", name = "p", descriptor = "Ljava/lang/String;")
	public String aString44 = null;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!akr", name = "e", descriptor = "(IB)V", line = 24)
	void method13828(@OriginalArg(0) int arg0) {
		if (this.aClass373Array1 == null) {
			this.aClass373Array1 = new Class373[arg0];
		} else {
			System.arraycopy(this.aClass373Array1, 0, this.aClass373Array1 = new Class373[arg0], 0, this.anInt1602 * -1052058559);
		}
	}

	@OriginalMember(owner = "client!akr", name = "u", descriptor = "(I)V", line = 24)
	void method13830(@OriginalArg(0) int arg0) {
		if (this.aClass373Array1 == null) {
			this.aClass373Array1 = new Class373[arg0];
		} else {
			System.arraycopy(this.aClass373Array1, 0, this.aClass373Array1 = new Class373[arg0], 0, this.anInt1602 * -1052058559);
		}
	}

	@OriginalMember(owner = "client!akr", name = "z", descriptor = "(I)V", line = 24)
	void method13831(@OriginalArg(0) int arg0) {
		if (this.aClass373Array1 == null) {
			this.aClass373Array1 = new Class373[arg0];
		} else {
			System.arraycopy(this.aClass373Array1, 0, this.aClass373Array1 = new Class373[arg0], 0, this.anInt1602 * -1052058559);
		}
	}

	@OriginalMember(owner = "client!akr", name = "l", descriptor = "(I)V", line = 24)
	void method13838(@OriginalArg(0) int arg0) {
		if (this.aClass373Array1 == null) {
			this.aClass373Array1 = new Class373[arg0];
		} else {
			System.arraycopy(this.aClass373Array1, 0, this.aClass373Array1 = new Class373[arg0], 0, this.anInt1602 * -1052058559);
		}
	}

	@OriginalMember(owner = "client!akr", name = "<init>", descriptor = "(Lclient!alw;)V", line = 28)
	public Class93_Sub28(@OriginalArg(0) Class93_Sub41 arg0) {
		this.method13827(arg0);
	}

	@OriginalMember(owner = "client!akr", name = "n", descriptor = "(I)[I", line = 33)
	public int[] method13823() {
		if (this.anIntArray182 == null) {
			@Pc(8) String[] local8 = new String[this.anInt1602 * -1052058559];
			this.anIntArray182 = new int[this.anInt1602 * -1052058559];
			@Pc(17) int local17 = 0;
			while (local17 < this.anInt1602 * -1052058559) {
				local8[local17] = this.aClass373Array1[local17].aString191;
				this.anIntArray182[local17] = local17++;
			}
			Class118.method8414(local8, this.anIntArray182);
		}
		return this.anIntArray182;
	}

	@OriginalMember(owner = "client!akr", name = "p", descriptor = "()[I", line = 33)
	public int[] method13832() {
		if (this.anIntArray182 == null) {
			@Pc(8) String[] local8 = new String[this.anInt1602 * -1052058559];
			this.anIntArray182 = new int[this.anInt1602 * -1052058559];
			@Pc(17) int local17 = 0;
			while (local17 < this.anInt1602 * -1052058559) {
				local8[local17] = this.aClass373Array1[local17].aString191;
				this.anIntArray182[local17] = local17++;
			}
			Class118.method8414(local8, this.anIntArray182);
		}
		return this.anIntArray182;
	}

	@OriginalMember(owner = "client!akr", name = "m", descriptor = "(Lclient!kb;I)V", line = 46)
	void method13824(@OriginalArg(0) Class373 arg0) {
		if (this.aClass373Array1 == null || this.anInt1602 * -1052058559 >= this.aClass373Array1.length) {
			this.method13828(this.anInt1602 * -1052058559 + 5);
		}
		this.aClass373Array1[(this.anInt1602 += -1125174335) * -1052058559 - 1] = arg0;
		this.anIntArray182 = null;
	}

	@OriginalMember(owner = "client!akr", name = "d", descriptor = "(Lclient!kb;)V", line = 46)
	void method13833(@OriginalArg(0) Class373 arg0) {
		if (this.aClass373Array1 == null || this.anInt1602 * -1052058559 >= this.aClass373Array1.length) {
			this.method13828(this.anInt1602 * -1052058559 + 5);
		}
		this.aClass373Array1[(this.anInt1602 += -1125174335) * -1052058559 - 1] = arg0;
		this.anIntArray182 = null;
	}

	@OriginalMember(owner = "client!akr", name = "c", descriptor = "(I)V", line = 52)
	void method13822(@OriginalArg(0) int arg0) {
		this.anInt1602 -= -1125174335;
		if (this.anInt1602 * -1052058559 == 0) {
			this.aClass373Array1 = null;
		} else {
			System.arraycopy(this.aClass373Array1, arg0 + 1, this.aClass373Array1, arg0, this.anInt1602 * -1052058559 - arg0);
		}
		this.anIntArray182 = null;
	}

	@OriginalMember(owner = "client!akr", name = "k", descriptor = "(II)V", line = 52)
	void method13825(@OriginalArg(0) int arg0) {
		this.anInt1602 -= -1125174335;
		if (this.anInt1602 * -1052058559 == 0) {
			this.aClass373Array1 = null;
		} else {
			System.arraycopy(this.aClass373Array1, arg0 + 1, this.aClass373Array1, arg0, this.anInt1602 * -1052058559 - arg0);
		}
		this.anIntArray182 = null;
	}

	@OriginalMember(owner = "client!akr", name = "r", descriptor = "(I)V", line = 52)
	void method13835(@OriginalArg(0) int arg0) {
		this.anInt1602 -= -1125174335;
		if (this.anInt1602 * -1052058559 == 0) {
			this.aClass373Array1 = null;
		} else {
			System.arraycopy(this.aClass373Array1, arg0 + 1, this.aClass373Array1, arg0, this.anInt1602 * -1052058559 - arg0);
		}
		this.anIntArray182 = null;
	}

	@OriginalMember(owner = "client!akr", name = "f", descriptor = "(Ljava/lang/String;B)I", line = 59)
	public int method13826(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1602 * -1052058559; local1++) {
			if (this.aClass373Array1[local1].aString191.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!akr", name = "v", descriptor = "(Ljava/lang/String;)I", line = 59)
	public int method13829(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1602 * -1052058559; local1++) {
			if (this.aClass373Array1[local1].aString191.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!akr", name = "y", descriptor = "(Ljava/lang/String;)I", line = 59)
	public int method13836(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1602 * -1052058559; local1++) {
			if (this.aClass373Array1[local1].aString191.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!akr", name = "w", descriptor = "(Lclient!alw;I)V", line = 66)
	void method13827(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22413();
		if ((local3 & 0x1) != 0) {
			this.aBoolean339 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean338 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.method22413();
		}
		this.aLong232 = arg0.method22423() * -284080703297520027L;
		this.aLong89 = arg0.method22423() * -8713487650679722559L;
		this.aString44 = arg0.method22427();
		arg0.method22413();
		this.aByte56 = arg0.method22414();
		this.aByte55 = arg0.method22414();
		this.anInt1602 = arg0.method22415() * -1125174335;
		if (this.anInt1602 * -1052058559 <= 0) {
			return;
		}
		this.aClass373Array1 = new Class373[this.anInt1602 * -1052058559];
		for (@Pc(84) int local84 = 0; local84 < this.anInt1602 * -1052058559; local84++) {
			@Pc(94) Class373 local94 = new Class373();
			if (this.aBoolean339) {
				arg0.method22423();
			}
			if (this.aBoolean338) {
				local94.aString191 = arg0.method22427();
			}
			local94.aByte150 = arg0.method22414();
			local94.anInt4597 = arg0.method22415() * -1542465575;
			if (local21 >= 3) {
				arg0.method22413();
			}
			this.aClass373Array1[local84] = local94;
		}
	}

	@OriginalMember(owner = "client!akr", name = "h", descriptor = "(Lclient!alw;)V", line = 66)
	void method13834(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22413();
		if ((local3 & 0x1) != 0) {
			this.aBoolean339 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean338 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.method22413();
		}
		this.aLong232 = arg0.method22423() * -284080703297520027L;
		this.aLong89 = arg0.method22423() * -8713487650679722559L;
		this.aString44 = arg0.method22427();
		arg0.method22413();
		this.aByte56 = arg0.method22414();
		this.aByte55 = arg0.method22414();
		this.anInt1602 = arg0.method22415() * -1125174335;
		if (this.anInt1602 * -1052058559 <= 0) {
			return;
		}
		this.aClass373Array1 = new Class373[this.anInt1602 * -1052058559];
		for (@Pc(84) int local84 = 0; local84 < this.anInt1602 * -1052058559; local84++) {
			@Pc(94) Class373 local94 = new Class373();
			if (this.aBoolean339) {
				arg0.method22423();
			}
			if (this.aBoolean338) {
				local94.aString191 = arg0.method22427();
			}
			local94.aByte150 = arg0.method22414();
			local94.anInt4597 = arg0.method22415() * -1542465575;
			if (local21 >= 3) {
				arg0.method22413();
			}
			this.aClass373Array1[local84] = local94;
		}
	}

	@OriginalMember(owner = "client!akr", name = "x", descriptor = "(Lclient!alw;)V", line = 66)
	void method13837(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22413();
		if ((local3 & 0x1) != 0) {
			this.aBoolean339 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean338 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.method22413();
		}
		this.aLong232 = arg0.method22423() * -284080703297520027L;
		this.aLong89 = arg0.method22423() * -8713487650679722559L;
		this.aString44 = arg0.method22427();
		arg0.method22413();
		this.aByte56 = arg0.method22414();
		this.aByte55 = arg0.method22414();
		this.anInt1602 = arg0.method22415() * -1125174335;
		if (this.anInt1602 * -1052058559 <= 0) {
			return;
		}
		this.aClass373Array1 = new Class373[this.anInt1602 * -1052058559];
		for (@Pc(84) int local84 = 0; local84 < this.anInt1602 * -1052058559; local84++) {
			@Pc(94) Class373 local94 = new Class373();
			if (this.aBoolean339) {
				arg0.method22423();
			}
			if (this.aBoolean338) {
				local94.aString191 = arg0.method22427();
			}
			local94.aByte150 = arg0.method22414();
			local94.anInt4597 = arg0.method22415() * -1542465575;
			if (local21 >= 3) {
				arg0.method22413();
			}
			this.aClass373Array1[local84] = local94;
		}
	}

	@OriginalMember(owner = "client!akr", name = "a", descriptor = "(Lclient!alw;)V", line = 66)
	void method13839(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22413();
		if ((local3 & 0x1) != 0) {
			this.aBoolean339 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean338 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.method22413();
		}
		this.aLong232 = arg0.method22423() * -284080703297520027L;
		this.aLong89 = arg0.method22423() * -8713487650679722559L;
		this.aString44 = arg0.method22427();
		arg0.method22413();
		this.aByte56 = arg0.method22414();
		this.aByte55 = arg0.method22414();
		this.anInt1602 = arg0.method22415() * -1125174335;
		if (this.anInt1602 * -1052058559 <= 0) {
			return;
		}
		this.aClass373Array1 = new Class373[this.anInt1602 * -1052058559];
		for (@Pc(84) int local84 = 0; local84 < this.anInt1602 * -1052058559; local84++) {
			@Pc(94) Class373 local94 = new Class373();
			if (this.aBoolean339) {
				arg0.method22423();
			}
			if (this.aBoolean338) {
				local94.aString191 = arg0.method22427();
			}
			local94.aByte150 = arg0.method22414();
			local94.anInt4597 = arg0.method22415() * -1542465575;
			if (local21 >= 3) {
				arg0.method22413();
			}
			this.aClass373Array1[local84] = local94;
		}
	}

	@OriginalMember(owner = "client!akr", name = "ij", descriptor = "(Lclient!yf;I)V", line = 6458)
	static final void method13840(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class453.method28965(local16, local22, arg0, Class121.aClass93_Sub28_2 == arg0.aClass93_Sub28_4 ? Class310.aClass310_5 : Class310.aClass310_1);
	}

	@OriginalMember(owner = "client!akr", name = "bcx", descriptor = "(Lclient!yf;B)V", line = 14522)
	static final void method13841(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ((Class132_Sub1) arg0.anInterface61_1).method24275();
	}
}
