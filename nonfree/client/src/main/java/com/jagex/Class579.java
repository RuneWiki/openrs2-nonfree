package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xl")
public class Class579 {

	@OriginalMember(owner = "client!xl", name = "gm", descriptor = "Lclient!ny;")
	public static Class359 aClass359_102;

	@OriginalMember(owner = "client!xl", name = "y", descriptor = "I")
	int anInt5442;

	@OriginalMember(owner = "client!xl", name = "x", descriptor = "Lclient!ew;")
	final Class161 aClass161_64 = new Class161(64);

	@OriginalMember(owner = "client!xl", name = "s", descriptor = "Lclient!ew;")
	final Class161 aClass161_65 = new Class161(50);

	@OriginalMember(owner = "client!xl", name = "u", descriptor = "Lclient!ew;")
	final Class161 aClass161_63 = new Class161(5);

	@OriginalMember(owner = "client!xl", name = "p", descriptor = "Lclient!vz;")
	final Class543 aClass543_10;

	@OriginalMember(owner = "client!xl", name = "a", descriptor = "Lclient!vk;")
	final Class530 aClass530_10;

	@OriginalMember(owner = "client!xl", name = "g", descriptor = "Z")
	boolean aBoolean838;

	@OriginalMember(owner = "client!xl", name = "l", descriptor = "Lclient!ny;")
	final Class359 aClass359_100;

	@OriginalMember(owner = "client!xl", name = "h", descriptor = "Lclient!ny;")
	final Class359 aClass359_101;

	@OriginalMember(owner = "client!xl", name = "b", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray22;

	@OriginalMember(owner = "client!xl", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;ZLclient!ny;Lclient!ny;)V", line = 24)
	public Class579(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class359 arg3, @OriginalArg(4) Class359 arg4) {
		this.aClass543_10 = arg0;
		this.aClass530_10 = arg1;
		this.aBoolean838 = arg2;
		this.aClass359_100 = arg3;
		this.aClass359_101 = arg4;
		if (this.aClass359_100 != null) {
			@Pc(45) int local45 = this.aClass359_100.method26683() - 1;
			Class185.aClass185_78.method23905();
			this.aClass359_100.method26682(local45);
		}
		if (Class543.aClass543_4 == this.aClass543_10) {
			this.aStringArray22 = new String[] { null, null, null, null, null, Class601.aClass601_132.method33512(this.aClass530_10) };
		} else {
			this.aStringArray22 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!xl", name = "p", descriptor = "(IB)Lclient!xc;", line = 42)
	public Class571 method33185(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_64;
		@Pc(11) Class571 local11;
		synchronized (this.aClass161_64) {
			local11 = (Class571) this.aClass161_64.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_100;
		@Pc(41) byte[] local41;
		synchronized (this.aClass359_100) {
			local41 = this.aClass359_100.method26713(Class185.aClass185_78.method23906(arg0), Class185.aClass185_78.method23908(arg0));
		}
		local11 = new Class571();
		local11.anInt5388 = arg0 * 902063579;
		local11.aClass579_2 = this;
		local11.aStringArray21 = (String[]) this.aStringArray22.clone();
		if (local41 != null) {
			local11.method33035(new Class3_Sub41(local41));
		}
		local11.method33041();
		@Pc(85) Class161 local85 = this.aClass161_64;
		synchronized (this.aClass161_64) {
			this.aClass161_64.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!xl", name = "y", descriptor = "(I)Lclient!xc;", line = 42)
	public Class571 method33189(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_64;
		@Pc(11) Class571 local11;
		synchronized (this.aClass161_64) {
			local11 = (Class571) this.aClass161_64.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_100;
		@Pc(41) byte[] local41;
		synchronized (this.aClass359_100) {
			local41 = this.aClass359_100.method26713(Class185.aClass185_78.method23906(arg0), Class185.aClass185_78.method23908(arg0));
		}
		local11 = new Class571();
		local11.anInt5388 = arg0 * 902063579;
		local11.aClass579_2 = this;
		local11.aStringArray21 = (String[]) this.aStringArray22.clone();
		if (local41 != null) {
			local11.method33035(new Class3_Sub41(local41));
		}
		local11.method33041();
		@Pc(85) Class161 local85 = this.aClass161_64;
		synchronized (this.aClass161_64) {
			this.aClass161_64.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!xl", name = "u", descriptor = "(I)Lclient!xc;", line = 42)
	public Class571 method33192(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_64;
		@Pc(11) Class571 local11;
		synchronized (this.aClass161_64) {
			local11 = (Class571) this.aClass161_64.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_100;
		@Pc(41) byte[] local41;
		synchronized (this.aClass359_100) {
			local41 = this.aClass359_100.method26713(Class185.aClass185_78.method23906(arg0), Class185.aClass185_78.method23908(arg0));
		}
		local11 = new Class571();
		local11.anInt5388 = arg0 * 902063579;
		local11.aClass579_2 = this;
		local11.aStringArray21 = (String[]) this.aStringArray22.clone();
		if (local41 != null) {
			local11.method33035(new Class3_Sub41(local41));
		}
		local11.method33041();
		@Pc(85) Class161 local85 = this.aClass161_64;
		synchronized (this.aClass161_64) {
			this.aClass161_64.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!xl", name = "b", descriptor = "(I)Lclient!xc;", line = 42)
	public Class571 method33193(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_64;
		@Pc(11) Class571 local11;
		synchronized (this.aClass161_64) {
			local11 = (Class571) this.aClass161_64.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_100;
		@Pc(41) byte[] local41;
		synchronized (this.aClass359_100) {
			local41 = this.aClass359_100.method26713(Class185.aClass185_78.method23906(arg0), Class185.aClass185_78.method23908(arg0));
		}
		local11 = new Class571();
		local11.anInt5388 = arg0 * 902063579;
		local11.aClass579_2 = this;
		local11.aStringArray21 = (String[]) this.aStringArray22.clone();
		if (local41 != null) {
			local11.method33035(new Class3_Sub41(local41));
		}
		local11.method33041();
		@Pc(85) Class161 local85 = this.aClass161_64;
		synchronized (this.aClass161_64) {
			this.aClass161_64.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!xl", name = "c", descriptor = "(I)Lclient!xc;", line = 42)
	public Class571 method33195(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_64;
		@Pc(11) Class571 local11;
		synchronized (this.aClass161_64) {
			local11 = (Class571) this.aClass161_64.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(27) Class359 local27 = this.aClass359_100;
		@Pc(41) byte[] local41;
		synchronized (this.aClass359_100) {
			local41 = this.aClass359_100.method26713(Class185.aClass185_78.method23906(arg0), Class185.aClass185_78.method23908(arg0));
		}
		local11 = new Class571();
		local11.anInt5388 = arg0 * 902063579;
		local11.aClass579_2 = this;
		local11.aStringArray21 = (String[]) this.aStringArray22.clone();
		if (local41 != null) {
			local11.method33035(new Class3_Sub41(local41));
		}
		local11.method33041();
		@Pc(85) Class161 local85 = this.aClass161_64;
		synchronized (this.aClass161_64) {
			this.aClass161_64.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!xl", name = "a", descriptor = "(ZB)V", line = 63)
	public void method33186(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean838 != arg0) {
			this.aBoolean838 = arg0;
			this.method33194();
		}
	}

	@OriginalMember(owner = "client!xl", name = "z", descriptor = "(Z)V", line = 63)
	public void method33188(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean838 != arg0) {
			this.aBoolean838 = arg0;
			this.method33194();
		}
	}

	@OriginalMember(owner = "client!xl", name = "j", descriptor = "(Z)V", line = 63)
	public void method33197(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean838 != arg0) {
			this.aBoolean838 = arg0;
			this.method33194();
		}
	}

	@OriginalMember(owner = "client!xl", name = "e", descriptor = "(I)V", line = 69)
	public void method33199(@OriginalArg(0) int arg0) {
		this.anInt5442 = arg0 * 221809345;
		@Pc(8) Class161 local8 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23224();
		}
		local8 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23224();
		}
	}

	@OriginalMember(owner = "client!xl", name = "r", descriptor = "(I)V", line = 69)
	public void method33200(@OriginalArg(0) int arg0) {
		this.anInt5442 = arg0 * 221809345;
		@Pc(8) Class161 local8 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23224();
		}
		local8 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23224();
		}
	}

	@OriginalMember(owner = "client!xl", name = "g", descriptor = "(II)V", line = 69)
	public void method33204(@OriginalArg(0) int arg0) {
		this.anInt5442 = arg0 * 221809345;
		@Pc(8) Class161 local8 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23224();
		}
		local8 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23224();
		}
	}

	@OriginalMember(owner = "client!xl", name = "n", descriptor = "(I)V", line = 69)
	public void method33206(@OriginalArg(0) int arg0) {
		this.anInt5442 = arg0 * 221809345;
		@Pc(8) Class161 local8 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23224();
		}
		local8 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23224();
		}
	}

	@OriginalMember(owner = "client!xl", name = "l", descriptor = "(I)V", line = 79)
	public void method33194() {
		@Pc(3) Class161 local3 = this.aClass161_64;
		synchronized (this.aClass161_64) {
			this.aClass161_64.method23224();
		}
		local3 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23224();
		}
		local3 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23224();
		}
	}

	@OriginalMember(owner = "client!xl", name = "d", descriptor = "()V", line = 79)
	public void method33201() {
		@Pc(3) Class161 local3 = this.aClass161_64;
		synchronized (this.aClass161_64) {
			this.aClass161_64.method23224();
		}
		local3 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23224();
		}
		local3 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23224();
		}
	}

	@OriginalMember(owner = "client!xl", name = "q", descriptor = "()V", line = 79)
	public void method33202() {
		@Pc(3) Class161 local3 = this.aClass161_64;
		synchronized (this.aClass161_64) {
			this.aClass161_64.method23224();
		}
		local3 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23224();
		}
		local3 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23224();
		}
	}

	@OriginalMember(owner = "client!xl", name = "h", descriptor = "(I)V", line = 91)
	public void method33184() {
		@Pc(3) Class161 local3 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23224();
		}
		local3 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23224();
		}
	}

	@OriginalMember(owner = "client!xl", name = "v", descriptor = "()V", line = 91)
	public void method33191() {
		@Pc(3) Class161 local3 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23224();
		}
		local3 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23224();
		}
	}

	@OriginalMember(owner = "client!xl", name = "m", descriptor = "()V", line = 91)
	public void method33203() {
		@Pc(3) Class161 local3 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23224();
		}
		local3 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23224();
		}
	}

	@OriginalMember(owner = "client!xl", name = "x", descriptor = "(IS)V", line = 100)
	public void method33190(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_64;
		synchronized (this.aClass161_64) {
			this.aClass161_64.method23240(arg0);
		}
		local3 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23240(arg0);
		}
		local3 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!xl", name = "t", descriptor = "(I)V", line = 100)
	public void method33205(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_64;
		synchronized (this.aClass161_64) {
			this.aClass161_64.method23240(arg0);
		}
		local3 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23240(arg0);
		}
		local3 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!xl", name = "s", descriptor = "(B)V", line = 112)
	public void method33187() {
		@Pc(3) Class161 local3 = this.aClass161_64;
		synchronized (this.aClass161_64) {
			this.aClass161_64.method23245();
		}
		local3 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23245();
		}
		local3 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23245();
		}
	}

	@OriginalMember(owner = "client!xl", name = "o", descriptor = "()V", line = 112)
	public void method33196() {
		@Pc(3) Class161 local3 = this.aClass161_64;
		synchronized (this.aClass161_64) {
			this.aClass161_64.method23245();
		}
		local3 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23245();
		}
		local3 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23245();
		}
	}

	@OriginalMember(owner = "client!xl", name = "w", descriptor = "()V", line = 112)
	public void method33198() {
		@Pc(3) Class161 local3 = this.aClass161_64;
		synchronized (this.aClass161_64) {
			this.aClass161_64.method23245();
		}
		local3 = this.aClass161_65;
		synchronized (this.aClass161_65) {
			this.aClass161_65.method23245();
		}
		local3 = this.aClass161_63;
		synchronized (this.aClass161_63) {
			this.aClass161_63.method23245();
		}
	}

	@OriginalMember(owner = "client!xl", name = "c", descriptor = "(Lclient!pp;I)Z", line = 331)
	static boolean method33209(@OriginalArg(0) Interface43 arg0) {
		@Pc(8) Class467 local8 = client.aClass370_1.method26954().method28510(arg0.method11163());
		if (local8.anInt5090 * 748511055 == -1) {
			return true;
		} else {
			@Pc(24) Class628 local24 = Class342.aClass629_3.method33834(local8.anInt5090 * 748511055);
			return -508620177 * local24.anInt5581 == -1 ? true : local24.method33814();
		}
	}

	@OriginalMember(owner = "client!xl", name = "oh", descriptor = "(Lclient!vs;I)V", line = 6651)
	static final void method33207(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class279.method25421(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!xl", name = "aub", descriptor = "(Lclient!vs;B)V", line = 12551)
	static final void method33208(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(18) Class534 local18;
		if (arg0.aBoolean822) {
			local18 = arg0.aClass534_2;
		} else {
			local18 = arg0.aClass534_1;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local18.method32521(arg0.aClass26_Sub1_Sub1_Sub1_4.aClass186_3, local12, -1) ? 1 : 0;
	}
}
