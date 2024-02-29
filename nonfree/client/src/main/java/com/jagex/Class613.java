package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public class Class613 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!da;")
	static Class91 aClass91_1;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "Lclient!ri;")
	static Class510 aClass510_2;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	public static int anInt5586 = 1285368653;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
	static int anInt5583 = -510663234;

	@OriginalMember(owner = "client!wb", name = "ag", descriptor = "F")
	float aFloat315;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!wu;")
	Class631 aClass631_1;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "F")
	float aFloat316;

	@OriginalMember(owner = "client!wb", name = "ai", descriptor = "F")
	float aFloat317;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Lclient!xp;")
	Class651 aClass651_1;

	@OriginalMember(owner = "client!wb", name = "aj", descriptor = "F")
	float aFloat318;

	@OriginalMember(owner = "client!wb", name = "al", descriptor = "F")
	float aFloat319;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
	int anInt5584 = 0;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
	int anInt5585 = -838136551;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "J")
	long aLong298 = 0L;

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Z")
	boolean aBoolean836 = false;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Lclient!oo;")
	final Class447 aClass447_63 = new Class447(-50.0F, -60.0F, -50.0F);

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "Lclient!er;")
	final Class232 aClass232_87 = new Class232(8);

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!er;")
	final Class232 aClass232_89 = new Class232(9);

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!er;")
	final Class232 aClass232_88 = new Class232(9);

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Z")
	boolean aBoolean837 = false;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "[I")
	int[] anIntArray517 = new int[] { -1, -1, -1 };

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "[F")
	float[] aFloatArray115 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Z")
	boolean aBoolean838 = false;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "Lclient!dx;")
	final Class86 aClass86_14;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "Lclient!pw;")
	final Class478 aClass478_134;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "[[Lclient!wu;")
	final Class631[][] aClass631ArrayArray1;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "Lclient!wu;")
	final Class631 aClass631_2;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "Lclient!wu;")
	final Class631 aClass631_4;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!wu;")
	final Class631 aClass631_5;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "Lclient!wu;")
	final Class631 aClass631_3;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!dx;Lclient!pw;II)V", line = 54)
	public Class613(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass86_14 = arg0;
		this.aClass478_134 = arg1;
		this.aClass631ArrayArray1 = new Class631[arg2][arg3];
		if (anInt5586 * -1652557189 != -1) {
			aClass91_1 = this.method32265(anInt5586 * -1652557189);
		}
		aClass510_2 = null;
		this.aClass631_2 = new Class631();
		this.aClass631_4 = new Class631();
		this.aClass631_5 = new Class631();
		this.aClass631_3 = new Class631();
		this.method32293();
		this.method32322();
		this.method32316();
	}

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "(Lclient!rq;B)V", line = 70)
	public void method32244(@OriginalArg(0) Class517 arg0) {
		@Pc(4) Class631 local4 = this.method32286(arg0);
		if (this.aClass651_1 == null) {
			this.method32288(local4, anInt5583 * -1326181739);
		} else {
			this.aClass631_1.method32609(local4);
			this.aClass631_1.method32631(this, this.aClass651_1);
			this.method32288(this.aClass631_1, this.aClass651_1.method32951());
		}
		this.method32291();
		this.method32298();
		this.method32304();
	}

	@OriginalMember(owner = "client!wb", name = "aj", descriptor = "(Lclient!rq;)V", line = 70)
	public void method32245(@OriginalArg(0) Class517 arg0) {
		@Pc(4) Class631 local4 = this.method32286(arg0);
		if (this.aClass651_1 == null) {
			this.method32288(local4, anInt5583 * -1326181739);
		} else {
			this.aClass631_1.method32609(local4);
			this.aClass631_1.method32631(this, this.aClass651_1);
			this.method32288(this.aClass631_1, this.aClass651_1.method32951());
		}
		this.method32291();
		this.method32298();
		this.method32304();
	}

	@OriginalMember(owner = "client!wb", name = "ai", descriptor = "(Lclient!rq;)V", line = 70)
	public void method32246(@OriginalArg(0) Class517 arg0) {
		@Pc(4) Class631 local4 = this.method32286(arg0);
		if (this.aClass651_1 == null) {
			this.method32288(local4, anInt5583 * -1326181739);
		} else {
			this.aClass631_1.method32609(local4);
			this.aClass631_1.method32631(this, this.aClass651_1);
			this.method32288(this.aClass631_1, this.aClass651_1.method32951());
		}
		this.method32291();
		this.method32298();
		this.method32304();
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(Lclient!rq;I)V", line = 83)
	public void method32247(@OriginalArg(0) Class517 arg0) {
		@Pc(4) Class631 local4 = this.method32286(arg0);
		if (this.aClass651_1 == null) {
			this.method32288(local4, anInt5583 * -1326181739);
		} else {
			this.aClass631_1.method32609(local4);
			this.aClass631_1.method32631(this, this.aClass651_1);
			this.method32288(this.aClass631_1, this.aClass651_1.method32951());
		}
		this.method32291();
		this.method32307();
		this.method32311();
		this.method32319();
	}

	@OriginalMember(owner = "client!wb", name = "al", descriptor = "(Lclient!rq;)V", line = 83)
	public void method32248(@OriginalArg(0) Class517 arg0) {
		@Pc(4) Class631 local4 = this.method32286(arg0);
		if (this.aClass651_1 == null) {
			this.method32288(local4, anInt5583 * -1326181739);
		} else {
			this.aClass631_1.method32609(local4);
			this.aClass631_1.method32631(this, this.aClass651_1);
			this.method32288(this.aClass631_1, this.aClass651_1.method32951());
		}
		this.method32291();
		this.method32307();
		this.method32311();
		this.method32319();
	}

	@OriginalMember(owner = "client!wb", name = "ao", descriptor = "(Lclient!rq;)V", line = 83)
	public void method32249(@OriginalArg(0) Class517 arg0) {
		@Pc(4) Class631 local4 = this.method32286(arg0);
		if (this.aClass651_1 == null) {
			this.method32288(local4, anInt5583 * -1326181739);
		} else {
			this.aClass631_1.method32609(local4);
			this.aClass631_1.method32631(this, this.aClass651_1);
			this.method32288(this.aClass631_1, this.aClass651_1.method32951());
		}
		this.method32291();
		this.method32307();
		this.method32311();
		this.method32319();
	}

	@OriginalMember(owner = "client!wb", name = "ag", descriptor = "(Lclient!rq;)V", line = 83)
	public void method32250(@OriginalArg(0) Class517 arg0) {
		@Pc(4) Class631 local4 = this.method32286(arg0);
		if (this.aClass651_1 == null) {
			this.method32288(local4, anInt5583 * -1326181739);
		} else {
			this.aClass631_1.method32609(local4);
			this.aClass631_1.method32631(this, this.aClass651_1);
			this.method32288(this.aClass631_1, this.aClass651_1.method32951());
		}
		this.method32291();
		this.method32307();
		this.method32311();
		this.method32319();
	}

	@OriginalMember(owner = "client!wb", name = "ak", descriptor = "(Lclient!rq;Lclient!xp;I)V", line = 97)
	public void method32251(@OriginalArg(0) Class517 arg0, @OriginalArg(1) Class651 arg1, @OriginalArg(2) int arg2) {
		this.aClass651_1 = arg1;
		@Pc(7) Class631 local7 = this.method32286(arg0);
		if (this.aClass651_1 == null) {
			this.method32288(local7, arg2);
			this.aClass631_1 = null;
			return;
		}
		if (this.aClass631_1 == null) {
			this.aClass631_1 = new Class631();
		}
		this.aClass631_1.method32609(local7);
		this.aClass631_1.method32631(this, this.aClass651_1);
		this.method32288(this.aClass631_1, arg2);
	}

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "(Lclient!rq;Lclient!xp;IB)V", line = 97)
	public void method32252(@OriginalArg(0) Class517 arg0, @OriginalArg(1) Class651 arg1, @OriginalArg(2) int arg2) {
		this.aClass651_1 = arg1;
		@Pc(7) Class631 local7 = this.method32286(arg0);
		if (this.aClass651_1 == null) {
			this.method32288(local7, arg2);
			this.aClass631_1 = null;
			return;
		}
		if (this.aClass631_1 == null) {
			this.aClass631_1 = new Class631();
		}
		this.aClass631_1.method32609(local7);
		this.aClass631_1.method32631(this, this.aClass651_1);
		this.method32288(this.aClass631_1, arg2);
	}

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "(I)Lclient!xp;", line = 112)
	public Class651 method32253() {
		return this.aClass651_1;
	}

	@OriginalMember(owner = "client!wb", name = "ax", descriptor = "()Lclient!xp;", line = 112)
	public Class651 method32254() {
		return this.aClass651_1;
	}

	@OriginalMember(owner = "client!wb", name = "au", descriptor = "()Lclient!xp;", line = 112)
	public Class651 method32255() {
		return this.aClass651_1;
	}

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "(B)Lclient!wu;", line = 116)
	public Class631 method32256() {
		return this.aClass631_4;
	}

	@OriginalMember(owner = "client!wb", name = "ac", descriptor = "()Lclient!wu;", line = 116)
	public Class631 method32257() {
		return this.aClass631_4;
	}

	@OriginalMember(owner = "client!wb", name = "ar", descriptor = "()Lclient!wu;", line = 116)
	public Class631 method32258() {
		return this.aClass631_4;
	}

	@OriginalMember(owner = "client!wb", name = "ad", descriptor = "()Lclient!wu;", line = 116)
	public Class631 method32259() {
		return this.aClass631_4;
	}

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "(Lclient!wb;I)V", line = 120)
	public void method32260(@OriginalArg(0) Class613 arg0) {
		this.aClass631_4.method32609(arg0.aClass631_4);
		this.aClass631_5.method32609(arg0.aClass631_5);
		this.aClass631_3.method32609(arg0.aClass631_3);
		this.aLong298 = arg0.aLong298;
		this.anInt5584 = arg0.anInt5584;
		this.anInt5585 = arg0.anInt5585;
	}

	@OriginalMember(owner = "client!wb", name = "av", descriptor = "(Lclient!wb;)V", line = 120)
	public void method32261(@OriginalArg(0) Class613 arg0) {
		this.aClass631_4.method32609(arg0.aClass631_4);
		this.aClass631_5.method32609(arg0.aClass631_5);
		this.aClass631_3.method32609(arg0.aClass631_3);
		this.aLong298 = arg0.aLong298;
		this.anInt5584 = arg0.anInt5584;
		this.anInt5585 = arg0.anInt5585;
	}

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "(I)V", line = 129)
	public void method32262() {
		this.aClass232_87.method25850();
		this.aClass232_89.method25850();
		this.aClass232_88.method25850();
	}

	@OriginalMember(owner = "client!wb", name = "ae", descriptor = "()V", line = 129)
	public void method32263() {
		this.aClass232_87.method25850();
		this.aClass232_89.method25850();
		this.aClass232_88.method25850();
	}

	@OriginalMember(owner = "client!wb", name = "at", descriptor = "()V", line = 129)
	public void method32264() {
		this.aClass232_87.method25850();
		this.aClass232_89.method25850();
		this.aClass232_88.method25850();
	}

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "(II)Lclient!da;", line = 135)
	Class91 method32265(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = (Class91) this.aClass232_87.method25835((long) arg0);
		if (local6 == null) {
			local6 = this.aClass86_14.method20251(arg0);
			this.aClass232_87.method25844(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!wb", name = "as", descriptor = "(I)Lclient!da;", line = 135)
	Class91 method32266(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = (Class91) this.aClass232_87.method25835((long) arg0);
		if (local6 == null) {
			local6 = this.aClass86_14.method20251(arg0);
			this.aClass232_87.method25844(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!wb", name = "ah", descriptor = "(I)Lclient!da;", line = 135)
	Class91 method32267(@OriginalArg(0) int arg0) {
		@Pc(6) Class91 local6 = (Class91) this.aClass232_87.method25835((long) arg0);
		if (local6 == null) {
			local6 = this.aClass86_14.method20251(arg0);
			this.aClass232_87.method25844(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "(IIIIB)Lclient!ri;", line = 143)
	Class510 method32268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(25) long local25 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(31) Class510 local31 = (Class510) this.aClass232_89.method25835(local25);
		if (local31 == null) {
			local31 = Class94.method7613(arg0, arg1, arg2, arg3, Class214.aClass35_Sub6_1, Class497.aClass35_Sub9_1);
			this.aClass232_89.method25844(local31, local25);
		}
		return local31;
	}

	@OriginalMember(owner = "client!wb", name = "ay", descriptor = "(IIII)Lclient!ri;", line = 143)
	Class510 method32269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(25) long local25 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(31) Class510 local31 = (Class510) this.aClass232_89.method25835(local25);
		if (local31 == null) {
			local31 = Class94.method7613(arg0, arg1, arg2, arg3, Class214.aClass35_Sub6_1, Class497.aClass35_Sub9_1);
			this.aClass232_89.method25844(local31, local25);
		}
		return local31;
	}

	@OriginalMember(owner = "client!wb", name = "aq", descriptor = "(IIII)Lclient!ri;", line = 143)
	Class510 method32270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(25) long local25 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(31) Class510 local31 = (Class510) this.aClass232_89.method25835(local25);
		if (local31 == null) {
			local31 = Class94.method7613(arg0, arg1, arg2, arg3, Class214.aClass35_Sub6_1, Class497.aClass35_Sub9_1);
			this.aClass232_89.method25844(local31, local25);
		}
		return local31;
	}

	@OriginalMember(owner = "client!wb", name = "am", descriptor = "(IIII)Lclient!ri;", line = 143)
	Class510 method32271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(25) long local25 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(31) Class510 local31 = (Class510) this.aClass232_89.method25835(local25);
		if (local31 == null) {
			local31 = Class94.method7613(arg0, arg1, arg2, arg3, Class214.aClass35_Sub6_1, Class497.aClass35_Sub9_1);
			this.aClass232_89.method25844(local31, local25);
		}
		return local31;
	}

	@OriginalMember(owner = "client!wb", name = "af", descriptor = "(I)Lclient!dh;", line = 153)
	Class85 method32272(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = (Class85) this.aClass232_88.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(15) Class89 local15 = Class210.method25594(this.aClass478_134, arg0);
		if (local15 != null && local15.method6682() == 256 && local15.method6683() == 16) {
			@Pc(30) int[] local30 = local15.method6686(false);
			local6 = this.aClass86_14.method20351(local30);
			if (local6 != null) {
				this.aClass232_88.method25844(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(IB)Lclient!dh;", line = 153)
	Class85 method32273(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = (Class85) this.aClass232_88.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(15) Class89 local15 = Class210.method25594(this.aClass478_134, arg0);
		if (local15 != null && local15.method6682() == 256 && local15.method6683() == 16) {
			@Pc(30) int[] local30 = local15.method6686(false);
			local6 = this.aClass86_14.method20351(local30);
			if (local6 != null) {
				this.aClass232_88.method25844(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!wb", name = "an", descriptor = "(I)Lclient!dh;", line = 153)
	Class85 method32274(@OriginalArg(0) int arg0) {
		@Pc(6) Class85 local6 = (Class85) this.aClass232_88.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(15) Class89 local15 = Class210.method25594(this.aClass478_134, arg0);
		if (local15 != null && local15.method6682() == 256 && local15.method6683() == 16) {
			@Pc(30) int[] local30 = local15.method6686(false);
			local6 = this.aClass86_14.method20351(local30);
			if (local6 != null) {
				this.aClass232_88.method25844(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "(IILclient!wu;B)V", line = 172)
	public void method32275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class631 arg2) {
		this.aClass631ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!wb", name = "ap", descriptor = "(IILclient!wu;)V", line = 172)
	public void method32276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class631 arg2) {
		this.aClass631ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!wb", name = "aa", descriptor = "(IILclient!wu;)V", line = 172)
	public void method32277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class631 arg2) {
		this.aClass631ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!wb", name = "ab", descriptor = "(IILclient!wu;)V", line = 172)
	public void method32278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class631 arg2) {
		this.aClass631ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "(I)V", line = 176)
	public void method32279() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass631ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass631ArrayArray1[local1].length; local8++) {
				this.aClass631ArrayArray1[local1][local8] = this.aClass631_2;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "aw", descriptor = "()V", line = 176)
	public void method32280() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass631ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass631ArrayArray1[local1].length; local8++) {
				this.aClass631ArrayArray1[local1][local8] = this.aClass631_2;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "az", descriptor = "()V", line = 176)
	public void method32281() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass631ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass631ArrayArray1[local1].length; local8++) {
				this.aClass631ArrayArray1[local1][local8] = this.aClass631_2;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(III)V", line = 184)
	public void method32282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class631 local6 = this.aClass631ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass447_63.method29136(local6.aClass447_64);
		}
		this.method32298();
	}

	@OriginalMember(owner = "client!wb", name = "bj", descriptor = "(II)V", line = 184)
	public void method32283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class631 local6 = this.aClass631ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass447_63.method29136(local6.aClass447_64);
		}
		this.method32298();
	}

	@OriginalMember(owner = "client!wb", name = "bc", descriptor = "(II)V", line = 184)
	public void method32284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class631 local6 = this.aClass631ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass447_63.method29136(local6.aClass447_64);
		}
		this.method32298();
	}

	@OriginalMember(owner = "client!wb", name = "bv", descriptor = "(II)V", line = 184)
	public void method32285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class631 local6 = this.aClass631ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass447_63.method29136(local6.aClass447_64);
		}
		this.method32298();
	}

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "(Lclient!rq;B)Lclient!wu;", line = 190)
	Class631 method32286(@OriginalArg(0) Class517 arg0) {
		@Pc(1) Class631 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class280.method26673(client.anInt3390 * -1850530127) || Class222.method25761(client.anInt3390 * -1850530127)) {
			local3 = Class96_Sub13.anInt883 * -116109187 >> 12;
			local5 = Class633.anInt5710 * -1098179003 >> 12;
		} else {
			if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0] >> 3;
				local5 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30411() >> 3 || local5 < 0 || local5 >= arg0.method30417() >> 3) {
				local3 = arg0.method30411() >> 4;
				local5 = arg0.method30417() >> 4;
			}
		}
		local1 = this.aClass631ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass631_2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wb", name = "ba", descriptor = "(Lclient!rq;)Lclient!wu;", line = 190)
	Class631 method32287(@OriginalArg(0) Class517 arg0) {
		@Pc(1) Class631 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class280.method26673(client.anInt3390 * -1850530127) || Class222.method25761(client.anInt3390 * -1850530127)) {
			local3 = Class96_Sub13.anInt883 * -116109187 >> 12;
			local5 = Class633.anInt5710 * -1098179003 >> 12;
		} else {
			if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0] >> 3;
				local5 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30411() >> 3 || local5 < 0 || local5 >= arg0.method30417() >> 3) {
				local3 = arg0.method30411() >> 4;
				local5 = arg0.method30417() >> 4;
			}
		}
		local1 = this.aClass631ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass631_2;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "(Lclient!wu;II)V", line = 213)
	void method32288(@OriginalArg(0) Class631 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean836) {
			this.aBoolean836 = false;
			arg1 = 0;
		}
		if (this.aClass631_3.method32625(arg0)) {
			return;
		}
		this.aClass631_3.method32609(arg0);
		this.aLong298 = Class280.method26667() * 2463174759983020029L;
		this.anInt5584 = (this.anInt5585 = arg1 * 838136551) * -721930727;
		if (this.anInt5584 * -940151697 == 0) {
			return;
		}
		this.aClass631_5.method32609(this.aClass631_4);
		if (this.aClass631_4.aClass510_3 == null) {
			return;
		}
		if (this.aClass631_4.aClass510_3.method30295()) {
			this.aClass631_4.aClass510_3 = this.aClass631_5.aClass510_3 = this.aClass631_4.aClass510_3.method30299();
		}
		if (this.aClass631_4.aClass510_3 != null && this.aClass631_4.aClass510_3 != this.aClass631_3.aClass510_3) {
			this.aClass631_4.aClass510_3.method30291(this.aClass631_3.aClass510_3);
		}
	}

	@OriginalMember(owner = "client!wb", name = "bb", descriptor = "(Lclient!wu;I)V", line = 213)
	void method32289(@OriginalArg(0) Class631 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean836) {
			this.aBoolean836 = false;
			arg1 = 0;
		}
		if (this.aClass631_3.method32625(arg0)) {
			return;
		}
		this.aClass631_3.method32609(arg0);
		this.aLong298 = Class280.method26667() * 2463174759983020029L;
		this.anInt5584 = (this.anInt5585 = arg1 * 838136551) * -721930727;
		if (this.anInt5584 * -940151697 == 0) {
			return;
		}
		this.aClass631_5.method32609(this.aClass631_4);
		if (this.aClass631_4.aClass510_3 == null) {
			return;
		}
		if (this.aClass631_4.aClass510_3.method30295()) {
			this.aClass631_4.aClass510_3 = this.aClass631_5.aClass510_3 = this.aClass631_4.aClass510_3.method30299();
		}
		if (this.aClass631_4.aClass510_3 != null && this.aClass631_4.aClass510_3 != this.aClass631_3.aClass510_3) {
			this.aClass631_4.aClass510_3.method30291(this.aClass631_3.aClass510_3);
		}
	}

	@OriginalMember(owner = "client!wb", name = "bl", descriptor = "(Lclient!wu;I)V", line = 213)
	void method32290(@OriginalArg(0) Class631 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean836) {
			this.aBoolean836 = false;
			arg1 = 0;
		}
		if (this.aClass631_3.method32625(arg0)) {
			return;
		}
		this.aClass631_3.method32609(arg0);
		this.aLong298 = Class280.method26667() * 2463174759983020029L;
		this.anInt5584 = (this.anInt5585 = arg1 * 838136551) * -721930727;
		if (this.anInt5584 * -940151697 == 0) {
			return;
		}
		this.aClass631_5.method32609(this.aClass631_4);
		if (this.aClass631_4.aClass510_3 == null) {
			return;
		}
		if (this.aClass631_4.aClass510_3.method30295()) {
			this.aClass631_4.aClass510_3 = this.aClass631_5.aClass510_3 = this.aClass631_4.aClass510_3.method30299();
		}
		if (this.aClass631_4.aClass510_3 != null && this.aClass631_4.aClass510_3 != this.aClass631_3.aClass510_3) {
			this.aClass631_4.aClass510_3.method30291(this.aClass631_3.aClass510_3);
		}
	}

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V", line = 236)
	void method32291() {
		if (this.anInt5585 * 2037907671 < 0) {
			return;
		}
		@Pc(7) long local7 = Class280.method26667();
		this.anInt5585 = (int) ((long) this.anInt5585 - (local7 - this.aLong298 * -4379495624962204331L) * 838136551L);
		if (this.anInt5585 * 2037907671 > 0) {
			this.aClass631_4.method32611(this.aClass86_14, this.aClass631_5, this.aClass631_3, (float) (this.anInt5584 * -940151697 - this.anInt5585 * 2037907671) / (float) (this.anInt5584 * -940151697));
		} else {
			this.aClass631_4.method32609(this.aClass631_3);
			if (this.aClass631_4.aClass510_3 != null) {
				this.aClass631_4.aClass510_3.method30293();
			}
			this.anInt5585 = -838136551;
		}
		this.aLong298 = local7 * 2463174759983020029L;
	}

	@OriginalMember(owner = "client!wb", name = "bd", descriptor = "()V", line = 236)
	void method32292() {
		if (this.anInt5585 * 2037907671 < 0) {
			return;
		}
		@Pc(7) long local7 = Class280.method26667();
		this.anInt5585 = (int) ((long) this.anInt5585 - (local7 - this.aLong298 * -4379495624962204331L) * 838136551L);
		if (this.anInt5585 * 2037907671 > 0) {
			this.aClass631_4.method32611(this.aClass86_14, this.aClass631_5, this.aClass631_3, (float) (this.anInt5584 * -940151697 - this.anInt5585 * 2037907671) / (float) (this.anInt5584 * -940151697));
		} else {
			this.aClass631_4.method32609(this.aClass631_3);
			if (this.aClass631_4.aClass510_3 != null) {
				this.aClass631_4.aClass510_3.method30293();
			}
			this.anInt5585 = -838136551;
		}
		this.aLong298 = local7 * 2463174759983020029L;
	}

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "(I)V", line = 252)
	public void method32293() {
		this.aBoolean836 = true;
	}

	@OriginalMember(owner = "client!wb", name = "bw", descriptor = "()V", line = 252)
	public void method32294() {
		this.aBoolean836 = true;
	}

	@OriginalMember(owner = "client!wb", name = "by", descriptor = "()V", line = 252)
	public void method32295() {
		this.aBoolean836 = true;
	}

	@OriginalMember(owner = "client!wb", name = "bx", descriptor = "()V", line = 252)
	public void method32296() {
		this.aBoolean836 = true;
	}

	@OriginalMember(owner = "client!wb", name = "bi", descriptor = "()V", line = 252)
	public void method32297() {
		this.aBoolean836 = true;
	}

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "(I)V", line = 256)
	void method32298() {
		this.aClass86_14.method20255(((float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub1_1.method14912() * 0.1F + 0.7F + client.aClass517_1.method30424()) * this.aClass631_4.aFloat321);
		this.aClass86_14.method20126(this.aClass631_4.anInt5705 * -1201354137, this.aClass631_4.aFloat322, this.aClass631_4.aFloat323, (float) ((int) this.aClass447_63.aFloat277 << 2), (float) ((int) this.aClass447_63.aFloat276 << 2), (float) ((int) this.aClass447_63.aFloat278 << 2));
		this.aClass86_14.method20133(this.aClass631_4.aClass91_2);
	}

	@OriginalMember(owner = "client!wb", name = "bg", descriptor = "()V", line = 256)
	void method32299() {
		this.aClass86_14.method20255(((float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub1_1.method14912() * 0.1F + 0.7F + client.aClass517_1.method30424()) * this.aClass631_4.aFloat321);
		this.aClass86_14.method20126(this.aClass631_4.anInt5705 * -1201354137, this.aClass631_4.aFloat322, this.aClass631_4.aFloat323, (float) ((int) this.aClass447_63.aFloat277 << 2), (float) ((int) this.aClass447_63.aFloat276 << 2), (float) ((int) this.aClass447_63.aFloat278 << 2));
		this.aClass86_14.method20133(this.aClass631_4.aClass91_2);
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(FFFIIIIII)V", line = 262)
	public void method32300(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass86_14.method20255(((float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub1_1.method14912() * 0.1F + 0.7F + client.aClass517_1.method30424()) * arg0);
		this.aClass86_14.method20126(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass86_14.method20133(this.method32265(arg7));
	}

	@OriginalMember(owner = "client!wb", name = "bt", descriptor = "(FFFIIIII)V", line = 262)
	public void method32301(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass86_14.method20255(((float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub1_1.method14912() * 0.1F + 0.7F + client.aClass517_1.method30424()) * arg0);
		this.aClass86_14.method20126(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass86_14.method20133(this.method32265(arg7));
	}

	@OriginalMember(owner = "client!wb", name = "bz", descriptor = "(FFFIIIII)V", line = 262)
	public void method32302(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass86_14.method20255(((float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub1_1.method14912() * 0.1F + 0.7F + client.aClass517_1.method30424()) * arg0);
		this.aClass86_14.method20126(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass86_14.method20133(this.method32265(arg7));
	}

	@OriginalMember(owner = "client!wb", name = "bs", descriptor = "(FFFIIIII)V", line = 262)
	public void method32303(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass86_14.method20255(((float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub1_1.method14912() * 0.1F + 0.7F + client.aClass517_1.method30424()) * arg0);
		this.aClass86_14.method20126(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass86_14.method20133(this.method32265(arg7));
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V", line = 268)
	public void method32304() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = local1 + (this.aClass631_4.anInt5706 * -563441071 + 256 << 2);
		this.aClass86_14.method20232(this.aClass631_4.anInt5704 * 1102104287, Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1.method15333() == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!wb", name = "bu", descriptor = "()V", line = 268)
	public void method32305() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = local1 + (this.aClass631_4.anInt5706 * -563441071 + 256 << 2);
		this.aClass86_14.method20232(this.aClass631_4.anInt5704 * 1102104287, Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1.method15333() == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!wb", name = "bf", descriptor = "()V", line = 268)
	public void method32306() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = local1 + (this.aClass631_4.anInt5706 * -563441071 + 256 << 2);
		this.aClass86_14.method20232(this.aClass631_4.anInt5704 * 1102104287, Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1.method15333() == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "(I)V", line = 274)
	void method32307() {
		this.aClass86_14.method20031(this.aClass631_4.aFloat330, this.aClass631_4.aFloat324, this.aClass631_4.aFloat325);
	}

	@OriginalMember(owner = "client!wb", name = "bn", descriptor = "()V", line = 274)
	void method32308() {
		this.aClass86_14.method20031(this.aClass631_4.aFloat330, this.aClass631_4.aFloat324, this.aClass631_4.aFloat325);
	}

	@OriginalMember(owner = "client!wb", name = "bp", descriptor = "()V", line = 274)
	void method32309() {
		this.aClass86_14.method20031(this.aClass631_4.aFloat330, this.aClass631_4.aFloat324, this.aClass631_4.aFloat325);
	}

	@OriginalMember(owner = "client!wb", name = "bm", descriptor = "()V", line = 274)
	void method32310() {
		this.aClass86_14.method20031(this.aClass631_4.aFloat330, this.aClass631_4.aFloat324, this.aClass631_4.aFloat325);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 278)
	void method32311() {
		if (!this.aClass86_14.method20213()) {
			return;
		}
		if (this.aBoolean838) {
			this.aClass86_14.method20340(this.aFloat316, this.aFloat318, this.aFloat317, this.aFloat315, this.aFloat319);
		} else {
			this.aClass86_14.method20340(this.aClass631_4.aFloat326, this.aClass631_4.aFloat320, this.aClass631_4.aFloat327, this.aClass631_4.aFloat328, this.aClass631_4.aFloat329);
		}
	}

	@OriginalMember(owner = "client!wb", name = "bo", descriptor = "()V", line = 278)
	void method32312() {
		if (!this.aClass86_14.method20213()) {
			return;
		}
		if (this.aBoolean838) {
			this.aClass86_14.method20340(this.aFloat316, this.aFloat318, this.aFloat317, this.aFloat315, this.aFloat319);
		} else {
			this.aClass86_14.method20340(this.aClass631_4.aFloat326, this.aClass631_4.aFloat320, this.aClass631_4.aFloat327, this.aClass631_4.aFloat328, this.aClass631_4.aFloat329);
		}
	}

	@OriginalMember(owner = "client!wb", name = "bk", descriptor = "()V", line = 278)
	void method32313() {
		if (!this.aClass86_14.method20213()) {
			return;
		}
		if (this.aBoolean838) {
			this.aClass86_14.method20340(this.aFloat316, this.aFloat318, this.aFloat317, this.aFloat315, this.aFloat319);
		} else {
			this.aClass86_14.method20340(this.aClass631_4.aFloat326, this.aClass631_4.aFloat320, this.aClass631_4.aFloat327, this.aClass631_4.aFloat328, this.aClass631_4.aFloat329);
		}
	}

	@OriginalMember(owner = "client!wb", name = "br", descriptor = "()V", line = 278)
	void method32314() {
		if (!this.aClass86_14.method20213()) {
			return;
		}
		if (this.aBoolean838) {
			this.aClass86_14.method20340(this.aFloat316, this.aFloat318, this.aFloat317, this.aFloat315, this.aFloat319);
		} else {
			this.aClass86_14.method20340(this.aClass631_4.aFloat326, this.aClass631_4.aFloat320, this.aClass631_4.aFloat327, this.aClass631_4.aFloat328, this.aClass631_4.aFloat329);
		}
	}

	@OriginalMember(owner = "client!wb", name = "bh", descriptor = "()V", line = 284)
	void method32315() {
		this.aBoolean838 = false;
		this.aFloat316 = 1.0F;
		this.aFloat318 = 0.0F;
		this.aFloat317 = 1.0F;
		this.aFloat315 = 0.0F;
		this.aFloat319 = 1.0F;
	}

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "(I)V", line = 284)
	void method32316() {
		this.aBoolean838 = false;
		this.aFloat316 = 1.0F;
		this.aFloat318 = 0.0F;
		this.aFloat317 = 1.0F;
		this.aFloat315 = 0.0F;
		this.aFloat319 = 1.0F;
	}

	@OriginalMember(owner = "client!wb", name = "bq", descriptor = "()V", line = 284)
	void method32317() {
		this.aBoolean838 = false;
		this.aFloat316 = 1.0F;
		this.aFloat318 = 0.0F;
		this.aFloat317 = 1.0F;
		this.aFloat315 = 0.0F;
		this.aFloat319 = 1.0F;
	}

	@OriginalMember(owner = "client!wb", name = "be", descriptor = "()V", line = 284)
	void method32318() {
		this.aBoolean838 = false;
		this.aFloat316 = 1.0F;
		this.aFloat318 = 0.0F;
		this.aFloat317 = 1.0F;
		this.aFloat315 = 0.0F;
		this.aFloat319 = 1.0F;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 293)
	void method32319() {
		if (!this.aClass86_14.method20093()) {
			return;
		}
		@Pc(6) Class85 local6 = null;
		@Pc(8) Class85 local8 = null;
		@Pc(10) Class85 local10 = null;
		if (!this.aBoolean837) {
			if (this.aClass631_4.anIntArray528[0] > -1) {
				local6 = this.method32273(this.aClass631_4.anIntArray528[0]);
			}
			if (this.aClass631_4.anIntArray528[1] > -1) {
				local8 = this.method32273(this.aClass631_4.anIntArray528[1]);
			}
			if (this.aClass631_4.anIntArray528[2] > -1) {
				local10 = this.method32273(this.aClass631_4.anIntArray528[2]);
			}
			this.aClass86_14.method20139(local6, this.aClass631_4.aFloatArray116[0], local8, this.aClass631_4.aFloatArray116[1], local10, this.aClass631_4.aFloatArray116[2]);
			return;
		}
		if (this.anIntArray517[0] > -1) {
			local6 = this.method32273(this.anIntArray517[0]);
		}
		if (this.anIntArray517[1] > -1) {
			local8 = this.method32273(this.anIntArray517[1]);
		}
		if (this.anIntArray517[2] > -1) {
			local10 = this.method32273(this.anIntArray517[2]);
		}
		this.aClass86_14.method20139(local6, this.aFloatArray115[0], local8, this.aFloatArray115[1], local10, this.aFloatArray115[2]);
	}

	@OriginalMember(owner = "client!wb", name = "cb", descriptor = "()V", line = 293)
	void method32320() {
		if (!this.aClass86_14.method20093()) {
			return;
		}
		@Pc(6) Class85 local6 = null;
		@Pc(8) Class85 local8 = null;
		@Pc(10) Class85 local10 = null;
		if (!this.aBoolean837) {
			if (this.aClass631_4.anIntArray528[0] > -1) {
				local6 = this.method32273(this.aClass631_4.anIntArray528[0]);
			}
			if (this.aClass631_4.anIntArray528[1] > -1) {
				local8 = this.method32273(this.aClass631_4.anIntArray528[1]);
			}
			if (this.aClass631_4.anIntArray528[2] > -1) {
				local10 = this.method32273(this.aClass631_4.anIntArray528[2]);
			}
			this.aClass86_14.method20139(local6, this.aClass631_4.aFloatArray116[0], local8, this.aClass631_4.aFloatArray116[1], local10, this.aClass631_4.aFloatArray116[2]);
			return;
		}
		if (this.anIntArray517[0] > -1) {
			local6 = this.method32273(this.anIntArray517[0]);
		}
		if (this.anIntArray517[1] > -1) {
			local8 = this.method32273(this.anIntArray517[1]);
		}
		if (this.anIntArray517[2] > -1) {
			local10 = this.method32273(this.anIntArray517[2]);
		}
		this.aClass86_14.method20139(local6, this.aFloatArray115[0], local8, this.aFloatArray115[1], local10, this.aFloatArray115[2]);
	}

	@OriginalMember(owner = "client!wb", name = "cg", descriptor = "()V", line = 293)
	void method32321() {
		if (!this.aClass86_14.method20093()) {
			return;
		}
		@Pc(6) Class85 local6 = null;
		@Pc(8) Class85 local8 = null;
		@Pc(10) Class85 local10 = null;
		if (!this.aBoolean837) {
			if (this.aClass631_4.anIntArray528[0] > -1) {
				local6 = this.method32273(this.aClass631_4.anIntArray528[0]);
			}
			if (this.aClass631_4.anIntArray528[1] > -1) {
				local8 = this.method32273(this.aClass631_4.anIntArray528[1]);
			}
			if (this.aClass631_4.anIntArray528[2] > -1) {
				local10 = this.method32273(this.aClass631_4.anIntArray528[2]);
			}
			this.aClass86_14.method20139(local6, this.aClass631_4.aFloatArray116[0], local8, this.aClass631_4.aFloatArray116[1], local10, this.aClass631_4.aFloatArray116[2]);
			return;
		}
		if (this.anIntArray517[0] > -1) {
			local6 = this.method32273(this.anIntArray517[0]);
		}
		if (this.anIntArray517[1] > -1) {
			local8 = this.method32273(this.anIntArray517[1]);
		}
		if (this.anIntArray517[2] > -1) {
			local10 = this.method32273(this.anIntArray517[2]);
		}
		this.aClass86_14.method20139(local6, this.aFloatArray115[0], local8, this.aFloatArray115[1], local10, this.aFloatArray115[2]);
	}

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "(I)V", line = 312)
	void method32322() {
		this.aBoolean837 = false;
		@Pc(5) int[] local5 = this.anIntArray517;
		@Pc(8) int[] local8 = this.anIntArray517;
		this.anIntArray517[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray115;
		@Pc(27) float[] local27 = this.aFloatArray115;
		this.aFloatArray115[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!wb", name = "cc", descriptor = "()V", line = 312)
	void method32323() {
		this.aBoolean837 = false;
		@Pc(5) int[] local5 = this.anIntArray517;
		@Pc(8) int[] local8 = this.anIntArray517;
		this.anIntArray517[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray115;
		@Pc(27) float[] local27 = this.aFloatArray115;
		this.aFloatArray115[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "(B)V", line = 326)
	public void method32324() {
		this.aClass86_14.method20255(((float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub1_1.method14912() * 0.1F + 0.7F + client.aClass517_1.method30424()) * 1.1523438F);
		this.aClass86_14.method20126(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass86_14.method20232(13156520, -1, 0);
		this.aClass86_14.method20133(aClass91_1);
	}

	@OriginalMember(owner = "client!wb", name = "cf", descriptor = "()V", line = 326)
	public void method32325() {
		this.aClass86_14.method20255(((float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub1_1.method14912() * 0.1F + 0.7F + client.aClass517_1.method30424()) * 1.1523438F);
		this.aClass86_14.method20126(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass86_14.method20232(13156520, -1, 0);
		this.aClass86_14.method20133(aClass91_1);
	}

	@OriginalMember(owner = "client!wb", name = "cl", descriptor = "()V", line = 326)
	public void method32326() {
		this.aClass86_14.method20255(((float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub1_1.method14912() * 0.1F + 0.7F + client.aClass517_1.method30424()) * 1.1523438F);
		this.aClass86_14.method20126(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass86_14.method20232(13156520, -1, 0);
		this.aClass86_14.method20133(aClass91_1);
	}

	@OriginalMember(owner = "client!wb", name = "cp", descriptor = "()V", line = 326)
	public void method32327() {
		this.aClass86_14.method20255(((float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub1_1.method14912() * 0.1F + 0.7F + client.aClass517_1.method30424()) * 1.1523438F);
		this.aClass86_14.method20126(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass86_14.method20232(13156520, -1, 0);
		this.aClass86_14.method20133(aClass91_1);
	}

	@OriginalMember(owner = "client!wb", name = "fv", descriptor = "(Lclient!yf;B)V", line = 5396)
	static final void method32328(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class566.method31374(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!wb", name = "fw", descriptor = "(Lclient!yf;I)V", line = 5444)
	static final void method32329(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class670.method33195(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!wb", name = "nb", descriptor = "(Lclient!yf;B)V", line = 6947)
	static final void method32330(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class310.method27286(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!wb", name = "sx", descriptor = "(Lclient!yf;I)V", line = 7858)
	static final void method32331(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local16.aString178;
	}

	@OriginalMember(owner = "client!wb", name = "vq", descriptor = "(Lclient!yf;I)V", line = 8491)
	static final void method32332(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3481 * 828996383;
	}

	@OriginalMember(owner = "client!wb", name = "afp", descriptor = "(Lclient!yf;B)V", line = 10189)
	static final void method32333(@OriginalArg(0) Class665 arg0) {
		Class294.method27020();
	}

	@OriginalMember(owner = "client!wb", name = "arf", descriptor = "(Lclient!yf;I)V", line = 12515)
	static final void method32334(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
