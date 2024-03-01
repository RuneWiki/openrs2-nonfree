package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public class Class478 {

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "[Z")
	static boolean[] aBooleanArray34 = new boolean[64];

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "[Z")
	static boolean[] aBooleanArray33 = new boolean[16];

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "J")
	long aLong277;

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "J")
	long aLong278;

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
	int anInt5142;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Z")
	public boolean aBoolean794 = false;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Z")
	boolean aBoolean797 = false;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
	int anInt5140 = 0;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "Ljava/util/List;")
	List aList18 = new LinkedList();

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
	int anInt5141 = 0;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "Ljava/util/List;")
	List aList17 = new LinkedList();

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
	int anInt5139 = 0;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Z")
	boolean aBoolean795 = false;

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "Z")
	boolean aBoolean796 = false;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "Lclient!dk;")
	Class128 aClass128_1 = new Class128();

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "[Lclient!aob;")
	Class53_Sub1_Sub1_Sub1[] aClass53_Sub1_Sub1_Sub1Array1 = new Class53_Sub1_Sub1_Sub1[8192];

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "(IZ)Lclient!tf;", line = 29)
	public static Class478 method28844(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Class482.anInt5154 * -40012635 == Class482.anInt5156 * 2063362959) {
			return new Class478(arg0, arg1);
		} else {
			@Pc(12) Class478 local12 = Class482.aClass478Array1[Class482.anInt5156 * 2063362959];
			Class482.anInt5156 = (Class482.anInt5156 * 2063362959 + 1 & Class126.anIntArray324[Class482.anInt5158 * 1631733361]) * 275927919;
			local12.method28847(arg0, arg1);
			return local12;
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(IZ)Lclient!tf;", line = 29)
	public static Class478 method28845(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Class482.anInt5154 * -40012635 == Class482.anInt5156 * 2063362959) {
			return new Class478(arg0, arg1);
		} else {
			@Pc(12) Class478 local12 = Class482.aClass478Array1[Class482.anInt5156 * 2063362959];
			Class482.anInt5156 = (Class482.anInt5156 * 2063362959 + 1 & Class126.anIntArray324[Class482.anInt5158 * 1631733361]) * 275927919;
			local12.method28847(arg0, arg1);
			return local12;
		}
	}

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "(IZ)Lclient!tf;", line = 29)
	public static Class478 method28854(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (Class482.anInt5154 * -40012635 == Class482.anInt5156 * 2063362959) {
			return new Class478(arg0, arg1);
		} else {
			@Pc(12) Class478 local12 = Class482.aClass478Array1[Class482.anInt5156 * 2063362959];
			Class482.anInt5156 = (Class482.anInt5156 * 2063362959 + 1 & Class126.anIntArray324[Class482.anInt5158 * 1631733361]) * 275927919;
			local12.method28847(arg0, arg1);
			return local12;
		}
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(IZ)V", line = 38)
	Class478(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method28847(arg0, arg1);
	}

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "(IZ)V", line = 44)
	void method28837(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Class482.aList19.add(this);
		this.aLong278 = arg0;
		this.aLong277 = arg0;
		this.aBoolean795 = true;
		this.aBoolean796 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)V", line = 44)
	void method28847(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Class482.aList19.add(this);
		this.aLong278 = arg0;
		this.aLong277 = arg0;
		this.aBoolean795 = true;
		this.aBoolean796 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "(IZ)V", line = 44)
	void method28862(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		Class482.aList19.add(this);
		this.aLong278 = arg0;
		this.aLong277 = arg0;
		this.aBoolean795 = true;
		this.aBoolean796 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "()V", line = 52)
	public void method28833() {
		this.aBoolean795 = true;
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "()V", line = 52)
	public void method28855() {
		this.aBoolean795 = true;
	}

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "()V", line = 56)
	void method28832() {
		this.aBoolean794 = true;
		@Pc(6) Iterator local6 = this.aList17.iterator();
		while (local6.hasNext()) {
			@Pc(13) Class3_Sub27 local13 = (Class3_Sub27) local6.next();
			if (local13.aClass273_1.anInt4308 * -1790153647 == 1) {
				local13.method33656();
			}
		}
		for (@Pc(26) int local26 = 0; local26 < this.aClass53_Sub1_Sub1_Sub1Array1.length; local26++) {
			if (this.aClass53_Sub1_Sub1_Sub1Array1[local26] != null) {
				this.aClass53_Sub1_Sub1_Sub1Array1[local26].method20627();
				this.aClass53_Sub1_Sub1_Sub1Array1[local26] = null;
			}
		}
		this.anInt5140 = 0;
		this.aList18 = new LinkedList();
		this.anInt5141 = 0;
		this.aList17 = new LinkedList();
		this.anInt5139 = 0;
	}

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "()V", line = 56)
	void method28849() {
		this.aBoolean794 = true;
		@Pc(6) Iterator local6 = this.aList17.iterator();
		while (local6.hasNext()) {
			@Pc(13) Class3_Sub27 local13 = (Class3_Sub27) local6.next();
			if (local13.aClass273_1.anInt4308 * -1790153647 == 1) {
				local13.method33656();
			}
		}
		for (@Pc(26) int local26 = 0; local26 < this.aClass53_Sub1_Sub1_Sub1Array1.length; local26++) {
			if (this.aClass53_Sub1_Sub1_Sub1Array1[local26] != null) {
				this.aClass53_Sub1_Sub1_Sub1Array1[local26].method20627();
				this.aClass53_Sub1_Sub1_Sub1Array1[local26] = null;
			}
		}
		this.anInt5140 = 0;
		this.aList18 = new LinkedList();
		this.anInt5141 = 0;
		this.aList17 = new LinkedList();
		this.anInt5139 = 0;
	}

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "()V", line = 56)
	void method28850() {
		this.aBoolean794 = true;
		@Pc(6) Iterator local6 = this.aList17.iterator();
		while (local6.hasNext()) {
			@Pc(13) Class3_Sub27 local13 = (Class3_Sub27) local6.next();
			if (local13.aClass273_1.anInt4308 * -1790153647 == 1) {
				local13.method33656();
			}
		}
		for (@Pc(26) int local26 = 0; local26 < this.aClass53_Sub1_Sub1_Sub1Array1.length; local26++) {
			if (this.aClass53_Sub1_Sub1_Sub1Array1[local26] != null) {
				this.aClass53_Sub1_Sub1_Sub1Array1[local26].method20627();
				this.aClass53_Sub1_Sub1_Sub1Array1[local26] = null;
			}
		}
		this.anInt5140 = 0;
		this.aList18 = new LinkedList();
		this.anInt5141 = 0;
		this.aList17 = new LinkedList();
		this.anInt5139 = 0;
	}

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "()V", line = 56)
	void method28859() {
		this.aBoolean794 = true;
		@Pc(6) Iterator local6 = this.aList17.iterator();
		while (local6.hasNext()) {
			@Pc(13) Class3_Sub27 local13 = (Class3_Sub27) local6.next();
			if (local13.aClass273_1.anInt4308 * -1790153647 == 1) {
				local13.method33656();
			}
		}
		for (@Pc(26) int local26 = 0; local26 < this.aClass53_Sub1_Sub1_Sub1Array1.length; local26++) {
			if (this.aClass53_Sub1_Sub1_Sub1Array1[local26] != null) {
				this.aClass53_Sub1_Sub1_Sub1Array1[local26].method20627();
				this.aClass53_Sub1_Sub1_Sub1Array1[local26] = null;
			}
		}
		this.anInt5140 = 0;
		this.aList18 = new LinkedList();
		this.anInt5141 = 0;
		this.aList17 = new LinkedList();
		this.anInt5139 = 0;
	}

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "()V", line = 77)
	public void method28829() {
		this.aBoolean797 = true;
	}

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "()V", line = 77)
	public void method28852() {
		this.aBoolean797 = true;
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "()V", line = 77)
	public void method28853() {
		this.aBoolean797 = true;
	}

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "()V", line = 81)
	void method28834() {
		this.aBoolean797 = false;
	}

	@OriginalMember(owner = "client!tf", name = "ak", descriptor = "()V", line = 81)
	void method28841() {
		this.aBoolean797 = false;
	}

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "()V", line = 81)
	void method28846() {
		this.aBoolean797 = false;
	}

	@OriginalMember(owner = "client!tf", name = "at", descriptor = "()V", line = 81)
	void method28848() {
		this.aBoolean797 = false;
	}

	@OriginalMember(owner = "client!tf", name = "af", descriptor = "()V", line = 81)
	void method28856() {
		this.aBoolean797 = false;
	}

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "(Lclient!de;J)Z", line = 85)
	boolean method28835(@OriginalArg(0) Class21 arg0, @OriginalArg(1) long arg1) {
		if (this.aLong278 == this.aLong277) {
			this.method28834();
		} else {
			this.method28829();
		}
		if (arg1 - this.aLong278 > 750L) {
			this.method28832();
			return false;
		}
		@Pc(27) int local27 = (int) (arg1 - this.aLong277);
		@Pc(34) Iterator local34;
		@Pc(41) Class491 local41;
		if (this.aBoolean795) {
			local34 = this.aList18.iterator();
			while (local34.hasNext()) {
				local41 = (Class491) local34.next();
				for (@Pc(43) int local43 = 0; local43 < local41.aClass271_1.anInt4260 * -1452280681; local43++) {
					local41.method29251(arg0, arg1, 1, !this.aBoolean797);
				}
			}
			this.aBoolean795 = false;
		}
		local34 = this.aList18.iterator();
		while (local34.hasNext()) {
			local41 = (Class491) local34.next();
			local41.method29251(arg0, arg1, local27, !this.aBoolean797);
		}
		this.aLong277 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "(J)V", line = 114)
	public void method28836(@OriginalArg(0) long arg0) {
		this.aLong278 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "aa", descriptor = "(J)V", line = 114)
	public void method28858(@OriginalArg(0) long arg0) {
		this.aLong278 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "ah", descriptor = "(Lclient!de;J[Lclient!dt;[Lclient!cd;Z)V", line = 118)
	public void method28838(@OriginalArg(0) Class21 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class135[] arg2, @OriginalArg(3) Class109[] arg3, @OriginalArg(4) boolean arg4) {
		if (!this.aBoolean794) {
			this.method28830(arg0, arg2, arg4);
			this.method28839(arg3, arg4);
			this.aLong278 = arg1;
		}
	}

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "(Lclient!de;J[Lclient!dt;[Lclient!cd;Z)V", line = 118)
	public void method28857(@OriginalArg(0) Class21 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class135[] arg2, @OriginalArg(3) Class109[] arg3, @OriginalArg(4) boolean arg4) {
		if (!this.aBoolean794) {
			this.method28830(arg0, arg2, arg4);
			this.method28839(arg3, arg4);
			this.aLong278 = arg1;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Lclient!de;[Lclient!dt;Z)V", line = 125)
	void method28830(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class135[] arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < 64; local1++) {
			aBooleanArray34[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList18.iterator();
		while (true) {
			label61: while (local14.hasNext()) {
				@Pc(21) Class491 local21 = (Class491) local14.next();
				if (arg1 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg1.length; local25++) {
						if (local21.aClass135_2 == arg1[local25] || local21.aClass135_2 == arg1[local25].aClass135_1) {
							aBooleanArray34[local25] = true;
							local21.method29247();
							local21.aBoolean807 = false;
							continue label61;
						}
					}
				}
				if (!arg2) {
					if (local21.anInt5205 * -1516162493 == 0) {
						local14.remove();
						this.anInt5141--;
					} else {
						local21.aBoolean807 = true;
					}
				}
			}
			if (arg1 != null) {
				for (@Pc(79) int local79 = 0; local79 < arg1.length && local79 != 64 && this.anInt5141 != 64; local79++) {
					if (!aBooleanArray34[local79]) {
						@Pc(107) Class491 local107 = new Class491(arg0, arg1[local79], this, this.aLong278);
						this.aList18.add(local107);
						this.anInt5141++;
						aBooleanArray34[local79] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tf", name = "an", descriptor = "(Lclient!de;[Lclient!dt;Z)V", line = 125)
	void method28860(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class135[] arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < 64; local1++) {
			aBooleanArray34[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList18.iterator();
		while (true) {
			label61: while (local14.hasNext()) {
				@Pc(21) Class491 local21 = (Class491) local14.next();
				if (arg1 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg1.length; local25++) {
						if (local21.aClass135_2 == arg1[local25] || local21.aClass135_2 == arg1[local25].aClass135_1) {
							aBooleanArray34[local25] = true;
							local21.method29247();
							local21.aBoolean807 = false;
							continue label61;
						}
					}
				}
				if (!arg2) {
					if (local21.anInt5205 * -1516162493 == 0) {
						local14.remove();
						this.anInt5141--;
					} else {
						local21.aBoolean807 = true;
					}
				}
			}
			if (arg1 != null) {
				for (@Pc(79) int local79 = 0; local79 < arg1.length && local79 != 64 && this.anInt5141 != 64; local79++) {
					if (!aBooleanArray34[local79]) {
						@Pc(107) Class491 local107 = new Class491(arg0, arg1[local79], this, this.aLong278);
						this.aList18.add(local107);
						this.anInt5141++;
						aBooleanArray34[local79] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "([Lclient!cd;Z)V", line = 162)
	void method28839(@OriginalArg(0) Class109[] arg0, @OriginalArg(1) boolean arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 16; local1++) {
			aBooleanArray33[local1] = false;
		}
		@Pc(14) Iterator local14 = this.aList17.iterator();
		while (true) {
			@Pc(21) Class3_Sub27 local21;
			label70: while (local14.hasNext()) {
				local21 = (Class3_Sub27) local14.next();
				if (arg0 != null) {
					for (@Pc(25) int local25 = 0; local25 < arg0.length; local25++) {
						if (local21.aClass109_1 == arg0[local25] || local21.aClass109_1 == arg0[local25].aClass109_2) {
							aBooleanArray33[local25] = true;
							local21.method11550();
							continue label70;
						}
					}
				}
				if (!arg1) {
					local21.method33656();
					this.anInt5139--;
					if (local21.method33657()) {
						local21.method33656();
						Class482.anInt5157 -= 60005913;
					}
				}
			}
			if (arg0 != null) {
				for (local1 = 0; local1 < arg0.length && local1 != 16 && this.anInt5139 != 16; local1++) {
					if (!aBooleanArray33[local1]) {
						local21 = null;
						if (arg0[local1].method21944().anInt4308 * -1790153647 == 1 && Class482.anInt5157 * 1083366953 < 32) {
							local21 = new Class3_Sub27(arg0[local1], this);
							Class482.aClass581_37.method33241(local21, (long) (arg0[local1].anInt2994 * -1523220561));
							Class482.anInt5157 += 60005913;
						}
						if (local21 == null) {
							local21 = new Class3_Sub27(arg0[local1], this);
						}
						this.aList17.add(local21);
						this.anInt5139++;
						aBooleanArray33[local1] = true;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "()Lclient!dk;", line = 208)
	public Class128 method28840() {
		this.aClass128_1.aClass551_1.method32682();
		for (@Pc(6) int local6 = 0; local6 < this.aClass53_Sub1_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass53_Sub1_Sub1_Sub1Array1[local6] != null && this.aClass53_Sub1_Sub1_Sub1Array1[local6].aClass491_1 != null) {
				this.aClass128_1.aClass551_1.method32683(this.aClass53_Sub1_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass128_1;
	}

	@OriginalMember(owner = "client!tf", name = "as", descriptor = "()Lclient!dk;", line = 208)
	public Class128 method28851() {
		this.aClass128_1.aClass551_1.method32682();
		for (@Pc(6) int local6 = 0; local6 < this.aClass53_Sub1_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass53_Sub1_Sub1_Sub1Array1[local6] != null && this.aClass53_Sub1_Sub1_Sub1Array1[local6].aClass491_1 != null) {
				this.aClass128_1.aClass551_1.method32683(this.aClass53_Sub1_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass128_1;
	}

	@OriginalMember(owner = "client!tf", name = "aj", descriptor = "()Lclient!dk;", line = 208)
	public Class128 method28861() {
		this.aClass128_1.aClass551_1.method32682();
		for (@Pc(6) int local6 = 0; local6 < this.aClass53_Sub1_Sub1_Sub1Array1.length; local6++) {
			if (this.aClass53_Sub1_Sub1_Sub1Array1[local6] != null && this.aClass53_Sub1_Sub1_Sub1Array1[local6].aClass491_1 != null) {
				this.aClass128_1.aClass551_1.method32683(this.aClass53_Sub1_Sub1_Sub1Array1[local6]);
			}
		}
		return this.aClass128_1;
	}

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "(IIIII)V", line = 216)
	public void method28842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5142 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "ai", descriptor = "(IIIII)V", line = 216)
	public void method28863(@OriginalArg(0) int arg0) {
		this.anInt5142 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "(Lclient!rp;Lclient!de;)V", line = 220)
	void method28831(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1) {
		this.aClass128_1.aClass551_1.method32682();
		@Pc(8) Iterator local8 = this.aList18.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class491 local15 = (Class491) local8.next();
			local15.method29248(arg0, arg1, this.aLong277);
		}
	}

	@OriginalMember(owner = "client!tf", name = "aq", descriptor = "(Lclient!rp;Lclient!de;)V", line = 220)
	void method28864(@OriginalArg(0) Class438 arg0, @OriginalArg(1) Class21 arg1) {
		this.aClass128_1.aClass551_1.method32682();
		@Pc(8) Iterator local8 = this.aList18.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class491 local15 = (Class491) local8.next();
			local15.method29248(arg0, arg1, this.aLong277);
		}
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "()Lclient!dk;", line = 230)
	public Class128 method28843() {
		return this.aClass128_1;
	}

	@OriginalMember(owner = "client!tf", name = "av", descriptor = "()Lclient!dk;", line = 230)
	public Class128 method28865() {
		return this.aClass128_1;
	}

	@OriginalMember(owner = "client!tf", name = "ax", descriptor = "()Lclient!dk;", line = 230)
	public Class128 method28866() {
		return this.aClass128_1;
	}
}
