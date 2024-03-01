package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public class Class436 {

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "Lclient!ew;")
	final Class161 aClass161_41 = new Class161(64);

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "Lclient!ew;")
	final Class161 aClass161_42 = new Class161(100);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_75;

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "Lclient!rf;")
	final Class429 aClass429_2;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;Lclient!ny;Lclient!ny;Lclient!rf;)V", line = 18)
	public Class436(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) Class359 arg3, @OriginalArg(4) Class359 arg4, @OriginalArg(5) Class429 arg5) {
		this.aClass359_75 = arg2;
		this.aClass429_2 = arg5;
		if (this.aClass359_75 != null) {
			@Pc(29) int local29 = this.aClass359_75.method26683() - 1;
			Class185.aClass185_18.method23905();
			this.aClass359_75.method26682(local29);
		}
		Class382.method27323(arg3, arg4);
	}

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "(II)Lclient!rs;", line = 32)
	public Class440 method27999(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_41;
		@Pc(11) Class440 local11;
		synchronized (this.aClass161_41) {
			local11 = (Class440) this.aClass161_41.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_75;
		@Pc(42) byte[] local42;
		synchronized (this.aClass359_75) {
			local42 = this.aClass359_75.method26713(Class185.aClass185_18.method23906(arg0), Class185.aClass185_18.method23908(arg0));
		}
		local11 = new Class440();
		local11.anInt4929 = arg0 * 3043461;
		local11.aClass436_3 = this;
		if (local42 != null) {
			local11.method28220(new Class3_Sub41(local42));
		}
		local11.method28221();
		@Pc(78) Class161 local78 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)Lclient!rs;", line = 32)
	public Class440 method28000(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_41;
		@Pc(11) Class440 local11;
		synchronized (this.aClass161_41) {
			local11 = (Class440) this.aClass161_41.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_75;
		@Pc(42) byte[] local42;
		synchronized (this.aClass359_75) {
			local42 = this.aClass359_75.method26713(Class185.aClass185_18.method23906(arg0), Class185.aClass185_18.method23908(arg0));
		}
		local11 = new Class440();
		local11.anInt4929 = arg0 * 3043461;
		local11.aClass436_3 = this;
		if (local42 != null) {
			local11.method28220(new Class3_Sub41(local42));
		}
		local11.method28221();
		@Pc(78) Class161 local78 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!rn", name = "y", descriptor = "(I)Lclient!rs;", line = 32)
	public Class440 method28003(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_41;
		@Pc(11) Class440 local11;
		synchronized (this.aClass161_41) {
			local11 = (Class440) this.aClass161_41.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_75;
		@Pc(42) byte[] local42;
		synchronized (this.aClass359_75) {
			local42 = this.aClass359_75.method26713(Class185.aClass185_18.method23906(arg0), Class185.aClass185_18.method23908(arg0));
		}
		local11 = new Class440();
		local11.anInt4929 = arg0 * 3043461;
		local11.aClass436_3 = this;
		if (local42 != null) {
			local11.method28220(new Class3_Sub41(local42));
		}
		local11.method28221();
		@Pc(78) Class161 local78 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!rn", name = "s", descriptor = "(I)Lclient!rs;", line = 32)
	public Class440 method28004(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_41;
		@Pc(11) Class440 local11;
		synchronized (this.aClass161_41) {
			local11 = (Class440) this.aClass161_41.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_75;
		@Pc(42) byte[] local42;
		synchronized (this.aClass359_75) {
			local42 = this.aClass359_75.method26713(Class185.aClass185_18.method23906(arg0), Class185.aClass185_18.method23908(arg0));
		}
		local11 = new Class440();
		local11.anInt4929 = arg0 * 3043461;
		local11.aClass436_3 = this;
		if (local42 != null) {
			local11.method28220(new Class3_Sub41(local42));
		}
		local11.method28221();
		@Pc(78) Class161 local78 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!rn", name = "x", descriptor = "(I)Lclient!rs;", line = 32)
	public Class440 method28006(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_41;
		@Pc(11) Class440 local11;
		synchronized (this.aClass161_41) {
			local11 = (Class440) this.aClass161_41.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_75;
		@Pc(42) byte[] local42;
		synchronized (this.aClass359_75) {
			local42 = this.aClass359_75.method26713(Class185.aClass185_18.method23906(arg0), Class185.aClass185_18.method23908(arg0));
		}
		local11 = new Class440();
		local11.anInt4929 = arg0 * 3043461;
		local11.aClass436_3 = this;
		if (local42 != null) {
			local11.method28220(new Class3_Sub41(local42));
		}
		local11.method28221();
		@Pc(78) Class161 local78 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)Lclient!rs;", line = 32)
	public Class440 method28008(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_41;
		@Pc(11) Class440 local11;
		synchronized (this.aClass161_41) {
			local11 = (Class440) this.aClass161_41.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_75;
		@Pc(42) byte[] local42;
		synchronized (this.aClass359_75) {
			local42 = this.aClass359_75.method26713(Class185.aClass185_18.method23906(arg0), Class185.aClass185_18.method23908(arg0));
		}
		local11 = new Class440();
		local11.anInt4929 = arg0 * 3043461;
		local11.aClass436_3 = this;
		if (local42 != null) {
			local11.method28220(new Class3_Sub41(local42));
		}
		local11.method28221();
		@Pc(78) Class161 local78 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!rn", name = "u", descriptor = "(I)Lclient!rs;", line = 32)
	public Class440 method28018(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_41;
		@Pc(11) Class440 local11;
		synchronized (this.aClass161_41) {
			local11 = (Class440) this.aClass161_41.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_75;
		@Pc(42) byte[] local42;
		synchronized (this.aClass359_75) {
			local42 = this.aClass359_75.method26713(Class185.aClass185_18.method23906(arg0), Class185.aClass185_18.method23908(arg0));
		}
		local11 = new Class440();
		local11.anInt4929 = arg0 * 3043461;
		local11.aClass436_3 = this;
		if (local42 != null) {
			local11.method28220(new Class3_Sub41(local42));
		}
		local11.method28221();
		@Pc(78) Class161 local78 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!rn", name = "z", descriptor = "(I)Lclient!amx;", line = 53)
	public Class3_Sub1_Sub17 method28009(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			@Pc(11) Class3_Sub1_Sub17 local11 = (Class3_Sub1_Sub17) this.aClass161_42.method23219((long) arg0);
			if (local11 == null) {
				local11 = new Class3_Sub1_Sub17(arg0);
				this.aClass161_42.method23222(local11, (long) arg0);
			}
			return local11.method19451() ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Lclient!amx;", line = 53)
	public Class3_Sub1_Sub17 method28014(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			@Pc(11) Class3_Sub1_Sub17 local11 = (Class3_Sub1_Sub17) this.aClass161_42.method23219((long) arg0);
			if (local11 == null) {
				local11 = new Class3_Sub1_Sub17(arg0);
				this.aClass161_42.method23222(local11, (long) arg0);
			}
			return local11.method19451() ? local11 : null;
		}
	}

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "(B)V", line = 65)
	public void method28001() {
		@Pc(3) Class161 local3 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23224();
		}
		local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			this.aClass161_42.method23224();
		}
	}

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "()V", line = 65)
	public void method28002() {
		@Pc(3) Class161 local3 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23224();
		}
		local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			this.aClass161_42.method23224();
		}
	}

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "()V", line = 65)
	public void method28010() {
		@Pc(3) Class161 local3 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23224();
		}
		local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			this.aClass161_42.method23224();
		}
	}

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "()V", line = 65)
	public void method28011() {
		@Pc(3) Class161 local3 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23224();
		}
		local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			this.aClass161_42.method23224();
		}
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V", line = 74)
	public void method28005(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23240(arg0);
		}
		local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			this.aClass161_42.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "(IS)V", line = 74)
	public void method28012(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23240(arg0);
		}
		local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			this.aClass161_42.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "(I)V", line = 74)
	public void method28013(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23240(arg0);
		}
		local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			this.aClass161_42.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "q", descriptor = "(I)V", line = 74)
	public void method28015(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23240(arg0);
		}
		local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			this.aClass161_42.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "(I)V", line = 74)
	public void method28016(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23240(arg0);
		}
		local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			this.aClass161_42.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "t", descriptor = "()V", line = 83)
	public void method27998() {
		@Pc(3) Class161 local3 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23245();
		}
		local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			this.aClass161_42.method23245();
		}
	}

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "(I)V", line = 83)
	public void method28007() {
		@Pc(3) Class161 local3 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23245();
		}
		local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			this.aClass161_42.method23245();
		}
	}

	@OriginalMember(owner = "client!rn", name = "v", descriptor = "()V", line = 83)
	public void method28017() {
		@Pc(3) Class161 local3 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23245();
		}
		local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			this.aClass161_42.method23245();
		}
	}

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "()V", line = 83)
	public void method28019() {
		@Pc(3) Class161 local3 = this.aClass161_41;
		synchronized (this.aClass161_41) {
			this.aClass161_41.method23245();
		}
		local3 = this.aClass161_42;
		synchronized (this.aClass161_42) {
			this.aClass161_42.method23245();
		}
	}

	@OriginalMember(owner = "client!rn", name = "pv", descriptor = "(Lclient!vs;I)V", line = 6904)
	static final void method28021(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3505 * 247707339;
	}

	@OriginalMember(owner = "client!rn", name = "ma", descriptor = "(IB)V", line = 11418)
	public static final void method28023(@OriginalArg(0) int arg0) {
		if (Class68.aClass3_Sub30_2 == null || (arg0 < 0 || arg0 >= Class68.aClass3_Sub30_2.anInt1331 * 132295085)) {
			return;
		}
		@Pc(17) Class238 local17 = Class68.aClass3_Sub30_2.aClass238Array1[arg0];
		if (local17.aByte129 != -1) {
			return;
		}
		@Pc(25) Class82 local25 = Class406.method27657();
		@Pc(31) Class3_Sub23 local31 = Class269.method25284(Class311.aClass311_73, local25.aClass577_2);
		local31.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(local17.aString192) + 2);
		local31.aClass3_Sub41_Sub1_1.method20251(arg0);
		local31.aClass3_Sub41_Sub1_1.method20260(local17.aString192);
		local25.method21601(local31);
	}

	@OriginalMember(owner = "client!rn", name = "aqb", descriptor = "(Lclient!vs;I)V", line = 11913)
	static final void method28022(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (client.anInt3125 * -1579500007 != -1) {
			if (local12 == 0) {
				arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3125 * -1579500007;
				return;
			}
			local12--;
		}
		@Pc(43) Class3_Sub42 local43 = (Class3_Sub42) client.aClass581_22.method33221();
		while (local12-- > 0) {
			local43 = (Class3_Sub42) client.aClass581_22.method33231();
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local43.anInt2796 * 1705574607;
	}

	@OriginalMember(owner = "client!rn", name = "ary", descriptor = "(Lclient!vs;I)V", line = 12121)
	static final void method28020(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class209.anInt3699 * 768403271;
	}
}
