package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yc")
public class Class596 implements Interface3 {

	@OriginalMember(owner = "client!yc", name = "z", descriptor = "I")
	int anInt5518;

	@OriginalMember(owner = "client!yc", name = "s", descriptor = "Lclient!ew;")
	final Class161 aClass161_68 = new Class161(64);

	@OriginalMember(owner = "client!yc", name = "u", descriptor = "Lclient!ew;")
	final Class161 aClass161_69 = new Class161(50);

	@OriginalMember(owner = "client!yc", name = "y", descriptor = "Lclient!st;")
	public final Class466 aClass466_1 = new Class466(250);

	@OriginalMember(owner = "client!yc", name = "b", descriptor = "Lclient!yz;")
	final Class613 aClass613_1 = new Class613();

	@OriginalMember(owner = "client!yc", name = "p", descriptor = "Lclient!vz;")
	final Class543 aClass543_11;

	@OriginalMember(owner = "client!yc", name = "a", descriptor = "Lclient!vk;")
	final Class530 aClass530_11;

	@OriginalMember(owner = "client!yc", name = "g", descriptor = "Z")
	boolean aBoolean847;

	@OriginalMember(owner = "client!yc", name = "c", descriptor = "Lclient!zo;")
	final Class625 aClass625_2;

	@OriginalMember(owner = "client!yc", name = "l", descriptor = "Lclient!ny;")
	final Class359 aClass359_108;

	@OriginalMember(owner = "client!yc", name = "h", descriptor = "Lclient!ny;")
	final Class359 aClass359_109;

	@OriginalMember(owner = "client!yc", name = "x", descriptor = "I")
	public int anInt5517;

	@OriginalMember(owner = "client!yc", name = "j", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray25;

	@OriginalMember(owner = "client!yc", name = "n", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray26;

	@OriginalMember(owner = "client!yc", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;ZLclient!zo;Lclient!ny;Lclient!ny;)V", line = 39)
	public Class596(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class625 arg3, @OriginalArg(4) Class359 arg4, @OriginalArg(5) Class359 arg5) {
		this.aClass543_11 = arg0;
		this.aClass530_11 = arg1;
		this.aBoolean847 = arg2;
		this.aClass625_2 = arg3;
		this.aClass359_108 = arg4;
		this.aClass359_109 = arg5;
		if (this.aClass359_108 == null) {
			this.anInt5517 = 0;
		} else {
			@Pc(52) int local52 = this.aClass359_108.method26683() - 1;
			this.anInt5517 = (local52 * Class185.aClass185_16.method23905() + this.aClass359_108.method26682(local52)) * 1405631573;
		}
		if (this.aClass543_11 == Class543.aClass543_4) {
			this.aStringArray25 = new String[] { null, null, Class601.aClass601_16.method33512(this.aClass530_11), null, null, Class601.aClass601_132.method33512(this.aClass530_11) };
		} else {
			this.aStringArray25 = new String[] { null, null, Class601.aClass601_16.method33512(this.aClass530_11), null, null, null };
		}
		this.aStringArray26 = new String[] { null, null, null, null, Class601.aClass601_68.method33512(this.aClass530_11) };
	}

	@OriginalMember(owner = "client!yc", name = "p", descriptor = "(II)Lclient!ya;", line = 58)
	public Class594 method33435(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_68;
		@Pc(11) Class594 local11;
		synchronized (this.aClass161_68) {
			local11 = (Class594) this.aClass161_68.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_108;
		@Pc(42) byte[] local42;
		synchronized (this.aClass359_108) {
			local42 = this.aClass359_108.method26713(Class185.aClass185_16.method23906(arg0), Class185.aClass185_16.method23908(arg0));
		}
		local11 = new Class594();
		local11.aClass596_2 = this;
		local11.anInt5477 = arg0 * -661398843;
		local11.aStringArray23 = (String[]) this.aStringArray25.clone();
		local11.aStringArray24 = (String[]) this.aStringArray26.clone();
		if (local42 != null) {
			local11.method33406(new Class3_Sub41(local42));
		}
		local11.method33400();
		if (local11.anInt5495 * 847909323 != -1) {
			local11.method33362(this.method33435(local11.anInt5495 * 847909323), this.method33435(local11.anInt5494 * 1292251097));
		}
		if (local11.anInt5493 * 1485423555 != -1) {
			local11.method33365(this.method33435(local11.anInt5493 * 1485423555), this.method33435(local11.anInt5498 * 1166723267));
		}
		if (local11.anInt5497 * -1331987253 != -1) {
			local11.method33370(this.method33435(local11.anInt5497 * -1331987253), this.method33435(local11.anInt5496 * 507935925));
		}
		if (local11.anInt5513 * 1437932437 != -1) {
			local11.method33364(this.method33435(local11.anInt5513 * 1437932437), this.method33435(local11.anInt5508 * -745277743));
		}
		if (!this.aBoolean847 && local11.aBoolean843) {
			local11.anInt5510 = 0;
			local11.aStringArray23 = this.aStringArray25;
			local11.aStringArray24 = this.aStringArray26;
			local11.aBoolean844 = false;
			local11.anIntArray514 = null;
			if (local11.aClass581_42 != null) {
				@Pc(208) boolean local208 = false;
				for (@Pc(213) Class3 local213 = local11.aClass581_42.method33221(); local213 != null; local213 = local11.aClass581_42.method33231()) {
					@Pc(226) Class630 local226 = this.aClass625_2.method33783((int) (local213.aLong296 * -1930649055099428229L));
					if (local226.aBoolean854) {
						local213.method33656();
					} else {
						local208 = true;
					}
				}
				if (!local208) {
					local11.aClass581_42 = null;
				}
			}
		}
		@Pc(250) Class161 local250 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!yc", name = "z", descriptor = "(I)Lclient!ya;", line = 58)
	public Class594 method33443(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_68;
		@Pc(11) Class594 local11;
		synchronized (this.aClass161_68) {
			local11 = (Class594) this.aClass161_68.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_108;
		@Pc(42) byte[] local42;
		synchronized (this.aClass359_108) {
			local42 = this.aClass359_108.method26713(Class185.aClass185_16.method23906(arg0), Class185.aClass185_16.method23908(arg0));
		}
		local11 = new Class594();
		local11.aClass596_2 = this;
		local11.anInt5477 = arg0 * -661398843;
		local11.aStringArray23 = (String[]) this.aStringArray25.clone();
		local11.aStringArray24 = (String[]) this.aStringArray26.clone();
		if (local42 != null) {
			local11.method33406(new Class3_Sub41(local42));
		}
		local11.method33400();
		if (local11.anInt5495 * 847909323 != -1) {
			local11.method33362(this.method33435(local11.anInt5495 * 847909323), this.method33435(local11.anInt5494 * 1292251097));
		}
		if (local11.anInt5493 * 1485423555 != -1) {
			local11.method33365(this.method33435(local11.anInt5493 * 1485423555), this.method33435(local11.anInt5498 * 1166723267));
		}
		if (local11.anInt5497 * -1331987253 != -1) {
			local11.method33370(this.method33435(local11.anInt5497 * -1331987253), this.method33435(local11.anInt5496 * 507935925));
		}
		if (local11.anInt5513 * 1437932437 != -1) {
			local11.method33364(this.method33435(local11.anInt5513 * 1437932437), this.method33435(local11.anInt5508 * -745277743));
		}
		if (!this.aBoolean847 && local11.aBoolean843) {
			local11.anInt5510 = 0;
			local11.aStringArray23 = this.aStringArray25;
			local11.aStringArray24 = this.aStringArray26;
			local11.aBoolean844 = false;
			local11.anIntArray514 = null;
			if (local11.aClass581_42 != null) {
				@Pc(208) boolean local208 = false;
				for (@Pc(213) Class3 local213 = local11.aClass581_42.method33221(); local213 != null; local213 = local11.aClass581_42.method33231()) {
					@Pc(226) Class630 local226 = this.aClass625_2.method33783((int) (local213.aLong296 * -1930649055099428229L));
					if (local226.aBoolean854) {
						local213.method33656();
					} else {
						local208 = true;
					}
				}
				if (!local208) {
					local11.aClass581_42 = null;
				}
			}
		}
		@Pc(250) Class161 local250 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!yc", name = "c", descriptor = "(I)Lclient!ya;", line = 58)
	public Class594 method33445(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_68;
		@Pc(11) Class594 local11;
		synchronized (this.aClass161_68) {
			local11 = (Class594) this.aClass161_68.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_108;
		@Pc(42) byte[] local42;
		synchronized (this.aClass359_108) {
			local42 = this.aClass359_108.method26713(Class185.aClass185_16.method23906(arg0), Class185.aClass185_16.method23908(arg0));
		}
		local11 = new Class594();
		local11.aClass596_2 = this;
		local11.anInt5477 = arg0 * -661398843;
		local11.aStringArray23 = (String[]) this.aStringArray25.clone();
		local11.aStringArray24 = (String[]) this.aStringArray26.clone();
		if (local42 != null) {
			local11.method33406(new Class3_Sub41(local42));
		}
		local11.method33400();
		if (local11.anInt5495 * 847909323 != -1) {
			local11.method33362(this.method33435(local11.anInt5495 * 847909323), this.method33435(local11.anInt5494 * 1292251097));
		}
		if (local11.anInt5493 * 1485423555 != -1) {
			local11.method33365(this.method33435(local11.anInt5493 * 1485423555), this.method33435(local11.anInt5498 * 1166723267));
		}
		if (local11.anInt5497 * -1331987253 != -1) {
			local11.method33370(this.method33435(local11.anInt5497 * -1331987253), this.method33435(local11.anInt5496 * 507935925));
		}
		if (local11.anInt5513 * 1437932437 != -1) {
			local11.method33364(this.method33435(local11.anInt5513 * 1437932437), this.method33435(local11.anInt5508 * -745277743));
		}
		if (!this.aBoolean847 && local11.aBoolean843) {
			local11.anInt5510 = 0;
			local11.aStringArray23 = this.aStringArray25;
			local11.aStringArray24 = this.aStringArray26;
			local11.aBoolean844 = false;
			local11.anIntArray514 = null;
			if (local11.aClass581_42 != null) {
				@Pc(208) boolean local208 = false;
				for (@Pc(213) Class3 local213 = local11.aClass581_42.method33221(); local213 != null; local213 = local11.aClass581_42.method33231()) {
					@Pc(226) Class630 local226 = this.aClass625_2.method33783((int) (local213.aLong296 * -1930649055099428229L));
					if (local226.aBoolean854) {
						local213.method33656();
					} else {
						local208 = true;
					}
				}
				if (!local208) {
					local11.aClass581_42 = null;
				}
			}
		}
		@Pc(250) Class161 local250 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!yc", name = "j", descriptor = "(I)Lclient!ya;", line = 58)
	public Class594 method33447(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_68;
		@Pc(11) Class594 local11;
		synchronized (this.aClass161_68) {
			local11 = (Class594) this.aClass161_68.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_108;
		@Pc(42) byte[] local42;
		synchronized (this.aClass359_108) {
			local42 = this.aClass359_108.method26713(Class185.aClass185_16.method23906(arg0), Class185.aClass185_16.method23908(arg0));
		}
		local11 = new Class594();
		local11.aClass596_2 = this;
		local11.anInt5477 = arg0 * -661398843;
		local11.aStringArray23 = (String[]) this.aStringArray25.clone();
		local11.aStringArray24 = (String[]) this.aStringArray26.clone();
		if (local42 != null) {
			local11.method33406(new Class3_Sub41(local42));
		}
		local11.method33400();
		if (local11.anInt5495 * 847909323 != -1) {
			local11.method33362(this.method33435(local11.anInt5495 * 847909323), this.method33435(local11.anInt5494 * 1292251097));
		}
		if (local11.anInt5493 * 1485423555 != -1) {
			local11.method33365(this.method33435(local11.anInt5493 * 1485423555), this.method33435(local11.anInt5498 * 1166723267));
		}
		if (local11.anInt5497 * -1331987253 != -1) {
			local11.method33370(this.method33435(local11.anInt5497 * -1331987253), this.method33435(local11.anInt5496 * 507935925));
		}
		if (local11.anInt5513 * 1437932437 != -1) {
			local11.method33364(this.method33435(local11.anInt5513 * 1437932437), this.method33435(local11.anInt5508 * -745277743));
		}
		if (!this.aBoolean847 && local11.aBoolean843) {
			local11.anInt5510 = 0;
			local11.aStringArray23 = this.aStringArray25;
			local11.aStringArray24 = this.aStringArray26;
			local11.aBoolean844 = false;
			local11.anIntArray514 = null;
			if (local11.aClass581_42 != null) {
				@Pc(208) boolean local208 = false;
				for (@Pc(213) Class3 local213 = local11.aClass581_42.method33221(); local213 != null; local213 = local11.aClass581_42.method33231()) {
					@Pc(226) Class630 local226 = this.aClass625_2.method33783((int) (local213.aLong296 * -1930649055099428229L));
					if (local226.aBoolean854) {
						local213.method33656();
					} else {
						local208 = true;
					}
				}
				if (!local208) {
					local11.aClass581_42 = null;
				}
			}
		}
		@Pc(250) Class161 local250 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!yc", name = "a", descriptor = "(Lclient!de;IIIIILclient!tq;I)Lclient!co;", line = 100)
	public Class6 method33436(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class488 arg6) {
		this.aClass613_1.anInt5542 = arg0.anInt2463 * -461258417;
		this.aClass613_1.anInt5540 = arg1 * -138695173;
		this.aClass613_1.anInt5545 = arg2 * -1388568281;
		this.aClass613_1.anInt5541 = arg3 * 1867224143;
		this.aClass613_1.anInt5544 = arg4 * -823898263;
		this.aClass613_1.anInt5543 = arg5 * 2088296155;
		this.aClass613_1.aBoolean848 = arg6 != null;
		return (Class6) this.aClass466_1.method28667(this.aClass613_1);
	}

	@OriginalMember(owner = "client!yc", name = "g", descriptor = "(Lclient!de;Lclient!de;IIIIZZILclient!dw;Lclient!tq;Lclient!tx;I)Lclient!co;", line = 111)
	public Class6 method33434(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class14 arg9, @OriginalArg(10) Class488 arg10, @OriginalArg(11) Class493 arg11) {
		if (!arg7) {
			@Pc(12) Class6 local12 = this.method33436(arg1, arg2, arg3, arg4, arg5, arg8, arg10);
			if (local12 != null) {
				return local12;
			}
		}
		@Pc(21) Class594 local21 = this.method33435(arg2);
		if (arg3 > 1 && local21.anIntArray517 != null) {
			@Pc(29) int local29 = -1;
			for (@Pc(31) int local31 = 0; local31 < 10; local31++) {
				if (arg3 >= local21.anIntArray518[local31] && local21.anIntArray518[local31] != 0) {
					local29 = local21.anIntArray517[local31];
				}
			}
			if (local29 != -1) {
				local21 = this.method33435(local29);
			}
		}
		@Pc(75) int[] local75 = local21.method33394(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11);
		if (local75 == null) {
			return null;
		}
		@Pc(90) Class6 local90;
		if (arg7) {
			local90 = arg0.method17113(local75, 0, 36, 36, 32);
		} else {
			local90 = arg1.method17113(local75, 0, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(106) Class613 local106 = new Class613();
			local106.anInt5542 = arg1.anInt2463 * -461258417;
			local106.anInt5540 = arg2 * -138695173;
			local106.anInt5545 = arg3 * -1388568281;
			local106.anInt5541 = arg4 * 1867224143;
			local106.anInt5544 = arg5 * -823898263;
			local106.anInt5543 = arg8 * 2088296155;
			local106.aBoolean848 = arg10 != null;
			this.aClass466_1.method28650(local90, local106);
		}
		return local90;
	}

	@OriginalMember(owner = "client!yc", name = "n", descriptor = "(Lclient!de;Lclient!de;IIIIZZILclient!dw;Lclient!tq;Lclient!tx;)Lclient!co;", line = 111)
	public Class6 method33448(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class14 arg9, @OriginalArg(10) Class488 arg10, @OriginalArg(11) Class493 arg11) {
		if (!arg7) {
			@Pc(12) Class6 local12 = this.method33436(arg1, arg2, arg3, arg4, arg5, arg8, arg10);
			if (local12 != null) {
				return local12;
			}
		}
		@Pc(21) Class594 local21 = this.method33435(arg2);
		if (arg3 > 1 && local21.anIntArray517 != null) {
			@Pc(29) int local29 = -1;
			for (@Pc(31) int local31 = 0; local31 < 10; local31++) {
				if (arg3 >= local21.anIntArray518[local31] && local21.anIntArray518[local31] != 0) {
					local29 = local21.anIntArray517[local31];
				}
			}
			if (local29 != -1) {
				local21 = this.method33435(local29);
			}
		}
		@Pc(75) int[] local75 = local21.method33394(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11);
		if (local75 == null) {
			return null;
		}
		@Pc(90) Class6 local90;
		if (arg7) {
			local90 = arg0.method17113(local75, 0, 36, 36, 32);
		} else {
			local90 = arg1.method17113(local75, 0, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(106) Class613 local106 = new Class613();
			local106.anInt5542 = arg1.anInt2463 * -461258417;
			local106.anInt5540 = arg2 * -138695173;
			local106.anInt5545 = arg3 * -1388568281;
			local106.anInt5541 = arg4 * 1867224143;
			local106.anInt5544 = arg5 * -823898263;
			local106.anInt5543 = arg8 * 2088296155;
			local106.aBoolean848 = arg10 != null;
			this.aClass466_1.method28650(local90, local106);
		}
		return local90;
	}

	@OriginalMember(owner = "client!yc", name = "e", descriptor = "(Lclient!de;Lclient!de;IIIIZZILclient!dw;Lclient!tq;Lclient!tx;)Lclient!co;", line = 111)
	public Class6 method33455(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class14 arg9, @OriginalArg(10) Class488 arg10, @OriginalArg(11) Class493 arg11) {
		if (!arg7) {
			@Pc(12) Class6 local12 = this.method33436(arg1, arg2, arg3, arg4, arg5, arg8, arg10);
			if (local12 != null) {
				return local12;
			}
		}
		@Pc(21) Class594 local21 = this.method33435(arg2);
		if (arg3 > 1 && local21.anIntArray517 != null) {
			@Pc(29) int local29 = -1;
			for (@Pc(31) int local31 = 0; local31 < 10; local31++) {
				if (arg3 >= local21.anIntArray518[local31] && local21.anIntArray518[local31] != 0) {
					local29 = local21.anIntArray517[local31];
				}
			}
			if (local29 != -1) {
				local21 = this.method33435(local29);
			}
		}
		@Pc(75) int[] local75 = local21.method33394(arg0, arg1, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11);
		if (local75 == null) {
			return null;
		}
		@Pc(90) Class6 local90;
		if (arg7) {
			local90 = arg0.method17113(local75, 0, 36, 36, 32);
		} else {
			local90 = arg1.method17113(local75, 0, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(106) Class613 local106 = new Class613();
			local106.anInt5542 = arg1.anInt2463 * -461258417;
			local106.anInt5540 = arg2 * -138695173;
			local106.anInt5545 = arg3 * -1388568281;
			local106.anInt5541 = arg4 * 1867224143;
			local106.anInt5544 = arg5 * -823898263;
			local106.anInt5543 = arg8 * 2088296155;
			local106.aBoolean848 = arg10 != null;
			this.aClass466_1.method28650(local90, local106);
		}
		return local90;
	}

	@OriginalMember(owner = "client!yc", name = "d", descriptor = "(Z)V", line = 143)
	public void method33450(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean847 != arg0) {
			this.aBoolean847 = arg0;
			this.method33440();
		}
	}

	@OriginalMember(owner = "client!yc", name = "r", descriptor = "(Z)V", line = 143)
	public void method33452(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean847 != arg0) {
			this.aBoolean847 = arg0;
			this.method33440();
		}
	}

	@OriginalMember(owner = "client!yc", name = "l", descriptor = "(ZB)V", line = 143)
	public void method33453(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean847 != arg0) {
			this.aBoolean847 = arg0;
			this.method33440();
		}
	}

	@OriginalMember(owner = "client!yc", name = "h", descriptor = "(II)V", line = 149)
	public void method33439(@OriginalArg(0) int arg0) {
		this.anInt5518 = arg0 * -681199067;
		@Pc(8) Class161 local8 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23224();
		}
	}

	@OriginalMember(owner = "client!yc", name = "x", descriptor = "(I)V", line = 156)
	public void method33440() {
		@Pc(3) Class161 local3 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23224();
		}
		local3 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23224();
		}
		@Pc(37) Class466 local37 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28652();
		}
	}

	@OriginalMember(owner = "client!yc", name = "q", descriptor = "()V", line = 156)
	public void method33451() {
		@Pc(3) Class161 local3 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23224();
		}
		local3 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23224();
		}
		@Pc(37) Class466 local37 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28652();
		}
	}

	@OriginalMember(owner = "client!yc", name = "m", descriptor = "()V", line = 156)
	public void method33456() {
		@Pc(3) Class161 local3 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23224();
		}
		local3 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23224();
		}
		@Pc(37) Class466 local37 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28652();
		}
	}

	@OriginalMember(owner = "client!yc", name = "v", descriptor = "()V", line = 156)
	public void method33461() {
		@Pc(3) Class161 local3 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23224();
		}
		local3 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23224();
		}
		@Pc(37) Class466 local37 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28652();
		}
	}

	@OriginalMember(owner = "client!yc", name = "h", descriptor = "(Lclient!sk;Lclient!agg;I)Z", line = 164)
	static boolean method33464(@OriginalArg(0) Interface50 arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		return arg0 != null && arg0.method28750(arg1, client.anInterface46Array2, client.anInt3144 * 259780257, Class217.aClass65_1);
	}

	@OriginalMember(owner = "client!yc", name = "o", descriptor = "()V", line = 168)
	public void method33438() {
		@Pc(3) Class466 local3 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28652();
		}
	}

	@OriginalMember(owner = "client!yc", name = "s", descriptor = "(B)V", line = 168)
	public void method33441() {
		@Pc(3) Class466 local3 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28652();
		}
	}

	@OriginalMember(owner = "client!yc", name = "w", descriptor = "()V", line = 168)
	public void method33446() {
		@Pc(3) Class466 local3 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28652();
		}
	}

	@OriginalMember(owner = "client!yc", name = "t", descriptor = "()V", line = 168)
	public void method33449() {
		@Pc(3) Class466 local3 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28652();
		}
	}

	@OriginalMember(owner = "client!yc", name = "i", descriptor = "()V", line = 168)
	public void method33457() {
		@Pc(3) Class466 local3 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28652();
		}
	}

	@OriginalMember(owner = "client!yc", name = "u", descriptor = "(I)V", line = 174)
	public void method33442() {
		@Pc(3) Class161 local3 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23224();
		}
	}

	@OriginalMember(owner = "client!yc", name = "f", descriptor = "()V", line = 174)
	public void method33458() {
		@Pc(3) Class161 local3 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23224();
		}
	}

	@OriginalMember(owner = "client!yc", name = "af", descriptor = "(I)V", line = 180)
	public void method33437(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23240(arg0);
		}
		local3 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23240(arg0);
		}
		@Pc(39) Class466 local39 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28664(arg0);
		}
	}

	@OriginalMember(owner = "client!yc", name = "y", descriptor = "(II)V", line = 180)
	public void method33454(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23240(arg0);
		}
		local3 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23240(arg0);
		}
		@Pc(39) Class466 local39 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28664(arg0);
		}
	}

	@OriginalMember(owner = "client!yc", name = "k", descriptor = "(I)V", line = 180)
	public void method33459(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23240(arg0);
		}
		local3 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23240(arg0);
		}
		@Pc(39) Class466 local39 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28664(arg0);
		}
	}

	@OriginalMember(owner = "client!yc", name = "at", descriptor = "(I)V", line = 180)
	public void method33460(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23240(arg0);
		}
		local3 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23240(arg0);
		}
		@Pc(39) Class466 local39 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28664(arg0);
		}
	}

	@OriginalMember(owner = "client!yc", name = "b", descriptor = "(I)V", line = 192)
	public void method33444() {
		@Pc(3) Class161 local3 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23245();
		}
		local3 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23245();
		}
		@Pc(37) Class466 local37 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28669();
		}
	}

	@OriginalMember(owner = "client!yc", name = "ak", descriptor = "()V", line = 192)
	public void method33462() {
		@Pc(3) Class161 local3 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23245();
		}
		local3 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23245();
		}
		@Pc(37) Class466 local37 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28669();
		}
	}

	@OriginalMember(owner = "client!yc", name = "aa", descriptor = "()V", line = 192)
	public void method33463() {
		@Pc(3) Class161 local3 = this.aClass161_68;
		synchronized (this.aClass161_68) {
			this.aClass161_68.method23245();
		}
		local3 = this.aClass161_69;
		synchronized (this.aClass161_69) {
			this.aClass161_69.method23245();
		}
		@Pc(37) Class466 local37 = this.aClass466_1;
		synchronized (this.aClass466_1) {
			this.aClass466_1.method28669();
		}
	}
}
