package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public class Class303 implements Interface12 {

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "[I")
	int[] anIntArray423;

	@OriginalMember(owner = "client!hm", name = "z", descriptor = "[I")
	public int[] anIntArray424;

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "Ljava/lang/String;")
	public String aString190;

	@OriginalMember(owner = "client!hm", name = "y", descriptor = "[[I")
	int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
	public int anInt4054;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "[I")
	int[] anIntArray425;

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "[I")
	int[] anIntArray426;

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "[I")
	public int[] anIntArray427;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "Ljava/lang/String;")
	public String aString191;

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "[[I")
	int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray27;

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "[I")
	public int[] anIntArray428;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "[I")
	int[] anIntArray429;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "[I")
	int[] anIntArray430;

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray28;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "Lclient!aak;")
	Class12 aClass12_30;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
	public int anInt4055;

	@OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
	public int anInt4052 = 0;

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
	public int anInt4053 = 0;

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "Z")
	public boolean aBoolean695 = false;

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
	public int anInt4051 = 68399271;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "Lclient!as;")
	Interface13 anInterface13_11;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(ILclient!as;)V", line = 39)
	Class303(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		this.anInterface13_11 = arg1;
	}

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "(Lclient!akv;B)V", line = 45)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method27161(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "(Lclient!akv;)V", line = 45)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method27161(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "(Lclient!akv;)V", line = 45)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method27161(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!hm", name = "y", descriptor = "(Lclient!akv;)V", line = 45)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method27161(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "(Lclient!akv;II)V", line = 52)
	void method27161(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString191 = arg0.method22526();
		} else if (arg1 == 2) {
			this.aString190 = arg0.method22526();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method22478();
				this.anIntArrayArray51 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray51[local31][0] = arg0.method22483();
					this.anIntArrayArray51[local31][1] = arg0.method22500();
					this.anIntArrayArray51[local31][2] = arg0.method22500();
				}
			} else if (arg1 == 4) {
				local24 = arg0.method22478();
				this.anIntArrayArray49 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray49[local31][0] = arg0.method22483();
					this.anIntArrayArray49[local31][1] = arg0.method22500();
					this.anIntArrayArray49[local31][2] = arg0.method22500();
				}
			} else if (arg1 == 5) {
				arg0.method22483();
			} else if (arg1 == 6) {
				this.anInt4052 = arg0.method22478() * 11786055;
			} else if (arg1 == 7) {
				this.anInt4053 = arg0.method22478() * 309943947;
			} else if (arg1 == 8) {
				this.aBoolean695 = true;
			} else if (arg1 == 9) {
				this.anInt4054 = arg0.method22478() * 879390143;
			} else if (arg1 == 10) {
				local24 = arg0.method22478();
				this.anIntArray425 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray425[local31] = arg0.method22500();
				}
			} else if (arg1 == 12) {
				arg0.method22500();
			} else if (arg1 == 13) {
				local24 = arg0.method22478();
				this.anIntArray427 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray427[local31] = arg0.method22483();
				}
			} else if (arg1 == 14) {
				local24 = arg0.method22478();
				this.anIntArrayArray50 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray50[local31][0] = arg0.method22478();
					this.anIntArrayArray50[local31][1] = arg0.method22478();
				}
			} else if (arg1 == 15) {
				this.anInt4055 = arg0.method22483() * 2114865665;
			} else if (arg1 == 17) {
				this.anInt4051 = arg0.method22549() * -68399271;
			} else if (arg1 == 18) {
				local24 = arg0.method22478();
				this.anIntArray424 = new int[local24];
				this.anIntArray423 = new int[local24];
				this.anIntArray426 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray424[local31] = arg0.method22500();
					this.anIntArray423[local31] = arg0.method22500();
					this.anIntArray426[local31] = arg0.method22500();
					this.aStringArray27[local31] = arg0.method22523();
				}
			} else if (arg1 == 19) {
				local24 = arg0.method22478();
				this.anIntArray428 = new int[local24];
				this.anIntArray429 = new int[local24];
				this.anIntArray430 = new int[local24];
				this.aStringArray28 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray428[local31] = arg0.method22500();
					this.anIntArray429[local31] = arg0.method22500();
					this.anIntArray430[local31] = arg0.method22500();
					this.aStringArray28[local31] = arg0.method22523();
				}
			} else if (arg1 == 249) {
				local24 = arg0.method22478();
				if (this.aClass12_30 == null) {
					local31 = Class199.method25492(local24);
					this.aClass12_30 = new Class12(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method22478() == 1;
					@Pc(436) int local436 = arg0.method22492();
					@Pc(445) Class77 local445;
					if (local432) {
						local445 = new Class77_Sub6(arg0.method22523());
					} else {
						local445 = new Class77_Sub40(arg0.method22500());
					}
					this.aClass12_30.method184(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "w", descriptor = "()V", line = 147)
	@Override
	public void method36035() {
		if (this.aString190 == null) {
			this.aString190 = this.aString191;
		}
	}

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "()V", line = 147)
	@Override
	public void method36036() {
		if (this.aString190 == null) {
			this.aString190 = this.aString191;
		}
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 147)
	@Override
	public void method36034() {
		if (this.aString190 == null) {
			this.aString190 = this.aString191;
		}
	}

	@OriginalMember(owner = "client!hm", name = "x", descriptor = "(IIB)I", line = 151)
	public int method27162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass12_30 == null) {
			return arg1;
		} else {
			@Pc(12) Class77_Sub40 local12 = (Class77_Sub40) this.aClass12_30.method173((long) arg0);
			return local12 == null ? arg1 : local12.anInt1786 * -705967177;
		}
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "(II)I", line = 151)
	public int method27163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass12_30 == null) {
			return arg1;
		} else {
			@Pc(12) Class77_Sub40 local12 = (Class77_Sub40) this.aClass12_30.method173((long) arg0);
			return local12 == null ? arg1 : local12.anInt1786 * -705967177;
		}
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 158)
	public String method27164(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass12_30 == null) {
			return arg1;
		} else {
			@Pc(11) Class77_Sub6 local11 = (Class77_Sub6) this.aClass12_30.method173((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject5;
		}
	}

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 158)
	public String method27165(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass12_30 == null) {
			return arg1;
		} else {
			@Pc(11) Class77_Sub6 local11 = (Class77_Sub6) this.aClass12_30.method173((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject5;
		}
	}

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "(Lclient!cu;)Z", line = 165)
	public boolean method27166(@OriginalArg(0) Interface19 arg0) {
		@Pc(4) int local4;
		if (this.anIntArrayArray51 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray51.length; local4++) {
				@Pc(21) Class75 local21 = ((Interface17) arg0).method27607(Class127.aClass127_63, this.anIntArrayArray51[local4][0]);
				if (arg0.method35934(local21) >= this.anIntArrayArray51[local4][1]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray49 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray49.length; local4++) {
				@Pc(57) Class343 local57 = ((Interface17) arg0).method27606(this.anIntArrayArray49[local4][0]);
				if (arg0.method35935(local57) >= this.anIntArrayArray49[local4][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(Lclient!cu;)Z", line = 165)
	public boolean method27167(@OriginalArg(0) Interface19 arg0) {
		@Pc(4) int local4;
		if (this.anIntArrayArray51 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray51.length; local4++) {
				@Pc(21) Class75 local21 = ((Interface17) arg0).method27607(Class127.aClass127_63, this.anIntArrayArray51[local4][0]);
				if (arg0.method35934(local21) >= this.anIntArrayArray51[local4][1]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray49 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray49.length; local4++) {
				@Pc(57) Class343 local57 = ((Interface17) arg0).method27606(this.anIntArrayArray49[local4][0]);
				if (arg0.method35935(local57) >= this.anIntArrayArray49[local4][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "(Lclient!cu;I)Z", line = 165)
	public boolean method27168(@OriginalArg(0) Interface19 arg0) {
		@Pc(4) int local4;
		if (this.anIntArrayArray51 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray51.length; local4++) {
				@Pc(21) Class75 local21 = ((Interface17) arg0).method27607(Class127.aClass127_63, this.anIntArrayArray51[local4][0]);
				if (arg0.method35934(local21) >= this.anIntArrayArray51[local4][1]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray49 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray49.length; local4++) {
				@Pc(57) Class343 local57 = ((Interface17) arg0).method27606(this.anIntArrayArray49[local4][0]);
				if (arg0.method35935(local57) >= this.anIntArrayArray49[local4][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "(Lclient!cu;B)Z", line = 181)
	public boolean method27169(@OriginalArg(0) Interface19 arg0) {
		@Pc(4) int local4;
		if (this.anIntArrayArray51 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray51.length; local4++) {
				@Pc(21) Class75 local21 = ((Interface17) arg0).method27607(Class127.aClass127_63, this.anIntArrayArray51[local4][0]);
				if (arg0.method35934(local21) >= this.anIntArrayArray51[local4][2]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray49 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray49.length; local4++) {
				@Pc(57) Class343 local57 = ((Interface17) arg0).method27606(this.anIntArrayArray49[local4][0]);
				if (arg0.method35935(local57) >= this.anIntArrayArray49[local4][2]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "(Lclient!cu;B)Z", line = 197)
	public boolean method27170(@OriginalArg(0) Interface19 arg0) {
		if (Class636.method32689(arg0, this.anInterface13_11) < this.anInt4055 * -950684159) {
			return false;
		}
		@Pc(17) int local17;
		if (this.anIntArrayArray50 != null) {
			for (local17 = 0; local17 < this.anIntArrayArray50.length; local17++) {
				if (((Interface72) arg0).method11087(this.anIntArrayArray50[local17][0]) < this.anIntArrayArray50[local17][1]) {
					return false;
				}
			}
		}
		if (this.anIntArray427 != null) {
			for (local17 = 0; local17 < this.anIntArray427.length; local17++) {
				if (!((Class303) this.anInterface13_11.method18319(this.anIntArray427[local17])).method27169(arg0)) {
					return false;
				}
			}
		}
		@Pc(96) int local96;
		if (this.anIntArray424 != null) {
			for (local17 = 0; local17 < this.anIntArray424.length; local17++) {
				@Pc(91) Class75 local91 = ((Interface17) arg0).method27607(Class127.aClass127_63, this.anIntArray424[local17]);
				local96 = arg0.method35934(local91);
				if (local96 < this.anIntArray423[local17] || local96 > this.anIntArray426[local17]) {
					return false;
				}
			}
		}
		if (this.anIntArray428 != null) {
			for (local17 = 0; local17 < this.anIntArray428.length; local17++) {
				@Pc(131) Class343 local131 = ((Interface17) arg0).method27606(this.anIntArray428[local17]);
				local96 = arg0.method35935(local131);
				if (local96 < this.anIntArray429[local17] || local96 > this.anIntArray430[local17]) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!cu;)Z", line = 197)
	public boolean method27171(@OriginalArg(0) Interface19 arg0) {
		if (Class636.method32689(arg0, this.anInterface13_11) < this.anInt4055 * -950684159) {
			return false;
		}
		@Pc(17) int local17;
		if (this.anIntArrayArray50 != null) {
			for (local17 = 0; local17 < this.anIntArrayArray50.length; local17++) {
				if (((Interface72) arg0).method11087(this.anIntArrayArray50[local17][0]) < this.anIntArrayArray50[local17][1]) {
					return false;
				}
			}
		}
		if (this.anIntArray427 != null) {
			for (local17 = 0; local17 < this.anIntArray427.length; local17++) {
				if (!((Class303) this.anInterface13_11.method18319(this.anIntArray427[local17])).method27169(arg0)) {
					return false;
				}
			}
		}
		@Pc(96) int local96;
		if (this.anIntArray424 != null) {
			for (local17 = 0; local17 < this.anIntArray424.length; local17++) {
				@Pc(91) Class75 local91 = ((Interface17) arg0).method27607(Class127.aClass127_63, this.anIntArray424[local17]);
				local96 = arg0.method35934(local91);
				if (local96 < this.anIntArray423[local17] || local96 > this.anIntArray426[local17]) {
					return false;
				}
			}
		}
		if (this.anIntArray428 != null) {
			for (local17 = 0; local17 < this.anIntArray428.length; local17++) {
				@Pc(131) Class343 local131 = ((Interface17) arg0).method27606(this.anIntArray428[local17]);
				local96 = arg0.method35935(local131);
				if (local96 < this.anIntArray429[local17] || local96 > this.anIntArray430[local17]) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "(Lclient!cu;)Z", line = 197)
	public boolean method27172(@OriginalArg(0) Interface19 arg0) {
		if (Class636.method32689(arg0, this.anInterface13_11) < this.anInt4055 * -950684159) {
			return false;
		}
		@Pc(17) int local17;
		if (this.anIntArrayArray50 != null) {
			for (local17 = 0; local17 < this.anIntArrayArray50.length; local17++) {
				if (((Interface72) arg0).method11087(this.anIntArrayArray50[local17][0]) < this.anIntArrayArray50[local17][1]) {
					return false;
				}
			}
		}
		if (this.anIntArray427 != null) {
			for (local17 = 0; local17 < this.anIntArray427.length; local17++) {
				if (!((Class303) this.anInterface13_11.method18319(this.anIntArray427[local17])).method27169(arg0)) {
					return false;
				}
			}
		}
		@Pc(96) int local96;
		if (this.anIntArray424 != null) {
			for (local17 = 0; local17 < this.anIntArray424.length; local17++) {
				@Pc(91) Class75 local91 = ((Interface17) arg0).method27607(Class127.aClass127_63, this.anIntArray424[local17]);
				local96 = arg0.method35934(local91);
				if (local96 < this.anIntArray423[local17] || local96 > this.anIntArray426[local17]) {
					return false;
				}
			}
		}
		if (this.anIntArray428 != null) {
			for (local17 = 0; local17 < this.anIntArray428.length; local17++) {
				@Pc(131) Class343 local131 = ((Interface17) arg0).method27606(this.anIntArray428[local17]);
				local96 = arg0.method35935(local131);
				if (local96 < this.anIntArray429[local17] || local96 > this.anIntArray430[local17]) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "(Lclient!cu;)Z", line = 226)
	public boolean method27173(@OriginalArg(0) Interface19 arg0) {
		return Class636.method32689(arg0, this.anInterface13_11) >= this.anInt4055 * -950684159;
	}

	@OriginalMember(owner = "client!hm", name = "z", descriptor = "(Lclient!cu;I)Z", line = 226)
	public boolean method27174(@OriginalArg(0) Interface19 arg0) {
		return Class636.method32689(arg0, this.anInterface13_11) >= this.anInt4055 * -950684159;
	}

	@OriginalMember(owner = "client!hm", name = "ag", descriptor = "(Lclient!cu;I)Z", line = 231)
	public boolean method27175(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray50 == null || arg1 < 0 || arg1 >= this.anIntArrayArray50.length) {
			return false;
		} else {
			return ((Interface72) arg0).method11087(this.anIntArrayArray50[arg1][0]) >= this.anIntArrayArray50[arg1][1];
		}
	}

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "(Lclient!cu;IB)Z", line = 231)
	public boolean method27176(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray50 == null || arg1 < 0 || arg1 >= this.anIntArrayArray50.length) {
			return false;
		} else {
			return ((Interface72) arg0).method11087(this.anIntArrayArray50[arg1][0]) >= this.anIntArrayArray50[arg1][1];
		}
	}

	@OriginalMember(owner = "client!hm", name = "aj", descriptor = "(Lclient!cu;I)Z", line = 231)
	public boolean method27177(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray50 == null || arg1 < 0 || arg1 >= this.anIntArrayArray50.length) {
			return false;
		} else {
			return ((Interface72) arg0).method11087(this.anIntArrayArray50[arg1][0]) >= this.anIntArrayArray50[arg1][1];
		}
	}

	@OriginalMember(owner = "client!hm", name = "ai", descriptor = "(Lclient!cu;I)Z", line = 231)
	public boolean method27178(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray50 == null || arg1 < 0 || arg1 >= this.anIntArrayArray50.length) {
			return false;
		} else {
			return ((Interface72) arg0).method11087(this.anIntArrayArray50[arg1][0]) >= this.anIntArrayArray50[arg1][1];
		}
	}

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "(Lclient!cu;IB)Z", line = 237)
	public boolean method27179(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray427 == null || arg1 < 0 || arg1 >= this.anIntArray427.length) {
			return false;
		} else {
			return ((Class303) this.anInterface13_11.method18319(this.anIntArray427[arg1])).method27169(arg0);
		}
	}

	@OriginalMember(owner = "client!hm", name = "al", descriptor = "(Lclient!cu;I)Z", line = 237)
	public boolean method27180(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray427 == null || arg1 < 0 || arg1 >= this.anIntArray427.length) {
			return false;
		} else {
			return ((Class303) this.anInterface13_11.method18319(this.anIntArray427[arg1])).method27169(arg0);
		}
	}

	@OriginalMember(owner = "client!hm", name = "k", descriptor = "(Lclient!cu;II)Z", line = 243)
	public boolean method27181(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray424 == null || arg1 < 0 || arg1 >= this.anIntArray424.length) {
			return false;
		} else {
			@Pc(22) Class75 local22 = ((Interface17) arg0).method27607(Class127.aClass127_63, this.anIntArray424[arg1]);
			@Pc(27) int local27 = arg0.method35934(local22);
			return local27 >= this.anIntArray423[arg1] && local27 <= this.anIntArray426[arg1];
		}
	}

	@OriginalMember(owner = "client!hm", name = "ao", descriptor = "(Lclient!cu;I)Z", line = 243)
	public boolean method27182(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray424 == null || arg1 < 0 || arg1 >= this.anIntArray424.length) {
			return false;
		} else {
			@Pc(22) Class75 local22 = ((Interface17) arg0).method27607(Class127.aClass127_63, this.anIntArray424[arg1]);
			@Pc(27) int local27 = arg0.method35934(local22);
			return local27 >= this.anIntArray423[arg1] && local27 <= this.anIntArray426[arg1];
		}
	}

	@OriginalMember(owner = "client!hm", name = "au", descriptor = "(Lclient!cu;I)Z", line = 251)
	public boolean method27183(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray428 == null || arg1 < 0 || arg1 >= this.anIntArray428.length) {
			return false;
		} else {
			@Pc(21) Class343 local21 = ((Interface17) arg0).method27606(this.anIntArray428[arg1]);
			@Pc(26) int local26 = arg0.method35935(local21);
			return local26 >= this.anIntArray429[arg1] && local26 <= this.anIntArray430[arg1];
		}
	}

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "(Lclient!cu;IB)Z", line = 251)
	public boolean method27184(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray428 == null || arg1 < 0 || arg1 >= this.anIntArray428.length) {
			return false;
		} else {
			@Pc(21) Class343 local21 = ((Interface17) arg0).method27606(this.anIntArray428[arg1]);
			@Pc(26) int local26 = arg0.method35935(local21);
			return local26 >= this.anIntArray429[arg1] && local26 <= this.anIntArray430[arg1];
		}
	}

	@OriginalMember(owner = "client!hm", name = "ak", descriptor = "(Lclient!cu;I)Z", line = 251)
	public boolean method27185(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray428 == null || arg1 < 0 || arg1 >= this.anIntArray428.length) {
			return false;
		} else {
			@Pc(21) Class343 local21 = ((Interface17) arg0).method27606(this.anIntArray428[arg1]);
			@Pc(26) int local26 = arg0.method35935(local21);
			return local26 >= this.anIntArray429[arg1] && local26 <= this.anIntArray430[arg1];
		}
	}

	@OriginalMember(owner = "client!hm", name = "ax", descriptor = "(Lclient!cu;I)Z", line = 251)
	public boolean method27186(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray428 == null || arg1 < 0 || arg1 >= this.anIntArray428.length) {
			return false;
		} else {
			@Pc(21) Class343 local21 = ((Interface17) arg0).method27606(this.anIntArray428[arg1]);
			@Pc(26) int local26 = arg0.method35935(local21);
			return local26 >= this.anIntArray429[arg1] && local26 <= this.anIntArray430[arg1];
		}
	}

	@OriginalMember(owner = "client!hm", name = "ar", descriptor = "(Lclient!cu;Lclient!as;)I", line = 259)
	static int method27187(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface13 arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg1.method18318(); local3++) {
			@Pc(14) Class303 local14 = (Class303) arg1.method18319(local3);
			if (local14.method27169(arg0)) {
				local1 += local14.anInt4054 * -1628667329;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!hm", name = "ad", descriptor = "(Lclient!cu;Lclient!as;)I", line = 259)
	static int method27188(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface13 arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg1.method18318(); local3++) {
			@Pc(14) Class303 local14 = (Class303) arg1.method18319(local3);
			if (local14.method27169(arg0)) {
				local1 += local14.anInt4054 * -1628667329;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!hm", name = "ac", descriptor = "(Lclient!cu;Lclient!as;)I", line = 259)
	static int method27189(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface13 arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg1.method18318(); local3++) {
			@Pc(14) Class303 local14 = (Class303) arg1.method18319(local3);
			if (local14.method27169(arg0)) {
				local1 += local14.anInt4054 * -1628667329;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "(IB)V", line = 487)
	public static void method27190(@OriginalArg(0) int arg0) {
		Class595.anInt5507 = arg0 * 711542487;
		@Pc(6) Class232 local6 = Class628.aClass232_91;
		synchronized (Class628.aClass232_91) {
			Class628.aClass232_91.method25850();
		}
		local6 = Class628.aClass232_90;
		synchronized (Class628.aClass232_90) {
			Class628.aClass232_90.method25850();
		}
	}

	@OriginalMember(owner = "client!hm", name = "iy", descriptor = "(I)V", line = 5149)
	static final void method27191() {
		for (@Pc(4) Class131_Sub4 local4 = (Class131_Sub4) client.aClass703_6.method36532(); local4 != null; local4 = (Class131_Sub4) client.aClass703_6.method36532()) {
			Class470.method29597(local4);
		}
		@Pc(18) byte local18 = 0;
		@Pc(20) byte local20 = 3;
		@Pc(27) int local27;
		if (client.anInt3443 * -1468443459 == 3) {
			for (local27 = local18; local27 <= local20; local27++) {
				client.method25176(local27);
			}
			client.method25182();
			return;
		}
		client.method25164();
		for (local27 = local18; local27 <= local20; local27++) {
			client.method25169();
			client.method25175(local27);
			client.method25176(local27);
		}
		client.method25178();
		client.method25182();
	}

	@OriginalMember(owner = "client!hm", name = "kv", descriptor = "(IIILjava/lang/String;B)V", line = 10178)
	public static void method27192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3) {
		@Pc(4) Class277 local4 = Class60.method884(arg1, arg2);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray40 != null) {
			@Pc(14) Class77_Sub41 local14 = new Class77_Sub41();
			local14.aClass277_2 = local4;
			local14.anInt2003 = arg0 * -281580947;
			local14.aString57 = arg3;
			local14.anObjectArray4 = local4.anObjectArray40;
			Class72.method1019(local14);
		}
		if (!client.method25376(local4).method13646(arg0 - 1)) {
			return;
		}
		@Pc(44) Class82 local44 = Class230.method25826();
		if (client.anInt3390 * -1850530127 != 9 && client.anInt3390 * -1850530127 != 16 && client.anInt3390 * -1850530127 != 18) {
			return;
		}
		if (local4.aString177 == null || local4.aClass283_1 == null) {
			Class573.method31487(local44, local4, arg0, arg1, arg2);
			return;
		}
		@Pc(73) Class77_Sub20 local73 = Class365.method28132(Class414.aClass414_63, local44.aClass16_1);
		local73.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(local4.aString177) + 7 + 1);
		local73.aClass77_Sub39_Sub1_2.method22635(arg1);
		local73.aClass77_Sub39_Sub1_2.method22403(local4.aClass283_1.method36479());
		local73.aClass77_Sub39_Sub1_2.method22403(arg0);
		local73.aClass77_Sub39_Sub1_2.method22605(arg2);
		local73.aClass77_Sub39_Sub1_2.method22440(local4.aString177);
		local44.method2004(local73);
	}

	@OriginalMember(owner = "client!hm", name = "ajh", descriptor = "(Lclient!yf;I)V", line = 11075)
	static final void method27193(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local12 >= 1 && local12 <= 2) {
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub9_2, local12);
			Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub9_1, local12);
			Class667.method33150();
		}
	}

	@OriginalMember(owner = "client!hm", name = "ath", descriptor = "(Lclient!yf;I)V", line = 12870)
	static final void method27194(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		method27192(7, local13, local23, "");
	}
}
