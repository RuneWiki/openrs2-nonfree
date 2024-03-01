package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public class Class503 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Ljava/lang/String;")
	public String aString229;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Ljava/lang/String;")
	public String aString230;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "[[I")
	int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "Lclient!xn;")
	Class581 aClass581_38;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "[I")
	int[] anIntArray481;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "[I")
	int[] anIntArray482;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray19;

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
	public int anInt5251;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "[I")
	public int[] anIntArray483;

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "[[I")
	public int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
	public int anInt5252;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "[I")
	public int[] anIntArray484;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "[I")
	int[] anIntArray485;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "[I")
	int[] anIntArray486;

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "[I")
	public int[] anIntArray487;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray20;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "[I")
	int[] anIntArray488;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Lclient!ul;")
	Class505 aClass505_2;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "[[I")
	int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
	public int anInt5250 = 0;

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
	public int anInt5253 = 0;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "Z")
	public boolean aBoolean818 = false;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
	public int anInt5254 = -493027201;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V", line = 41)
	Class503() {
	}

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "(Lclient!ahb;I)V", line = 45)
	void method29464(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method29465(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "(Lclient!ahb;)V", line = 45)
	void method29501(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method29465(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ahb;II)V", line = 52)
	void method29465(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString229 = arg0.method20284();
		} else if (arg1 == 2) {
			this.aString230 = arg0.method20284();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method20269();
				this.anIntArrayArray59 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray59[local31][0] = arg0.method20271();
					this.anIntArrayArray59[local31][1] = arg0.method20275();
					this.anIntArrayArray59[local31][2] = arg0.method20275();
				}
			} else if (arg1 == 4) {
				local24 = arg0.method20269();
				this.anIntArrayArray61 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray61[local31][0] = arg0.method20271();
					this.anIntArrayArray61[local31][1] = arg0.method20275();
					this.anIntArrayArray61[local31][2] = arg0.method20275();
				}
			} else if (arg1 == 5) {
				arg0.method20271();
			} else if (arg1 == 6) {
				this.anInt5250 = arg0.method20269() * 1307559915;
			} else if (arg1 == 7) {
				this.anInt5253 = arg0.method20269() * -1974578915;
			} else if (arg1 == 8) {
				this.aBoolean818 = true;
			} else if (arg1 == 9) {
				this.anInt5251 = arg0.method20269() * -1542963589;
			} else if (arg1 == 10) {
				local24 = arg0.method20269();
				this.anIntArray481 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray481[local31] = arg0.method20275();
				}
			} else if (arg1 == 12) {
				arg0.method20275();
			} else if (arg1 == 13) {
				local24 = arg0.method20269();
				this.anIntArray483 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray483[local31] = arg0.method20271();
				}
			} else if (arg1 == 14) {
				local24 = arg0.method20269();
				this.anIntArrayArray60 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray60[local31][0] = arg0.method20269();
					this.anIntArrayArray60[local31][1] = arg0.method20269();
				}
			} else if (arg1 == 15) {
				this.anInt5252 = arg0.method20271() * 349760647;
			} else if (arg1 == 17) {
				this.anInt5254 = arg0.method20375() * 493027201;
			} else if (arg1 == 18) {
				local24 = arg0.method20269();
				this.anIntArray484 = new int[local24];
				this.anIntArray485 = new int[local24];
				this.anIntArray486 = new int[local24];
				this.aStringArray19 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray484[local31] = arg0.method20275();
					this.anIntArray485[local31] = arg0.method20275();
					this.anIntArray486[local31] = arg0.method20275();
					this.aStringArray19[local31] = arg0.method20283();
				}
			} else if (arg1 == 19) {
				local24 = arg0.method20269();
				this.anIntArray487 = new int[local24];
				this.anIntArray482 = new int[local24];
				this.anIntArray488 = new int[local24];
				this.aStringArray20 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray487[local31] = arg0.method20275();
					this.anIntArray482[local31] = arg0.method20275();
					this.anIntArray488[local31] = arg0.method20275();
					this.aStringArray20[local31] = arg0.method20283();
				}
			} else if (arg1 == 249) {
				local24 = arg0.method20269();
				if (this.aClass581_38 == null) {
					local31 = Class302.method25670(local24);
					this.aClass581_38 = new Class581(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method20269() == 1;
					@Pc(436) int local436 = arg0.method20273();
					@Pc(445) Class3 local445;
					if (local432) {
						local445 = new Class3_Sub29(arg0.method20283());
					} else {
						local445 = new Class3_Sub21(arg0.method20275());
					}
					this.aClass581_38.method33241(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "(Lclient!ahb;I)V", line = 52)
	void method29489(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString229 = arg0.method20284();
		} else if (arg1 == 2) {
			this.aString230 = arg0.method20284();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method20269();
				this.anIntArrayArray59 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray59[local31][0] = arg0.method20271();
					this.anIntArrayArray59[local31][1] = arg0.method20275();
					this.anIntArrayArray59[local31][2] = arg0.method20275();
				}
			} else if (arg1 == 4) {
				local24 = arg0.method20269();
				this.anIntArrayArray61 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray61[local31][0] = arg0.method20271();
					this.anIntArrayArray61[local31][1] = arg0.method20275();
					this.anIntArrayArray61[local31][2] = arg0.method20275();
				}
			} else if (arg1 == 5) {
				arg0.method20271();
			} else if (arg1 == 6) {
				this.anInt5250 = arg0.method20269() * 1307559915;
			} else if (arg1 == 7) {
				this.anInt5253 = arg0.method20269() * -1974578915;
			} else if (arg1 == 8) {
				this.aBoolean818 = true;
			} else if (arg1 == 9) {
				this.anInt5251 = arg0.method20269() * -1542963589;
			} else if (arg1 == 10) {
				local24 = arg0.method20269();
				this.anIntArray481 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray481[local31] = arg0.method20275();
				}
			} else if (arg1 == 12) {
				arg0.method20275();
			} else if (arg1 == 13) {
				local24 = arg0.method20269();
				this.anIntArray483 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray483[local31] = arg0.method20271();
				}
			} else if (arg1 == 14) {
				local24 = arg0.method20269();
				this.anIntArrayArray60 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray60[local31][0] = arg0.method20269();
					this.anIntArrayArray60[local31][1] = arg0.method20269();
				}
			} else if (arg1 == 15) {
				this.anInt5252 = arg0.method20271() * 349760647;
			} else if (arg1 == 17) {
				this.anInt5254 = arg0.method20375() * 493027201;
			} else if (arg1 == 18) {
				local24 = arg0.method20269();
				this.anIntArray484 = new int[local24];
				this.anIntArray485 = new int[local24];
				this.anIntArray486 = new int[local24];
				this.aStringArray19 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray484[local31] = arg0.method20275();
					this.anIntArray485[local31] = arg0.method20275();
					this.anIntArray486[local31] = arg0.method20275();
					this.aStringArray19[local31] = arg0.method20283();
				}
			} else if (arg1 == 19) {
				local24 = arg0.method20269();
				this.anIntArray487 = new int[local24];
				this.anIntArray482 = new int[local24];
				this.anIntArray488 = new int[local24];
				this.aStringArray20 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray487[local31] = arg0.method20275();
					this.anIntArray482[local31] = arg0.method20275();
					this.anIntArray488[local31] = arg0.method20275();
					this.aStringArray20[local31] = arg0.method20283();
				}
			} else if (arg1 == 249) {
				local24 = arg0.method20269();
				if (this.aClass581_38 == null) {
					local31 = Class302.method25670(local24);
					this.aClass581_38 = new Class581(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method20269() == 1;
					@Pc(436) int local436 = arg0.method20273();
					@Pc(445) Class3 local445;
					if (local432) {
						local445 = new Class3_Sub29(arg0.method20283());
					} else {
						local445 = new Class3_Sub21(arg0.method20275());
					}
					this.aClass581_38.method33241(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "()V", line = 147)
	void method29463() {
		if (this.aString230 == null) {
			this.aString230 = this.aString229;
		}
	}

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "(B)V", line = 147)
	void method29466() {
		if (this.aString230 == null) {
			this.aString230 = this.aString229;
		}
	}

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "()V", line = 147)
	void method29479() {
		if (this.aString230 == null) {
			this.aString230 = this.aString229;
		}
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "()V", line = 147)
	void method29480() {
		if (this.aString230 == null) {
			this.aString230 = this.aString229;
		}
	}

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "()V", line = 147)
	void method29481() {
		if (this.aString230 == null) {
			this.aString230 = this.aString229;
		}
	}

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "(III)I", line = 151)
	public int method29467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_38 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub21 local11 = (Class3_Sub21) this.aClass581_38.method33217((long) arg0);
			return local11 == null ? arg1 : local11.anInt1285 * 1585682181;
		}
	}

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "(II)I", line = 151)
	public int method29470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_38 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub21 local11 = (Class3_Sub21) this.aClass581_38.method33217((long) arg0);
			return local11 == null ? arg1 : local11.anInt1285 * 1585682181;
		}
	}

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "(II)I", line = 151)
	public int method29484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass581_38 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub21 local11 = (Class3_Sub21) this.aClass581_38.method33217((long) arg0);
			return local11 == null ? arg1 : local11.anInt1285 * 1585682181;
		}
	}

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 158)
	public String method29468(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass581_38 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub29 local11 = (Class3_Sub29) this.aClass581_38.method33217((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject2;
		}
	}

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 158)
	public String method29485(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass581_38 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub29 local11 = (Class3_Sub29) this.aClass581_38.method33217((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject2;
		}
	}

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 158)
	public String method29487(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass581_38 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub29 local11 = (Class3_Sub29) this.aClass581_38.method33217((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject2;
		}
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 158)
	public String method29488(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass581_38 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub29 local11 = (Class3_Sub29) this.aClass581_38.method33217((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject2;
		}
	}

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 158)
	public String method29498(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass581_38 == null) {
			return arg1;
		} else {
			@Pc(11) Class3_Sub29 local11 = (Class3_Sub29) this.aClass581_38.method33217((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject2;
		}
	}

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "(Lclient!wd;I)V", line = 162)
	static void method29508(@OriginalArg(0) Class547 arg0) {
		Class415.aClass547_1 = arg0;
		Class603.aString246 = null;
	}

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "(Lclient!ct;I)Z", line = 165)
	public boolean method29469(@OriginalArg(0) Interface8 arg0) {
		@Pc(5) int local5;
		if (this.anIntArrayArray59 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray59.length; local5++) {
				@Pc(22) Class11 local22 = ((Interface9) arg0).method24295(Class43.aClass43_68, this.anIntArrayArray59[local5][0]);
				if (arg0.method32385(local22) >= this.anIntArrayArray59[local5][1]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray61 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray61.length; local5++) {
				@Pc(58) Class290 local58 = ((Interface9) arg0).method24296(this.anIntArrayArray61[local5][0]);
				if (arg0.method32384(local58) >= this.anIntArrayArray61[local5][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "(Lclient!ct;)Z", line = 165)
	public boolean method29477(@OriginalArg(0) Interface8 arg0) {
		@Pc(5) int local5;
		if (this.anIntArrayArray59 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray59.length; local5++) {
				@Pc(22) Class11 local22 = ((Interface9) arg0).method24295(Class43.aClass43_68, this.anIntArrayArray59[local5][0]);
				if (arg0.method32385(local22) >= this.anIntArrayArray59[local5][1]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray61 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray61.length; local5++) {
				@Pc(58) Class290 local58 = ((Interface9) arg0).method24296(this.anIntArrayArray61[local5][0]);
				if (arg0.method32384(local58) >= this.anIntArrayArray61[local5][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ui", name = "af", descriptor = "(Lclient!ct;)Z", line = 165)
	public boolean method29478(@OriginalArg(0) Interface8 arg0) {
		@Pc(5) int local5;
		if (this.anIntArrayArray59 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray59.length; local5++) {
				@Pc(22) Class11 local22 = ((Interface9) arg0).method24295(Class43.aClass43_68, this.anIntArrayArray59[local5][0]);
				if (arg0.method32385(local22) >= this.anIntArrayArray59[local5][1]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray61 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray61.length; local5++) {
				@Pc(58) Class290 local58 = ((Interface9) arg0).method24296(this.anIntArrayArray61[local5][0]);
				if (arg0.method32384(local58) >= this.anIntArrayArray61[local5][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ui", name = "at", descriptor = "(Lclient!ct;)Z", line = 165)
	public boolean method29483(@OriginalArg(0) Interface8 arg0) {
		@Pc(5) int local5;
		if (this.anIntArrayArray59 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray59.length; local5++) {
				@Pc(22) Class11 local22 = ((Interface9) arg0).method24295(Class43.aClass43_68, this.anIntArrayArray59[local5][0]);
				if (arg0.method32385(local22) >= this.anIntArrayArray59[local5][1]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray61 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray61.length; local5++) {
				@Pc(58) Class290 local58 = ((Interface9) arg0).method24296(this.anIntArrayArray61[local5][0]);
				if (arg0.method32384(local58) >= this.anIntArrayArray61[local5][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ui", name = "ak", descriptor = "(Lclient!ct;)Z", line = 165)
	public boolean method29492(@OriginalArg(0) Interface8 arg0) {
		@Pc(5) int local5;
		if (this.anIntArrayArray59 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray59.length; local5++) {
				@Pc(22) Class11 local22 = ((Interface9) arg0).method24295(Class43.aClass43_68, this.anIntArrayArray59[local5][0]);
				if (arg0.method32385(local22) >= this.anIntArrayArray59[local5][1]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray61 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray61.length; local5++) {
				@Pc(58) Class290 local58 = ((Interface9) arg0).method24296(this.anIntArrayArray61[local5][0]);
				if (arg0.method32384(local58) >= this.anIntArrayArray61[local5][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ui", name = "s", descriptor = "(Lclient!ct;B)Z", line = 181)
	public boolean method29473(@OriginalArg(0) Interface8 arg0) {
		@Pc(4) int local4;
		if (this.anIntArrayArray59 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray59.length; local4++) {
				@Pc(21) Class11 local21 = ((Interface9) arg0).method24295(Class43.aClass43_68, this.anIntArrayArray59[local4][0]);
				if (arg0.method32385(local21) >= this.anIntArrayArray59[local4][2]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray61 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray61.length; local4++) {
				@Pc(57) Class290 local57 = ((Interface9) arg0).method24296(this.anIntArrayArray61[local4][0]);
				if (arg0.method32384(local57) >= this.anIntArrayArray61[local4][2]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "(Lclient!ct;B)Z", line = 197)
	public boolean method29482(@OriginalArg(0) Interface8 arg0) {
		if (this.aClass505_2.method29514(arg0) < this.anInt5252 * -162260681) {
			return false;
		}
		@Pc(16) int local16;
		if (this.anIntArrayArray60 != null) {
			for (local16 = 0; local16 < this.anIntArrayArray60.length; local16++) {
				if (((Interface53) arg0).method23321(this.anIntArrayArray60[local16][0]) < this.anIntArrayArray60[local16][1]) {
					return false;
				}
			}
		}
		if (this.anIntArray483 != null) {
			for (local16 = 0; local16 < this.anIntArray483.length; local16++) {
				if (!this.aClass505_2.method29516(this.anIntArray483[local16]).method29473(arg0)) {
					return false;
				}
			}
		}
		@Pc(95) int local95;
		if (this.anIntArray484 != null) {
			for (local16 = 0; local16 < this.anIntArray484.length; local16++) {
				@Pc(90) Class11 local90 = ((Interface9) arg0).method24295(Class43.aClass43_68, this.anIntArray484[local16]);
				local95 = arg0.method32385(local90);
				if (local95 < this.anIntArray485[local16] || local95 > this.anIntArray486[local16]) {
					return false;
				}
			}
		}
		if (this.anIntArray487 != null) {
			for (local16 = 0; local16 < this.anIntArray487.length; local16++) {
				@Pc(131) Class290 local131 = ((Interface9) arg0).method24296(this.anIntArray487[local16]);
				local95 = arg0.method32384(local131);
				if (local95 < this.anIntArray482[local16] || local95 > this.anIntArray488[local16]) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "(Lclient!ct;I)Z", line = 226)
	public boolean method29472(@OriginalArg(0) Interface8 arg0) {
		return this.aClass505_2.method29514(arg0) >= this.anInt5252 * -162260681;
	}

	@OriginalMember(owner = "client!ui", name = "aa", descriptor = "(Lclient!ct;I)Z", line = 231)
	public boolean method29471(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray60 == null || arg1 < 0 || arg1 >= this.anIntArrayArray60.length) {
			return false;
		} else {
			return ((Interface53) arg0).method23321(this.anIntArrayArray60[arg1][0]) >= this.anIntArrayArray60[arg1][1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(Lclient!ct;II)Z", line = 231)
	public boolean method29493(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray60 == null || arg1 < 0 || arg1 >= this.anIntArrayArray60.length) {
			return false;
		} else {
			return ((Interface53) arg0).method23321(this.anIntArrayArray60[arg1][0]) >= this.anIntArrayArray60[arg1][1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "ah", descriptor = "(Lclient!ct;I)Z", line = 231)
	public boolean method29494(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray60 == null || arg1 < 0 || arg1 >= this.anIntArrayArray60.length) {
			return false;
		} else {
			return ((Interface53) arg0).method23321(this.anIntArrayArray60[arg1][0]) >= this.anIntArrayArray60[arg1][1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(Lclient!ct;II)Z", line = 237)
	public boolean method29474(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray483 == null || arg1 < 0 || arg1 >= this.anIntArray483.length) {
			return false;
		} else {
			return this.aClass505_2.method29516(this.anIntArray483[arg1]).method29473(arg0);
		}
	}

	@OriginalMember(owner = "client!ui", name = "an", descriptor = "(Lclient!ct;I)Z", line = 237)
	public boolean method29495(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray483 == null || arg1 < 0 || arg1 >= this.anIntArray483.length) {
			return false;
		} else {
			return this.aClass505_2.method29516(this.anIntArray483[arg1]).method29473(arg0);
		}
	}

	@OriginalMember(owner = "client!ui", name = "aj", descriptor = "(Lclient!ct;I)Z", line = 237)
	public boolean method29496(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray483 == null || arg1 < 0 || arg1 >= this.anIntArray483.length) {
			return false;
		} else {
			return this.aClass505_2.method29516(this.anIntArray483[arg1]).method29473(arg0);
		}
	}

	@OriginalMember(owner = "client!ui", name = "as", descriptor = "(Lclient!ct;I)Z", line = 237)
	public boolean method29497(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray483 == null || arg1 < 0 || arg1 >= this.anIntArray483.length) {
			return false;
		} else {
			return this.aClass505_2.method29516(this.anIntArray483[arg1]).method29473(arg0);
		}
	}

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "(Lclient!ct;IB)Z", line = 243)
	public boolean method29475(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray484 == null || arg1 < 0 || arg1 >= this.anIntArray484.length) {
			return false;
		} else {
			@Pc(21) Class11 local21 = ((Interface9) arg0).method24295(Class43.aClass43_68, this.anIntArray484[arg1]);
			@Pc(26) int local26 = arg0.method32385(local21);
			return local26 >= this.anIntArray485[arg1] && local26 <= this.anIntArray486[arg1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "aq", descriptor = "(Lclient!ct;I)Z", line = 243)
	public boolean method29499(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray484 == null || arg1 < 0 || arg1 >= this.anIntArray484.length) {
			return false;
		} else {
			@Pc(21) Class11 local21 = ((Interface9) arg0).method24295(Class43.aClass43_68, this.anIntArray484[arg1]);
			@Pc(26) int local26 = arg0.method32385(local21);
			return local26 >= this.anIntArray485[arg1] && local26 <= this.anIntArray486[arg1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "av", descriptor = "(Lclient!ct;I)Z", line = 243)
	public boolean method29500(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray484 == null || arg1 < 0 || arg1 >= this.anIntArray484.length) {
			return false;
		} else {
			@Pc(21) Class11 local21 = ((Interface9) arg0).method24295(Class43.aClass43_68, this.anIntArray484[arg1]);
			@Pc(26) int local26 = arg0.method32385(local21);
			return local26 >= this.anIntArray485[arg1] && local26 <= this.anIntArray486[arg1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "ai", descriptor = "(Lclient!ct;I)Z", line = 243)
	public boolean method29502(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray484 == null || arg1 < 0 || arg1 >= this.anIntArray484.length) {
			return false;
		} else {
			@Pc(21) Class11 local21 = ((Interface9) arg0).method24295(Class43.aClass43_68, this.anIntArray484[arg1]);
			@Pc(26) int local26 = arg0.method32385(local21);
			return local26 >= this.anIntArray485[arg1] && local26 <= this.anIntArray486[arg1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "az", descriptor = "(Lclient!ct;I)Z", line = 251)
	public boolean method29476(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray487 == null || arg1 < 0 || arg1 >= this.anIntArray487.length) {
			return false;
		} else {
			@Pc(21) Class290 local21 = ((Interface9) arg0).method24296(this.anIntArray487[arg1]);
			@Pc(26) int local26 = arg0.method32384(local21);
			return local26 >= this.anIntArray482[arg1] && local26 <= this.anIntArray488[arg1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "(Lclient!ct;II)Z", line = 251)
	public boolean method29486(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray487 == null || arg1 < 0 || arg1 >= this.anIntArray487.length) {
			return false;
		} else {
			@Pc(21) Class290 local21 = ((Interface9) arg0).method24296(this.anIntArray487[arg1]);
			@Pc(26) int local26 = arg0.method32384(local21);
			return local26 >= this.anIntArray482[arg1] && local26 <= this.anIntArray488[arg1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "ap", descriptor = "(Lclient!ct;I)Z", line = 251)
	public boolean method29490(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray487 == null || arg1 < 0 || arg1 >= this.anIntArray487.length) {
			return false;
		} else {
			@Pc(21) Class290 local21 = ((Interface9) arg0).method24296(this.anIntArray487[arg1]);
			@Pc(26) int local26 = arg0.method32384(local21);
			return local26 >= this.anIntArray482[arg1] && local26 <= this.anIntArray488[arg1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "ax", descriptor = "(Lclient!ct;I)Z", line = 251)
	public boolean method29491(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray487 == null || arg1 < 0 || arg1 >= this.anIntArray487.length) {
			return false;
		} else {
			@Pc(21) Class290 local21 = ((Interface9) arg0).method24296(this.anIntArray487[arg1]);
			@Pc(26) int local26 = arg0.method32384(local21);
			return local26 >= this.anIntArray482[arg1] && local26 <= this.anIntArray488[arg1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "al", descriptor = "(Lclient!ct;I)Z", line = 251)
	public boolean method29503(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray487 == null || arg1 < 0 || arg1 >= this.anIntArray487.length) {
			return false;
		} else {
			@Pc(21) Class290 local21 = ((Interface9) arg0).method24296(this.anIntArray487[arg1]);
			@Pc(26) int local26 = arg0.method32384(local21);
			return local26 >= this.anIntArray482[arg1] && local26 <= this.anIntArray488[arg1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "ao", descriptor = "(Lclient!ct;I)Z", line = 251)
	public boolean method29504(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray487 == null || arg1 < 0 || arg1 >= this.anIntArray487.length) {
			return false;
		} else {
			@Pc(21) Class290 local21 = ((Interface9) arg0).method24296(this.anIntArray487[arg1]);
			@Pc(26) int local26 = arg0.method32384(local21);
			return local26 >= this.anIntArray482[arg1] && local26 <= this.anIntArray488[arg1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "ab", descriptor = "(Lclient!ct;I)Z", line = 251)
	public boolean method29505(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray487 == null || arg1 < 0 || arg1 >= this.anIntArray487.length) {
			return false;
		} else {
			@Pc(21) Class290 local21 = ((Interface9) arg0).method24296(this.anIntArray487[arg1]);
			@Pc(26) int local26 = arg0.method32384(local21);
			return local26 >= this.anIntArray482[arg1] && local26 <= this.anIntArray488[arg1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "au", descriptor = "(Lclient!ct;I)Z", line = 251)
	public boolean method29506(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray487 == null || arg1 < 0 || arg1 >= this.anIntArray487.length) {
			return false;
		} else {
			@Pc(21) Class290 local21 = ((Interface9) arg0).method24296(this.anIntArray487[arg1]);
			@Pc(26) int local26 = arg0.method32384(local21);
			return local26 >= this.anIntArray482[arg1] && local26 <= this.anIntArray488[arg1];
		}
	}

	@OriginalMember(owner = "client!ui", name = "df", descriptor = "(Lclient!vs;I)V", line = 4581)
	static final void method29507(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class359.method26760(local16, local22, arg0);
	}
}
