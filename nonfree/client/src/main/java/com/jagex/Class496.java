package com.jagex;

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!px")
public class Class496 {

	@OriginalMember(owner = "client!px", name = "u", descriptor = "Lclient!qp;")
	Class513 aClass513_1;

	@OriginalMember(owner = "client!px", name = "z", descriptor = "Lclient!qp;")
	Class513 aClass513_2;

	@OriginalMember(owner = "client!px", name = "d", descriptor = "[Lclient!aij;")
	Class143_Sub1[] aClass143_Sub1Array1;

	@OriginalMember(owner = "client!px", name = "p", descriptor = "Z")
	boolean aBoolean782 = false;

	@OriginalMember(owner = "client!px", name = "e", descriptor = "Lclient!pp;")
	Class144 aClass144_2;

	@OriginalMember(owner = "client!px", name = "n", descriptor = "Lclient!pu;")
	Class493 aClass493_3;

	@OriginalMember(owner = "client!px", name = "m", descriptor = "Lclient!pf;")
	Class480 aClass480_3;

	@OriginalMember(owner = "client!px", name = "k", descriptor = "Ljava/math/BigInteger;")
	BigInteger aBigInteger5;

	@OriginalMember(owner = "client!px", name = "f", descriptor = "Ljava/math/BigInteger;")
	BigInteger aBigInteger6;

	@OriginalMember(owner = "client!px", name = "w", descriptor = "Lclient!auq;")
	Class93_Sub1_Sub16_Sub3 aClass93_Sub1_Sub16_Sub3_3;

	@OriginalMember(owner = "client!px", name = "l", descriptor = "Lclient!atb;")
	Class93_Sub1_Sub16_Sub1 aClass93_Sub1_Sub16_Sub1_2;

	@OriginalMember(owner = "client!px", name = "f", descriptor = "(Lclient!alw;I)Lclient!kp;", line = 14)
	public static Class125 method30043(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(4) Class125_Sub2 local4 = (Class125_Sub2) Class661.method32844(arg0);
		@Pc(8) int local8 = arg0.method22482();
		return new Class125_Sub2_Sub1(local4.aClass390_7, local4.aClass392_7, local4.anInt2981 * 483768335, local4.anInt2982 * 2099407685, local4.anInt2983 * 1135283731, local4.anInt2980 * -1017655207, local4.anInt2985 * -1946839755, local4.anInt2986 * -1726029297, local4.anInt2984 * 291173831, local4.anInt2987 * -312428519, local4.anInt2988 * 813929059, local4.anInt2990 * -2031575365, local4.anInt2991 * 79921115, local4.anInt2989 * -143127169, local4.anInt2992 * 247837873, local8);
	}

	@OriginalMember(owner = "client!px", name = "<init>", descriptor = "(Lclient!pp;Lclient!pu;Lclient!pf;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 21)
	public Class496(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class493 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) BigInteger arg3, @OriginalArg(4) BigInteger arg4) {
		this.aClass144_2 = arg0;
		this.aClass493_3 = arg1;
		this.aClass480_3 = arg2;
		this.aBigInteger5 = arg3;
		this.aBigInteger6 = arg4;
		if (!this.aClass144_2.method11146()) {
			this.aClass93_Sub1_Sub16_Sub3_3 = this.aClass144_2.method11145(255, 255, (byte) 0, true);
		}
		if (this.aClass493_3 != null) {
			this.aClass93_Sub1_Sub16_Sub1_2 = this.aClass493_3.method29986();
		}
	}

	@OriginalMember(owner = "client!px", name = "e", descriptor = "(B)Z", line = 32)
	public boolean method30032() {
		if (this.aClass513_1 != null) {
			return true;
		}
		if (this.aClass93_Sub1_Sub16_Sub3_3 == null) {
			if (this.aClass144_2.method11146()) {
				return false;
			}
			this.aClass93_Sub1_Sub16_Sub3_3 = this.aClass144_2.method11145(255, 255, (byte) 0, true);
		}
		if (this.aClass93_Sub1_Sub16_Sub3_3.aBoolean546) {
			return false;
		}
		@Pc(39) Class93_Sub41 local39 = new Class93_Sub41(this.aClass93_Sub1_Sub16_Sub3_3.method23981());
		this.aClass513_1 = new Class513(local39, this.aBigInteger5, this.aBigInteger6);
		if (this.aClass143_Sub1Array1 == null) {
			this.aClass143_Sub1Array1 = new Class143_Sub1[this.aClass513_1.aClass491Array1.length];
		} else {
			for (@Pc(62) int local62 = 0; local62 < this.aClass143_Sub1Array1.length; local62++) {
				if (this.aClass143_Sub1Array1[local62] != null) {
					@Pc(79) Class491 local79 = this.aClass513_1.aClass491Array1[local62];
					this.aClass143_Sub1Array1[local62].method11069(local79.anInt5162 * 583520325, local79.aByteArray95, local79.anInt5160 * -1785716067, local79.anInt5161 * 996913261);
					if (this.aClass143_Sub1Array1[local62].method11078()) {
						this.aClass143_Sub1Array1[local62].method11080(false);
					}
				}
			}
		}
		this.aBoolean782 = false;
		return true;
	}

	@OriginalMember(owner = "client!px", name = "f", descriptor = "()Z", line = 32)
	public boolean method30041() {
		if (this.aClass513_1 != null) {
			return true;
		}
		if (this.aClass93_Sub1_Sub16_Sub3_3 == null) {
			if (this.aClass144_2.method11146()) {
				return false;
			}
			this.aClass93_Sub1_Sub16_Sub3_3 = this.aClass144_2.method11145(255, 255, (byte) 0, true);
		}
		if (this.aClass93_Sub1_Sub16_Sub3_3.aBoolean546) {
			return false;
		}
		@Pc(39) Class93_Sub41 local39 = new Class93_Sub41(this.aClass93_Sub1_Sub16_Sub3_3.method23981());
		this.aClass513_1 = new Class513(local39, this.aBigInteger5, this.aBigInteger6);
		if (this.aClass143_Sub1Array1 == null) {
			this.aClass143_Sub1Array1 = new Class143_Sub1[this.aClass513_1.aClass491Array1.length];
		} else {
			for (@Pc(62) int local62 = 0; local62 < this.aClass143_Sub1Array1.length; local62++) {
				if (this.aClass143_Sub1Array1[local62] != null) {
					@Pc(79) Class491 local79 = this.aClass513_1.aClass491Array1[local62];
					this.aClass143_Sub1Array1[local62].method11069(local79.anInt5162 * 583520325, local79.aByteArray95, local79.anInt5160 * -1785716067, local79.anInt5161 * 996913261);
					if (this.aClass143_Sub1Array1[local62].method11078()) {
						this.aClass143_Sub1Array1[local62].method11080(false);
					}
				}
			}
		}
		this.aBoolean782 = false;
		return true;
	}

	@OriginalMember(owner = "client!px", name = "n", descriptor = "(ILclient!uf;Lclient!uf;ZB)Lclient!aij;", line = 56)
	public Class143_Sub1 method30033(@OriginalArg(0) int arg0, @OriginalArg(1) Class593 arg1, @OriginalArg(2) Class593 arg2, @OriginalArg(3) boolean arg3) {
		return this.method30034(arg0, arg1, arg2, true, arg3);
	}

	@OriginalMember(owner = "client!px", name = "w", descriptor = "(ILclient!uf;Lclient!uf;Z)Lclient!aij;", line = 56)
	public Class143_Sub1 method30037(@OriginalArg(0) int arg0, @OriginalArg(1) Class593 arg1, @OriginalArg(2) Class593 arg2, @OriginalArg(3) boolean arg3) {
		return this.method30034(arg0, arg1, arg2, true, arg3);
	}

	@OriginalMember(owner = "client!px", name = "l", descriptor = "(ILclient!uf;Lclient!uf;ZZ)Lclient!aij;", line = 60)
	Class143_Sub1 method30031(@OriginalArg(0) int arg0, @OriginalArg(1) Class593 arg1, @OriginalArg(2) Class593 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass513_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass143_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass143_Sub1Array1[arg0] == null) {
			@Pc(34) Class491 local34 = this.aClass513_1.aClass491Array1[arg0];
			@Pc(66) Class143_Sub1 local66 = new Class143_Sub1(arg0, arg1, arg2, this.aClass144_2, arg4 ? this.aClass493_3 : null, this.aClass480_3, local34.anInt5162 * 583520325, local34.aByteArray95, local34.anInt5160 * -1785716067, arg3, local34.anInt5161 * 996913261);
			this.aClass143_Sub1Array1[arg0] = local66;
			if (this.aClass513_2 != null && arg4) {
				@Pc(82) Class491 local82 = this.aClass513_2.aClass491Array1[arg0];
				this.aClass143_Sub1Array1[arg0].method11080(this.aClass143_Sub1Array1[arg0].method11070(local82.anInt5162 * 583520325, local82.aByteArray95, local82.anInt5160 * -1785716067, local82.anInt5161 * 996913261));
			}
			return local66;
		} else {
			return this.aClass143_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!px", name = "m", descriptor = "(ILclient!uf;Lclient!uf;ZZI)Lclient!aij;", line = 60)
	Class143_Sub1 method30034(@OriginalArg(0) int arg0, @OriginalArg(1) Class593 arg1, @OriginalArg(2) Class593 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass513_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass143_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass143_Sub1Array1[arg0] == null) {
			@Pc(34) Class491 local34 = this.aClass513_1.aClass491Array1[arg0];
			@Pc(66) Class143_Sub1 local66 = new Class143_Sub1(arg0, arg1, arg2, this.aClass144_2, arg4 ? this.aClass493_3 : null, this.aClass480_3, local34.anInt5162 * 583520325, local34.aByteArray95, local34.anInt5160 * -1785716067, arg3, local34.anInt5161 * 996913261);
			this.aClass143_Sub1Array1[arg0] = local66;
			if (this.aClass513_2 != null && arg4) {
				@Pc(82) Class491 local82 = this.aClass513_2.aClass491Array1[arg0];
				this.aClass143_Sub1Array1[arg0].method11080(this.aClass143_Sub1Array1[arg0].method11070(local82.anInt5162 * 583520325, local82.aByteArray95, local82.anInt5160 * -1785716067, local82.anInt5161 * 996913261));
			}
			return local66;
		} else {
			return this.aClass143_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!px", name = "u", descriptor = "(ILclient!uf;Lclient!uf;ZZ)Lclient!aij;", line = 60)
	Class143_Sub1 method30038(@OriginalArg(0) int arg0, @OriginalArg(1) Class593 arg1, @OriginalArg(2) Class593 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass513_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass143_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass143_Sub1Array1[arg0] == null) {
			@Pc(34) Class491 local34 = this.aClass513_1.aClass491Array1[arg0];
			@Pc(66) Class143_Sub1 local66 = new Class143_Sub1(arg0, arg1, arg2, this.aClass144_2, arg4 ? this.aClass493_3 : null, this.aClass480_3, local34.anInt5162 * 583520325, local34.aByteArray95, local34.anInt5160 * -1785716067, arg3, local34.anInt5161 * 996913261);
			this.aClass143_Sub1Array1[arg0] = local66;
			if (this.aClass513_2 != null && arg4) {
				@Pc(82) Class491 local82 = this.aClass513_2.aClass491Array1[arg0];
				this.aClass143_Sub1Array1[arg0].method11080(this.aClass143_Sub1Array1[arg0].method11070(local82.anInt5162 * 583520325, local82.aByteArray95, local82.anInt5160 * -1785716067, local82.anInt5161 * 996913261));
			}
			return local66;
		} else {
			return this.aClass143_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!px", name = "z", descriptor = "(ILclient!uf;Lclient!uf;ZZ)Lclient!aij;", line = 60)
	Class143_Sub1 method30039(@OriginalArg(0) int arg0, @OriginalArg(1) Class593 arg1, @OriginalArg(2) Class593 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.aClass513_1 == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.aClass143_Sub1Array1.length) {
			throw new RuntimeException();
		} else if (this.aClass143_Sub1Array1[arg0] == null) {
			@Pc(34) Class491 local34 = this.aClass513_1.aClass491Array1[arg0];
			@Pc(66) Class143_Sub1 local66 = new Class143_Sub1(arg0, arg1, arg2, this.aClass144_2, arg4 ? this.aClass493_3 : null, this.aClass480_3, local34.anInt5162 * 583520325, local34.aByteArray95, local34.anInt5160 * -1785716067, arg3, local34.anInt5161 * 996913261);
			this.aClass143_Sub1Array1[arg0] = local66;
			if (this.aClass513_2 != null && arg4) {
				@Pc(82) Class491 local82 = this.aClass513_2.aClass491Array1[arg0];
				this.aClass143_Sub1Array1[arg0].method11080(this.aClass143_Sub1Array1[arg0].method11070(local82.anInt5162 * 583520325, local82.aByteArray95, local82.anInt5160 * -1785716067, local82.anInt5161 * 996913261));
			}
			return local66;
		} else {
			return this.aClass143_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!px", name = "k", descriptor = "(I)V", line = 78)
	public void method30035() {
		if (this.aClass143_Sub1Array1 == null) {
			return;
		}
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.aClass143_Sub1Array1.length; local5++) {
			if (this.aClass143_Sub1Array1[local5] != null) {
				this.aClass143_Sub1Array1[local5].method11081();
			}
		}
		for (local5 = 0; local5 < this.aClass143_Sub1Array1.length; local5++) {
			if (this.aClass143_Sub1Array1[local5] != null) {
				this.aClass143_Sub1Array1[local5].method11073();
			}
		}
		if (this.aClass513_1 == null) {
			this.method30032();
		} else if (this.aClass493_3 != null && !this.aBoolean782) {
			if (this.aClass93_Sub1_Sub16_Sub1_2 == null) {
				this.aClass93_Sub1_Sub16_Sub1_2 = this.aClass493_3.method29986();
			} else if (!this.aClass93_Sub1_Sub16_Sub1_2.aBoolean546) {
				@Pc(80) byte[] local80 = this.aClass93_Sub1_Sub16_Sub1_2.method23981();
				try {
					this.aClass513_2 = new Class513(new Class93_Sub41(local80), this.aBigInteger5, this.aBigInteger6);
					for (@Pc(95) int local95 = 0; local95 < this.aClass143_Sub1Array1.length; local95++) {
						if (this.aClass143_Sub1Array1[local95] != null && this.aClass143_Sub1Array1[local95].method11078()) {
							@Pc(118) Class491 local118 = this.aClass513_2.aClass491Array1[local95];
							this.aClass143_Sub1Array1[local95].method11080(this.aClass143_Sub1Array1[local95].method11070(local118.anInt5162 * 583520325, local118.aByteArray95, local118.anInt5160 * -1785716067, local118.anInt5161 * 996913261));
						}
					}
				} catch (@Pc(148) Exception local148) {
					for (@Pc(150) int local150 = 0; local150 < this.aClass143_Sub1Array1.length; local150++) {
						if (this.aClass143_Sub1Array1[local150] != null && this.aClass143_Sub1Array1[local150].method11078()) {
							this.aClass143_Sub1Array1[local150].method11080(false);
						}
					}
				}
				this.aClass93_Sub1_Sub16_Sub1_2 = null;
				this.aBoolean782 = true;
			}
		}
	}

	@OriginalMember(owner = "client!px", name = "d", descriptor = "()V", line = 78)
	public void method30036() {
		if (this.aClass143_Sub1Array1 == null) {
			return;
		}
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.aClass143_Sub1Array1.length; local5++) {
			if (this.aClass143_Sub1Array1[local5] != null) {
				this.aClass143_Sub1Array1[local5].method11081();
			}
		}
		for (local5 = 0; local5 < this.aClass143_Sub1Array1.length; local5++) {
			if (this.aClass143_Sub1Array1[local5] != null) {
				this.aClass143_Sub1Array1[local5].method11073();
			}
		}
		if (this.aClass513_1 == null) {
			this.method30032();
		} else if (this.aClass493_3 != null && !this.aBoolean782) {
			if (this.aClass93_Sub1_Sub16_Sub1_2 == null) {
				this.aClass93_Sub1_Sub16_Sub1_2 = this.aClass493_3.method29986();
			} else if (!this.aClass93_Sub1_Sub16_Sub1_2.aBoolean546) {
				@Pc(80) byte[] local80 = this.aClass93_Sub1_Sub16_Sub1_2.method23981();
				try {
					this.aClass513_2 = new Class513(new Class93_Sub41(local80), this.aBigInteger5, this.aBigInteger6);
					for (@Pc(95) int local95 = 0; local95 < this.aClass143_Sub1Array1.length; local95++) {
						if (this.aClass143_Sub1Array1[local95] != null && this.aClass143_Sub1Array1[local95].method11078()) {
							@Pc(118) Class491 local118 = this.aClass513_2.aClass491Array1[local95];
							this.aClass143_Sub1Array1[local95].method11080(this.aClass143_Sub1Array1[local95].method11070(local118.anInt5162 * 583520325, local118.aByteArray95, local118.anInt5160 * -1785716067, local118.anInt5161 * 996913261));
						}
					}
				} catch (@Pc(148) Exception local148) {
					for (@Pc(150) int local150 = 0; local150 < this.aClass143_Sub1Array1.length; local150++) {
						if (this.aClass143_Sub1Array1[local150] != null && this.aClass143_Sub1Array1[local150].method11078()) {
							this.aClass143_Sub1Array1[local150].method11080(false);
						}
					}
				}
				this.aClass93_Sub1_Sub16_Sub1_2 = null;
				this.aBoolean782 = true;
			}
		}
	}

	@OriginalMember(owner = "client!px", name = "p", descriptor = "()V", line = 78)
	public void method30040() {
		if (this.aClass143_Sub1Array1 == null) {
			return;
		}
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.aClass143_Sub1Array1.length; local5++) {
			if (this.aClass143_Sub1Array1[local5] != null) {
				this.aClass143_Sub1Array1[local5].method11081();
			}
		}
		for (local5 = 0; local5 < this.aClass143_Sub1Array1.length; local5++) {
			if (this.aClass143_Sub1Array1[local5] != null) {
				this.aClass143_Sub1Array1[local5].method11073();
			}
		}
		if (this.aClass513_1 == null) {
			this.method30032();
		} else if (this.aClass493_3 != null && !this.aBoolean782) {
			if (this.aClass93_Sub1_Sub16_Sub1_2 == null) {
				this.aClass93_Sub1_Sub16_Sub1_2 = this.aClass493_3.method29986();
			} else if (!this.aClass93_Sub1_Sub16_Sub1_2.aBoolean546) {
				@Pc(80) byte[] local80 = this.aClass93_Sub1_Sub16_Sub1_2.method23981();
				try {
					this.aClass513_2 = new Class513(new Class93_Sub41(local80), this.aBigInteger5, this.aBigInteger6);
					for (@Pc(95) int local95 = 0; local95 < this.aClass143_Sub1Array1.length; local95++) {
						if (this.aClass143_Sub1Array1[local95] != null && this.aClass143_Sub1Array1[local95].method11078()) {
							@Pc(118) Class491 local118 = this.aClass513_2.aClass491Array1[local95];
							this.aClass143_Sub1Array1[local95].method11080(this.aClass143_Sub1Array1[local95].method11070(local118.anInt5162 * 583520325, local118.aByteArray95, local118.anInt5160 * -1785716067, local118.anInt5161 * 996913261));
						}
					}
				} catch (@Pc(148) Exception local148) {
					for (@Pc(150) int local150 = 0; local150 < this.aClass143_Sub1Array1.length; local150++) {
						if (this.aClass143_Sub1Array1[local150] != null && this.aClass143_Sub1Array1[local150].method11078()) {
							this.aClass143_Sub1Array1[local150].method11080(false);
						}
					}
				}
				this.aClass93_Sub1_Sub16_Sub1_2 = null;
				this.aBoolean782 = true;
			}
		}
	}

	@OriginalMember(owner = "client!px", name = "aar", descriptor = "(Lclient!yf;I)V", line = 9694)
	static final void method30042(@OriginalArg(0) Class681 arg0) {
		if (client.aString146 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class623.anInt5682 * 1581594575;
		}
	}
}
