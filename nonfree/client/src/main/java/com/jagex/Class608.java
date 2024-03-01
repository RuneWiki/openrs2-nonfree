package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public class Class608 implements Interface13 {

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
	public static final int anInt5561 = -1;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
	public static final int anInt5564 = 0;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public static final int anInt5565 = 1;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
	static final int anInt5566 = 16777215;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
	static final int anInt5567 = 70;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[I")
	public int[] anIntArray487;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Z")
	public boolean aBoolean827 = false;

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
	public int anInt5579 = -903627193;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
	public int anInt5569 = 669312675;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	public int anInt5570 = 1992503102;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	int anInt5568 = -1766142217;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
	int anInt5571 = -1507387017;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
	int anInt5572 = -199719183;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
	int anInt5573 = -729089625;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
	public int anInt5574 = 0;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
	public int anInt5576 = 0;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
	public int anInt5575 = -2128038707;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Ljava/lang/String;")
	String aString232 = "";

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	public int anInt5578 = 2079109471;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
	public int anInt5563 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	public int anInt5577 = 0;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	public int anInt5562 = 0;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
	int anInt5580 = 1319444603;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
	int anInt5581 = 1550157383;

	@OriginalMember(owner = "client!vb", name = "ae", descriptor = "I")
	int anInt5582 = 319020291;

	@OriginalMember(owner = "client!vb", name = "ag", descriptor = "I")
	int anInt5583 = -59333593;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "Lclient!vl;")
	final Class152 aClass152_1;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!ao;")
	final Interface11 anInterface11_13;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "(FFI)F", line = 30)
	public static float method31959(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(ILclient!vl;Lclient!ao;)V", line = 50)
	Class608(@OriginalArg(0) int arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) Interface11 arg2) {
		this.aClass152_1 = arg1;
		this.anInterface11_13 = arg2;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(Lclient!alw;B)V", line = 57)
	@Override
	public void method36654(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method31944(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "(Lclient!alw;)V", line = 57)
	@Override
	public void method36655(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method31944(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(Lclient!alw;)V", line = 57)
	@Override
	public void method36657(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method31944(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "(Lclient!alw;)V", line = 57)
	@Override
	public void method36658(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method31944(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "(Lclient!alw;)V", line = 57)
	@Override
	public void method36656(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method31944(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "(Lclient!alw;II)V", line = 64)
	void method31944(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5579 = arg0.method22436() * 903627193;
		} else if (arg1 == 2) {
			this.anInt5569 = arg0.method22417() * 890968413;
			this.aBoolean827 = true;
		} else if (arg1 == 3) {
			this.anInt5568 = arg0.method22436() * 1766142217;
		} else if (arg1 == 4) {
			this.anInt5572 = arg0.method22436() * 199719183;
		} else if (arg1 == 5) {
			this.anInt5571 = arg0.method22436() * 1507387017;
		} else if (arg1 == 6) {
			this.anInt5573 = arg0.method22436() * 729089625;
		} else if (arg1 == 7) {
			this.anInt5574 = arg0.method22482() * -1733504063;
		} else if (arg1 == 8) {
			this.aString232 = arg0.method22428();
		} else if (arg1 == 9) {
			this.anInt5570 = arg0.method22415() * 212534357;
		} else if (arg1 == 10) {
			this.anInt5576 = arg0.method22482() * 426052467;
		} else if (arg1 == 11) {
			this.anInt5575 = 0;
		} else if (arg1 == 12) {
			this.anInt5578 = arg0.method22413() * -2079109471;
		} else if (arg1 == 13) {
			this.anInt5563 = arg0.method22482() * -4667447;
		} else if (arg1 == 14) {
			this.anInt5575 = arg0.method22415() * 2128038707;
		} else if (arg1 == 16) {
			this.anInt5577 = arg0.method22482() * 311657605;
			this.anInt5562 = arg0.method22482() * -303555573;
		} else if (arg1 == 17 || arg1 == 18) {
			this.anInt5580 = arg0.method22415() * -1319444603;
			if (this.anInt5580 * 878854477 == 65535) {
				this.anInt5580 = 1319444603;
			}
			this.anInt5581 = arg0.method22415() * -1550157383;
			if (this.anInt5581 * 2096741513 == 65535) {
				this.anInt5581 = 1550157383;
			}
			@Pc(208) int local208 = -1;
			if (arg1 == 18) {
				local208 = arg0.method22415();
				if (local208 == 65535) {
					local208 = -1;
				}
			}
			@Pc(224) int local224 = arg0.method22413();
			this.anIntArray487 = new int[local224 + 2];
			for (@Pc(232) int local232 = 0; local232 <= local224; local232++) {
				this.anIntArray487[local232] = arg0.method22415();
				if (this.anIntArray487[local232] == 65535) {
					this.anIntArray487[local232] = -1;
				}
			}
			this.anIntArray487[local224 + 1] = local208;
		} else if (arg1 == 19) {
			this.anInt5582 = arg0.method22415() * 319020291;
		} else if (arg1 == 20) {
			this.anInt5583 = arg0.method22415() * -59333593;
		}
	}

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "(Lclient!alw;I)V", line = 64)
	void method31947(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5579 = arg0.method22436() * 903627193;
		} else if (arg1 == 2) {
			this.anInt5569 = arg0.method22417() * 890968413;
			this.aBoolean827 = true;
		} else if (arg1 == 3) {
			this.anInt5568 = arg0.method22436() * 1766142217;
		} else if (arg1 == 4) {
			this.anInt5572 = arg0.method22436() * 199719183;
		} else if (arg1 == 5) {
			this.anInt5571 = arg0.method22436() * 1507387017;
		} else if (arg1 == 6) {
			this.anInt5573 = arg0.method22436() * 729089625;
		} else if (arg1 == 7) {
			this.anInt5574 = arg0.method22482() * -1733504063;
		} else if (arg1 == 8) {
			this.aString232 = arg0.method22428();
		} else if (arg1 == 9) {
			this.anInt5570 = arg0.method22415() * 212534357;
		} else if (arg1 == 10) {
			this.anInt5576 = arg0.method22482() * 426052467;
		} else if (arg1 == 11) {
			this.anInt5575 = 0;
		} else if (arg1 == 12) {
			this.anInt5578 = arg0.method22413() * -2079109471;
		} else if (arg1 == 13) {
			this.anInt5563 = arg0.method22482() * -4667447;
		} else if (arg1 == 14) {
			this.anInt5575 = arg0.method22415() * 2128038707;
		} else if (arg1 == 16) {
			this.anInt5577 = arg0.method22482() * 311657605;
			this.anInt5562 = arg0.method22482() * -303555573;
		} else if (arg1 == 17 || arg1 == 18) {
			this.anInt5580 = arg0.method22415() * -1319444603;
			if (this.anInt5580 * 878854477 == 65535) {
				this.anInt5580 = 1319444603;
			}
			this.anInt5581 = arg0.method22415() * -1550157383;
			if (this.anInt5581 * 2096741513 == 65535) {
				this.anInt5581 = 1550157383;
			}
			@Pc(208) int local208 = -1;
			if (arg1 == 18) {
				local208 = arg0.method22415();
				if (local208 == 65535) {
					local208 = -1;
				}
			}
			@Pc(224) int local224 = arg0.method22413();
			this.anIntArray487 = new int[local224 + 2];
			for (@Pc(232) int local232 = 0; local232 <= local224; local232++) {
				this.anIntArray487[local232] = arg0.method22415();
				if (this.anIntArray487[local232] == 65535) {
					this.anIntArray487[local232] = -1;
				}
			}
			this.anIntArray487[local224 + 1] = local208;
		} else if (arg1 == 19) {
			this.anInt5582 = arg0.method22415() * 319020291;
		} else if (arg1 == 20) {
			this.anInt5583 = arg0.method22415() * -59333593;
		}
	}

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "(B)I", line = 81)
	public static int method31962() {
		return Class522.aTwitchEventLiveStreams1 == null || Class625.anInt5697 * 110744317 >= Class522.aTwitchEventLiveStreams1.streamCount - 1 ? -1 : (Class625.anInt5697 += -2118100395) * 110744317;
	}

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "(Lclient!em;Lclient!ep;I)Lclient!vb;", line = 109)
	public final Class608 method31938(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface23 arg1) {
		@Pc(1) int local1 = -1;
		if (this.anIntArray487 == null) {
			return this;
		} else if (arg0 == null || arg1 == null) {
			return null;
		} else {
			if (this.anInt5580 * 878854477 != -1) {
				@Pc(27) Class379 local27 = arg0.method27953(this.anInt5580 * 878854477);
				if (local27 != null) {
					local1 = arg1.method33454(local27);
				}
			} else if (this.anInt5581 * 2096741513 != -1) {
				@Pc(51) Class108 local51 = arg0.method27954(Class138.aClass138_65, this.anInt5581 * 2096741513);
				if (local51 != null) {
					local1 = arg1.method33455(local51);
				}
			}
			if (local1 >= 0 && local1 < this.anIntArray487.length - 1) {
				return this.anIntArray487[local1] == -1 ? null : (Class608) this.anInterface11_13.method18261(this.anIntArray487[local1]);
			} else {
				@Pc(77) int local77 = this.anIntArray487[this.anIntArray487.length - 1];
				return local77 == -1 ? null : (Class608) this.anInterface11_13.method18261(local77);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "(Lclient!em;Lclient!ep;)Lclient!vb;", line = 109)
	public final Class608 method31953(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface23 arg1) {
		@Pc(1) int local1 = -1;
		if (this.anIntArray487 == null) {
			return this;
		} else if (arg0 == null || arg1 == null) {
			return null;
		} else {
			if (this.anInt5580 * 878854477 != -1) {
				@Pc(27) Class379 local27 = arg0.method27953(this.anInt5580 * 878854477);
				if (local27 != null) {
					local1 = arg1.method33454(local27);
				}
			} else if (this.anInt5581 * 2096741513 != -1) {
				@Pc(51) Class108 local51 = arg0.method27954(Class138.aClass138_65, this.anInt5581 * 2096741513);
				if (local51 != null) {
					local1 = arg1.method33455(local51);
				}
			}
			if (local1 >= 0 && local1 < this.anIntArray487.length - 1) {
				return this.anIntArray487[local1] == -1 ? null : (Class608) this.anInterface11_13.method18261(this.anIntArray487[local1]);
			} else {
				@Pc(77) int local77 = this.anIntArray487[this.anIntArray487.length - 1];
				return local77 == -1 ? null : (Class608) this.anInterface11_13.method18261(local77);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "(II)Ljava/lang/String;", line = 130)
	public String method31939(@OriginalArg(0) int arg0) {
		@Pc(2) String local2 = this.aString232;
		@Pc(14) int local14 = arg0 * this.anInt5582 * 455308715 / (this.anInt5583 * -1736668265);
		while (true) {
			@Pc(18) int local18 = local2.indexOf("%1");
			if (local18 < 0) {
				return local2;
			}
			local2 = local2.substring(0, local18) + Class107.method18120(local14, false) + local2.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "(I)Ljava/lang/String;", line = 130)
	public String method31948(@OriginalArg(0) int arg0) {
		@Pc(2) String local2 = this.aString232;
		@Pc(14) int local14 = arg0 * this.anInt5582 * 455308715 / (this.anInt5583 * -1736668265);
		while (true) {
			@Pc(18) int local18 = local2.indexOf("%1");
			if (local18 < 0) {
				return local2;
			}
			local2 = local2.substring(0, local18) + Class107.method18120(local14, false) + local2.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(Lclient!dh;I)Lclient!cm;", line = 141)
	public Class100 method31945(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5568 * -804410055 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5568 * -804410055));
		if (local17 == null) {
			this.method31943(arg0);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5568 * -804410055));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(Lclient!dh;I)Lclient!cm;", line = 151)
	public Class100 method31940(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5571 * -2131988551 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5571 * -2131988551));
		if (local17 == null) {
			this.method31943(arg0);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5571 * -2131988551));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "(Lclient!dh;)Lclient!cm;", line = 151)
	public Class100 method31946(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5571 * -2131988551 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5571 * -2131988551));
		if (local17 == null) {
			this.method31943(arg0);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5571 * -2131988551));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Lclient!dh;)Lclient!cm;", line = 151)
	public Class100 method31950(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5571 * -2131988551 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5571 * -2131988551));
		if (local17 == null) {
			this.method31943(arg0);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5571 * -2131988551));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "(Lclient!dh;)Lclient!cm;", line = 151)
	public Class100 method31951(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5571 * -2131988551 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5571 * -2131988551));
		if (local17 == null) {
			this.method31943(arg0);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5571 * -2131988551));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(Lclient!dh;)Lclient!cm;", line = 161)
	public Class100 method31937(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5572 * -183740945 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5572 * -183740945));
		if (local17 == null) {
			this.method31943(arg0);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5572 * -183740945));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "(Lclient!dh;I)Lclient!cm;", line = 161)
	public Class100 method31941(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5572 * -183740945 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5572 * -183740945));
		if (local17 == null) {
			this.method31943(arg0);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5572 * -183740945));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!dh;)Lclient!cm;", line = 161)
	public Class100 method31949(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5572 * -183740945 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5572 * -183740945));
		if (local17 == null) {
			this.method31943(arg0);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5572 * -183740945));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "(Lclient!dh;B)Lclient!cm;", line = 171)
	public Class100 method31942(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5573 * 202498537 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5573 * 202498537));
		if (local17 == null) {
			this.method31943(arg0);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5573 * 202498537));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "(Lclient!dh;)Lclient!cm;", line = 171)
	public Class100 method31952(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5573 * 202498537 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5573 * 202498537));
		if (local17 == null) {
			this.method31943(arg0);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5573 * 202498537));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "(Lclient!dh;)Lclient!cm;", line = 171)
	public Class100 method31954(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5573 * 202498537 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5573 * 202498537));
		if (local17 == null) {
			this.method31943(arg0);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5573 * 202498537));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "(Lclient!dh;)Lclient!cm;", line = 171)
	public Class100 method31955(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5573 * 202498537 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5573 * 202498537));
		if (local17 == null) {
			this.method31943(arg0);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25839((long) (this.anInt5573 * 202498537));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "(Lclient!dh;I)V", line = 181)
	void method31943(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class497 local3 = this.aClass152_1.aClass497_45;
		@Pc(33) Class105 local33;
		if (this.anInt5568 * -804410055 >= 0 && this.aClass152_1.aClass240_21.method25839((long) (this.anInt5568 * -804410055)) == null && local3.method30054(this.anInt5568 * -804410055)) {
			local33 = Class203.method24650(local3, this.anInt5568 * -804410055);
			this.aClass152_1.aClass240_21.method25830(arg0.method20499(local33, true), (long) (this.anInt5568 * -804410055));
		}
		if (this.anInt5571 * -2131988551 >= 0 && this.aClass152_1.aClass240_21.method25839((long) (this.anInt5571 * -2131988551)) == null && local3.method30054(this.anInt5571 * -2131988551)) {
			local33 = Class203.method24650(local3, this.anInt5571 * -2131988551);
			this.aClass152_1.aClass240_21.method25830(arg0.method20499(local33, true), (long) (this.anInt5571 * -2131988551));
		}
		if (this.anInt5572 * -183740945 >= 0 && this.aClass152_1.aClass240_21.method25839((long) (this.anInt5572 * -183740945)) == null && local3.method30054(this.anInt5572 * -183740945)) {
			local33 = Class203.method24650(local3, this.anInt5572 * -183740945);
			this.aClass152_1.aClass240_21.method25830(arg0.method20499(local33, true), (long) (this.anInt5572 * -183740945));
		}
		if (this.anInt5573 * 202498537 >= 0 && this.aClass152_1.aClass240_21.method25839((long) (this.anInt5573 * 202498537)) == null && local3.method30054(this.anInt5573 * 202498537)) {
			local33 = Class203.method24650(local3, this.anInt5573 * 202498537);
			this.aClass152_1.aClass240_21.method25830(arg0.method20499(local33, true), (long) (this.anInt5573 * 202498537));
		}
	}

	@OriginalMember(owner = "client!vb", name = "ae", descriptor = "(Lclient!dh;)V", line = 181)
	void method31956(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class497 local3 = this.aClass152_1.aClass497_45;
		@Pc(33) Class105 local33;
		if (this.anInt5568 * -804410055 >= 0 && this.aClass152_1.aClass240_21.method25839((long) (this.anInt5568 * -804410055)) == null && local3.method30054(this.anInt5568 * -804410055)) {
			local33 = Class203.method24650(local3, this.anInt5568 * -804410055);
			this.aClass152_1.aClass240_21.method25830(arg0.method20499(local33, true), (long) (this.anInt5568 * -804410055));
		}
		if (this.anInt5571 * -2131988551 >= 0 && this.aClass152_1.aClass240_21.method25839((long) (this.anInt5571 * -2131988551)) == null && local3.method30054(this.anInt5571 * -2131988551)) {
			local33 = Class203.method24650(local3, this.anInt5571 * -2131988551);
			this.aClass152_1.aClass240_21.method25830(arg0.method20499(local33, true), (long) (this.anInt5571 * -2131988551));
		}
		if (this.anInt5572 * -183740945 >= 0 && this.aClass152_1.aClass240_21.method25839((long) (this.anInt5572 * -183740945)) == null && local3.method30054(this.anInt5572 * -183740945)) {
			local33 = Class203.method24650(local3, this.anInt5572 * -183740945);
			this.aClass152_1.aClass240_21.method25830(arg0.method20499(local33, true), (long) (this.anInt5572 * -183740945));
		}
		if (this.anInt5573 * 202498537 >= 0 && this.aClass152_1.aClass240_21.method25839((long) (this.anInt5573 * 202498537)) == null && local3.method30054(this.anInt5573 * 202498537)) {
			local33 = Class203.method24650(local3, this.anInt5573 * 202498537);
			this.aClass152_1.aClass240_21.method25830(arg0.method20499(local33, true), (long) (this.anInt5573 * 202498537));
		}
	}

	@OriginalMember(owner = "client!vb", name = "ag", descriptor = "(Lclient!dh;)V", line = 181)
	void method31957(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class497 local3 = this.aClass152_1.aClass497_45;
		@Pc(33) Class105 local33;
		if (this.anInt5568 * -804410055 >= 0 && this.aClass152_1.aClass240_21.method25839((long) (this.anInt5568 * -804410055)) == null && local3.method30054(this.anInt5568 * -804410055)) {
			local33 = Class203.method24650(local3, this.anInt5568 * -804410055);
			this.aClass152_1.aClass240_21.method25830(arg0.method20499(local33, true), (long) (this.anInt5568 * -804410055));
		}
		if (this.anInt5571 * -2131988551 >= 0 && this.aClass152_1.aClass240_21.method25839((long) (this.anInt5571 * -2131988551)) == null && local3.method30054(this.anInt5571 * -2131988551)) {
			local33 = Class203.method24650(local3, this.anInt5571 * -2131988551);
			this.aClass152_1.aClass240_21.method25830(arg0.method20499(local33, true), (long) (this.anInt5571 * -2131988551));
		}
		if (this.anInt5572 * -183740945 >= 0 && this.aClass152_1.aClass240_21.method25839((long) (this.anInt5572 * -183740945)) == null && local3.method30054(this.anInt5572 * -183740945)) {
			local33 = Class203.method24650(local3, this.anInt5572 * -183740945);
			this.aClass152_1.aClass240_21.method25830(arg0.method20499(local33, true), (long) (this.anInt5572 * -183740945));
		}
		if (this.anInt5573 * 202498537 >= 0 && this.aClass152_1.aClass240_21.method25839((long) (this.anInt5573 * 202498537)) == null && local3.method30054(this.anInt5573 * 202498537)) {
			local33 = Class203.method24650(local3, this.anInt5573 * 202498537);
			this.aClass152_1.aClass240_21.method25830(arg0.method20499(local33, true), (long) (this.anInt5573 * 202498537));
		}
	}

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "(I)V", line = 208)
	@Override
	public void method36653() {
	}

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "()V", line = 208)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!vb", name = "es", descriptor = "(IB)Z", line = 1760)
	static boolean method31960(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 6 || arg0 == 3 || arg0 == 16 || arg0 == 8;
	}

	@OriginalMember(owner = "client!vb", name = "gm", descriptor = "(B)V", line = 3819)
	static final void method31961() {
		@Pc(3) int local3 = Class174.anInt3293 * -1081967415;
		@Pc(5) int[] local5 = Class174.anIntArray278;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class132_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null) {
				Class233.method25732(local16, false);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "nt", descriptor = "(Lclient!yf;B)V", line = 7426)
	static final void method31958(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class157.method14265(local16, local22, arg0);
	}
}
