package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public class Class578 implements Interface12 {

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
	public static final int anInt5407 = 0;

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
	static final int anInt5408 = 70;

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
	public static final int anInt5412 = 1;

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
	public static final int anInt5416 = -1;

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
	static final int anInt5418 = 16777215;

	@OriginalMember(owner = "client!uj", name = "cq", descriptor = "I")
	public static int anInt5428;

	@OriginalMember(owner = "client!uj", name = "hf", descriptor = "Lclient!anc;")
	public static Class35_Sub3 aClass35_Sub3_1;

	@OriginalMember(owner = "client!uj", name = "oy", descriptor = "I")
	public static int anInt5429;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "[I")
	public int[] anIntArray503;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "Z")
	public boolean aBoolean810 = false;

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "I")
	public int anInt5421 = 184437089;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
	public int anInt5410 = 1577737303;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
	public int anInt5411 = 1866303766;

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
	int anInt5405 = 1213463151;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
	int anInt5409 = -978834779;

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
	int anInt5413 = -603706763;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
	int anInt5414 = 1421348389;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
	public int anInt5415 = 0;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
	public int anInt5406 = 0;

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
	public int anInt5417 = 1256435453;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "Ljava/lang/String;")
	String aString230 = "";

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
	public int anInt5419 = 1185770227;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
	public int anInt5420 = 0;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	public int anInt5423 = 0;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
	public int anInt5422 = 0;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
	int anInt5424 = -2105446301;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
	int anInt5425 = 525250797;

	@OriginalMember(owner = "client!uj", name = "aj", descriptor = "I")
	int anInt5426 = -1925512347;

	@OriginalMember(owner = "client!uj", name = "ai", descriptor = "I")
	int anInt5427 = -1889864929;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "Lclient!ut;")
	final Class137 aClass137_1;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "Lclient!as;")
	final Interface13 anInterface13_13;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(ILclient!ut;Lclient!as;)V", line = 50)
	Class578(@OriginalArg(0) int arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) Interface13 arg2) {
		this.aClass137_1 = arg1;
		this.anInterface13_13 = arg2;
	}

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "(Lclient!akv;B)V", line = 57)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method31631(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "(Lclient!akv;)V", line = 57)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method31631(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "(Lclient!akv;)V", line = 57)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method31631(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "(Lclient!akv;)V", line = 57)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method31631(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "(Lclient!akv;II)V", line = 64)
	void method31631(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5421 = arg0.method22549() * -184437089;
		} else if (arg1 == 2) {
			this.anInt5410 = arg0.method22492() * 1257612201;
			this.aBoolean810 = true;
		} else if (arg1 == 3) {
			this.anInt5405 = arg0.method22549() * -1213463151;
		} else if (arg1 == 4) {
			this.anInt5413 = arg0.method22549() * 603706763;
		} else if (arg1 == 5) {
			this.anInt5409 = arg0.method22549() * 978834779;
		} else if (arg1 == 6) {
			this.anInt5414 = arg0.method22549() * -1421348389;
		} else if (arg1 == 7) {
			this.anInt5415 = arg0.method22487() * -1915218899;
		} else if (arg1 == 8) {
			this.aString230 = arg0.method22526();
		} else if (arg1 == 9) {
			this.anInt5411 = arg0.method22483() * -1875395463;
		} else if (arg1 == 10) {
			this.anInt5406 = arg0.method22487() * 653431865;
		} else if (arg1 == 11) {
			this.anInt5417 = 0;
		} else if (arg1 == 12) {
			this.anInt5419 = arg0.method22478() * -1185770227;
		} else if (arg1 == 13) {
			this.anInt5420 = arg0.method22487() * 1066318293;
		} else if (arg1 == 14) {
			this.anInt5417 = arg0.method22483() * -1256435453;
		} else if (arg1 == 16) {
			this.anInt5423 = arg0.method22487() * -1721496031;
			this.anInt5422 = arg0.method22487() * 475879979;
		} else if (arg1 == 17 || arg1 == 18) {
			this.anInt5424 = arg0.method22483() * 2105446301;
			if (this.anInt5424 * 56323765 == 65535) {
				this.anInt5424 = -2105446301;
			}
			this.anInt5425 = arg0.method22483() * -525250797;
			if (this.anInt5425 * -1235168485 == 65535) {
				this.anInt5425 = 525250797;
			}
			@Pc(208) int local208 = -1;
			if (arg1 == 18) {
				local208 = arg0.method22483();
				if (local208 == 65535) {
					local208 = -1;
				}
			}
			@Pc(224) int local224 = arg0.method22478();
			this.anIntArray503 = new int[local224 + 2];
			for (@Pc(232) int local232 = 0; local232 <= local224; local232++) {
				this.anIntArray503[local232] = arg0.method22483();
				if (this.anIntArray503[local232] == 65535) {
					this.anIntArray503[local232] = -1;
				}
			}
			this.anIntArray503[local224 + 1] = local208;
		} else if (arg1 == 19) {
			this.anInt5426 = arg0.method22483() * -1925512347;
		} else if (arg1 == 20) {
			this.anInt5427 = arg0.method22483() * -1889864929;
		}
	}

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "(CI)C", line = 72)
	static char method31632(@OriginalArg(0) char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "(Lclient!cn;Lclient!cu;B)Lclient!uj;", line = 109)
	public final Class578 method31633(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Interface19 arg1) {
		@Pc(1) int local1 = -1;
		if (this.anIntArray503 == null) {
			return this;
		} else if (arg0 == null || arg1 == null) {
			return null;
		} else {
			if (this.anInt5424 * 56323765 != -1) {
				@Pc(27) Class343 local27 = arg0.method27606(this.anInt5424 * 56323765);
				if (local27 != null) {
					local1 = arg1.method35935(local27);
				}
			} else if (this.anInt5425 * -1235168485 != -1) {
				@Pc(50) Class75 local50 = arg0.method27607(Class127.aClass127_63, this.anInt5425 * -1235168485);
				if (local50 != null) {
					local1 = arg1.method35934(local50);
				}
			}
			if (local1 >= 0 && local1 < this.anIntArray503.length - 1) {
				return this.anIntArray503[local1] == -1 ? null : (Class578) this.anInterface13_13.method18319(this.anIntArray503[local1]);
			} else {
				@Pc(75) int local75 = this.anIntArray503[this.anIntArray503.length - 1];
				return local75 == -1 ? null : (Class578) this.anInterface13_13.method18319(local75);
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "(Lclient!cn;Lclient!cu;)Lclient!uj;", line = 109)
	public final Class578 method31634(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Interface19 arg1) {
		@Pc(1) int local1 = -1;
		if (this.anIntArray503 == null) {
			return this;
		} else if (arg0 == null || arg1 == null) {
			return null;
		} else {
			if (this.anInt5424 * 56323765 != -1) {
				@Pc(27) Class343 local27 = arg0.method27606(this.anInt5424 * 56323765);
				if (local27 != null) {
					local1 = arg1.method35935(local27);
				}
			} else if (this.anInt5425 * -1235168485 != -1) {
				@Pc(50) Class75 local50 = arg0.method27607(Class127.aClass127_63, this.anInt5425 * -1235168485);
				if (local50 != null) {
					local1 = arg1.method35934(local50);
				}
			}
			if (local1 >= 0 && local1 < this.anIntArray503.length - 1) {
				return this.anIntArray503[local1] == -1 ? null : (Class578) this.anInterface13_13.method18319(this.anIntArray503[local1]);
			} else {
				@Pc(75) int local75 = this.anIntArray503[this.anIntArray503.length - 1];
				return local75 == -1 ? null : (Class578) this.anInterface13_13.method18319(local75);
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "(Lclient!cn;Lclient!cu;)Lclient!uj;", line = 109)
	public final Class578 method31635(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Interface19 arg1) {
		@Pc(1) int local1 = -1;
		if (this.anIntArray503 == null) {
			return this;
		} else if (arg0 == null || arg1 == null) {
			return null;
		} else {
			if (this.anInt5424 * 56323765 != -1) {
				@Pc(27) Class343 local27 = arg0.method27606(this.anInt5424 * 56323765);
				if (local27 != null) {
					local1 = arg1.method35935(local27);
				}
			} else if (this.anInt5425 * -1235168485 != -1) {
				@Pc(50) Class75 local50 = arg0.method27607(Class127.aClass127_63, this.anInt5425 * -1235168485);
				if (local50 != null) {
					local1 = arg1.method35934(local50);
				}
			}
			if (local1 >= 0 && local1 < this.anIntArray503.length - 1) {
				return this.anIntArray503[local1] == -1 ? null : (Class578) this.anInterface13_13.method18319(this.anIntArray503[local1]);
			} else {
				@Pc(75) int local75 = this.anIntArray503[this.anIntArray503.length - 1];
				return local75 == -1 ? null : (Class578) this.anInterface13_13.method18319(local75);
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(IB)Ljava/lang/String;", line = 130)
	public String method31636(@OriginalArg(0) int arg0) {
		@Pc(2) String local2 = this.aString230;
		@Pc(14) int local14 = arg0 * -308054419 * this.anInt5426 / (this.anInt5427 * -1184184097);
		while (true) {
			@Pc(18) int local18 = local2.indexOf("%1");
			if (local18 < 0) {
				return local2;
			}
			local2 = local2.substring(0, local18) + Class341.method27761(local14, false) + local2.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "(I)Ljava/lang/String;", line = 130)
	public String method31637(@OriginalArg(0) int arg0) {
		@Pc(2) String local2 = this.aString230;
		@Pc(14) int local14 = arg0 * -308054419 * this.anInt5426 / (this.anInt5427 * -1184184097);
		while (true) {
			@Pc(18) int local18 = local2.indexOf("%1");
			if (local18 < 0) {
				return local2;
			}
			local2 = local2.substring(0, local18) + Class341.method27761(local14, false) + local2.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "(Lclient!dx;I)Lclient!cy;", line = 141)
	public Class83 method31638(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5405 * 237460337 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5405 * 237460337));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5405 * 237460337));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(Lclient!dx;)Lclient!cy;", line = 141)
	public Class83 method31639(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5405 * 237460337 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5405 * 237460337));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5405 * 237460337));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(Lclient!dx;)Lclient!cy;", line = 141)
	public Class83 method31640(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5405 * 237460337 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5405 * 237460337));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5405 * 237460337));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "(Lclient!dx;)Lclient!cy;", line = 141)
	public Class83 method31641(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5405 * 237460337 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5405 * 237460337));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5405 * 237460337));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "(Lclient!dx;)Lclient!cy;", line = 151)
	public Class83 method31642(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5409 * 84693715 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5409 * 84693715));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5409 * 84693715));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "(Lclient!dx;I)Lclient!cy;", line = 151)
	public Class83 method31643(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5409 * 84693715 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5409 * 84693715));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5409 * 84693715));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(Lclient!dx;)Lclient!cy;", line = 151)
	public Class83 method31644(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5409 * 84693715 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5409 * 84693715));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5409 * 84693715));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!dx;)Lclient!cy;", line = 151)
	public Class83 method31645(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5409 * 84693715 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5409 * 84693715));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5409 * 84693715));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "(Lclient!dx;I)Lclient!cy;", line = 161)
	public Class83 method31646(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5413 * 901458467 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5413 * 901458467));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5413 * 901458467));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "(Lclient!dx;)Lclient!cy;", line = 161)
	public Class83 method31647(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5413 * 901458467 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5413 * 901458467));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5413 * 901458467));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "(Lclient!dx;I)Lclient!cy;", line = 171)
	public Class83 method31648(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5414 * 1138795091 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5414 * 1138795091));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5414 * 1138795091));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "(Lclient!dx;)Lclient!cy;", line = 171)
	public Class83 method31649(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5414 * 1138795091 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5414 * 1138795091));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5414 * 1138795091));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "aj", descriptor = "(Lclient!dx;)Lclient!cy;", line = 171)
	public Class83 method31650(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5414 * 1138795091 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5414 * 1138795091));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5414 * 1138795091));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "ai", descriptor = "(Lclient!dx;)Lclient!cy;", line = 171)
	public Class83 method31651(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5414 * 1138795091 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5414 * 1138795091));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5414 * 1138795091));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "ag", descriptor = "(Lclient!dx;)Lclient!cy;", line = 171)
	public Class83 method31652(@OriginalArg(0) Class86 arg0) {
		if (this.anInt5414 * 1138795091 < 0) {
			return null;
		}
		@Pc(17) Class83 local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5414 * 1138795091));
		if (local17 == null) {
			this.method31653(arg0);
			local17 = (Class83) this.aClass137_1.aClass232_28.method25835((long) (this.anInt5414 * 1138795091));
		}
		return local17;
	}

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "(Lclient!dx;I)V", line = 181)
	void method31653(@OriginalArg(0) Class86 arg0) {
		@Pc(3) Class478 local3 = this.aClass137_1.aClass478_41;
		@Pc(33) Class89 local33;
		if (this.anInt5405 * 237460337 >= 0 && this.aClass137_1.aClass232_28.method25835((long) (this.anInt5405 * 237460337)) == null && local3.method29730(this.anInt5405 * 237460337)) {
			local33 = Class210.method25594(local3, this.anInt5405 * 237460337);
			this.aClass137_1.aClass232_28.method25844(arg0.method20076(local33, true), (long) (this.anInt5405 * 237460337));
		}
		if (this.anInt5409 * 84693715 >= 0 && this.aClass137_1.aClass232_28.method25835((long) (this.anInt5409 * 84693715)) == null && local3.method29730(this.anInt5409 * 84693715)) {
			local33 = Class210.method25594(local3, this.anInt5409 * 84693715);
			this.aClass137_1.aClass232_28.method25844(arg0.method20076(local33, true), (long) (this.anInt5409 * 84693715));
		}
		if (this.anInt5413 * 901458467 >= 0 && this.aClass137_1.aClass232_28.method25835((long) (this.anInt5413 * 901458467)) == null && local3.method29730(this.anInt5413 * 901458467)) {
			local33 = Class210.method25594(local3, this.anInt5413 * 901458467);
			this.aClass137_1.aClass232_28.method25844(arg0.method20076(local33, true), (long) (this.anInt5413 * 901458467));
		}
		if (this.anInt5414 * 1138795091 >= 0 && this.aClass137_1.aClass232_28.method25835((long) (this.anInt5414 * 1138795091)) == null && local3.method29730(this.anInt5414 * 1138795091)) {
			local33 = Class210.method25594(local3, this.anInt5414 * 1138795091);
			this.aClass137_1.aClass232_28.method25844(arg0.method20076(local33, true), (long) (this.anInt5414 * 1138795091));
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V", line = 208)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "()V", line = 208)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "()V", line = 208)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!uj", name = "kp", descriptor = "(Lclient!gh;Lclient!gm;I)Lclient!gm;", line = 10816)
	public static final Class277 method31654(@OriginalArg(0) Class273 arg0, @OriginalArg(1) Class277 arg1) {
		if (arg1.anInt3876 * -742015869 != -1) {
			return arg0.method26538(arg1.anInt3876 * -742015869);
		}
		if (!arg0.aBoolean662) {
			@Pc(23) int local23 = arg1.anInt3863 * -1278450723 >>> 16;
			@Pc(28) Class19 local28 = new Class19(client.aClass12_20);
			for (@Pc(33) Class77_Sub38 local33 = (Class77_Sub38) local28.method397(); local33 != null; local33 = (Class77_Sub38) local28.next()) {
				if (local33.anInt3113 * 1225863589 == local23) {
					return Class155.method23628((int) (local33.aLong229 * 8258869577519436579L));
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uj", name = "aix", descriptor = "(Lclient!yf;B)V", line = 10986)
	static final void method31655(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(28) boolean local28 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] == 1;
		if (!Class72.method1020(local13, local28)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uj", name = "axx", descriptor = "(Lclient!yf;I)V", line = 13462)
	static final void method31656(@OriginalArg(0) Class665 arg0) {
		Class465.method29555((Class104_Sub1) arg0.anInterface61_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307], true);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) client.aFloatArray96[0];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) client.aFloatArray96[1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) client.aFloatArray96[2];
	}
}
