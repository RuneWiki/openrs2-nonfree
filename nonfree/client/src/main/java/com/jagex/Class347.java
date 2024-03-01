package com.jagex;

import java.util.Arrays;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public class Class347 implements Interface13 {

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "[I")
	int[] anIntArray418;

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "[[I")
	int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "Ljava/lang/String;")
	public String aString182;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "[[I")
	int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "Ljava/lang/String;")
	public String aString183;

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray26;

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "[I")
	public int[] anIntArray419;

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
	public int anInt4194;

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "[I")
	int[] anIntArray420;

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "[[I")
	public int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
	public int anInt4196;

	@OriginalMember(owner = "client!ir", name = "v", descriptor = "[I")
	public int[] anIntArray421;

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "[I")
	int[] anIntArray422;

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray27;

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "[I")
	public int[] anIntArray423;

	@OriginalMember(owner = "client!ir", name = "x", descriptor = "[I")
	int[] anIntArray424;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "[I")
	int[] anIntArray425;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "Lclient!aan;")
	Class16 aClass16_31;

	@OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
	public int anInt4197 = 0;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
	public int anInt4195 = 0;

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "Z")
	public boolean aBoolean725 = false;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
	public int anInt4198 = 890023447;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "Lclient!ao;")
	Interface11 anInterface11_12;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "(II)Lclient!jd;", line = 13)
	static Class358 method27615(@OriginalArg(0) int arg0) {
		if (arg0 == Class358.aClass358_4.anInt4566 * 989197935) {
			return Class358.aClass358_4;
		} else if (arg0 == Class358.aClass358_3.anInt4566 * 989197935) {
			return Class358.aClass358_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(ILclient!ao;)V", line = 39)
	Class347(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1) {
		this.anInterface11_12 = arg1;
	}

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "(Lclient!alw;B)V", line = 45)
	@Override
	public void method36654(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method27580(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "(Lclient!alw;)V", line = 45)
	@Override
	public void method36655(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method27580(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "(Lclient!alw;)V", line = 45)
	@Override
	public void method36656(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method27580(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "(Lclient!alw;)V", line = 45)
	@Override
	public void method36657(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method27580(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ir", name = "w", descriptor = "(Lclient!alw;)V", line = 45)
	@Override
	public void method36658(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method27580(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "(Lclient!alw;II)V", line = 52)
	void method27580(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString183 = arg0.method22428();
		} else if (arg1 == 2) {
			this.aString182 = arg0.method22428();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method22413();
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.method22415();
					this.anIntArrayArray56[local31][1] = arg0.method22419();
					this.anIntArrayArray56[local31][2] = arg0.method22419();
				}
			} else if (arg1 == 4) {
				local24 = arg0.method22413();
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.method22415();
					this.anIntArrayArray55[local31][1] = arg0.method22419();
					this.anIntArrayArray55[local31][2] = arg0.method22419();
				}
			} else if (arg1 == 5) {
				arg0.method22415();
			} else if (arg1 == 6) {
				this.anInt4197 = arg0.method22413() * 1236877151;
			} else if (arg1 == 7) {
				this.anInt4195 = arg0.method22413() * -1866901877;
			} else if (arg1 == 8) {
				this.aBoolean725 = true;
			} else if (arg1 == 9) {
				this.anInt4194 = arg0.method22413() * -1142464977;
			} else if (arg1 == 10) {
				local24 = arg0.method22413();
				this.anIntArray420 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray420[local31] = arg0.method22419();
				}
			} else if (arg1 == 12) {
				arg0.method22419();
			} else if (arg1 == 13) {
				local24 = arg0.method22413();
				this.anIntArray419 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray419[local31] = arg0.method22415();
				}
			} else if (arg1 == 14) {
				local24 = arg0.method22413();
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.method22413();
					this.anIntArrayArray57[local31][1] = arg0.method22413();
				}
			} else if (arg1 == 15) {
				this.anInt4196 = arg0.method22415() * -1049452577;
			} else if (arg1 == 17) {
				this.anInt4198 = arg0.method22436() * -890023447;
			} else if (arg1 == 18) {
				local24 = arg0.method22413();
				this.anIntArray421 = new int[local24];
				this.anIntArray422 = new int[local24];
				this.anIntArray418 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray421[local31] = arg0.method22419();
					this.anIntArray422[local31] = arg0.method22419();
					this.anIntArray418[local31] = arg0.method22419();
					this.aStringArray27[local31] = arg0.method22427();
				}
			} else if (arg1 == 19) {
				local24 = arg0.method22413();
				this.anIntArray423 = new int[local24];
				this.anIntArray424 = new int[local24];
				this.anIntArray425 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray423[local31] = arg0.method22419();
					this.anIntArray424[local31] = arg0.method22419();
					this.anIntArray425[local31] = arg0.method22419();
					this.aStringArray26[local31] = arg0.method22427();
				}
			} else if (arg1 == 249) {
				local24 = arg0.method22413();
				if (this.aClass16_31 == null) {
					local31 = Class134_Sub2.method10212(local24);
					this.aClass16_31 = new Class16(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method22413() == 1;
					@Pc(436) int local436 = arg0.method22417();
					@Pc(445) Class93 local445;
					if (local432) {
						local445 = new Class93_Sub15(arg0.method22427());
					} else {
						local445 = new Class93_Sub14(arg0.method22419());
					}
					this.aClass16_31.method221(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(Lclient!alw;I)V", line = 52)
	void method27588(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString183 = arg0.method22428();
		} else if (arg1 == 2) {
			this.aString182 = arg0.method22428();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method22413();
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.method22415();
					this.anIntArrayArray56[local31][1] = arg0.method22419();
					this.anIntArrayArray56[local31][2] = arg0.method22419();
				}
			} else if (arg1 == 4) {
				local24 = arg0.method22413();
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.method22415();
					this.anIntArrayArray55[local31][1] = arg0.method22419();
					this.anIntArrayArray55[local31][2] = arg0.method22419();
				}
			} else if (arg1 == 5) {
				arg0.method22415();
			} else if (arg1 == 6) {
				this.anInt4197 = arg0.method22413() * 1236877151;
			} else if (arg1 == 7) {
				this.anInt4195 = arg0.method22413() * -1866901877;
			} else if (arg1 == 8) {
				this.aBoolean725 = true;
			} else if (arg1 == 9) {
				this.anInt4194 = arg0.method22413() * -1142464977;
			} else if (arg1 == 10) {
				local24 = arg0.method22413();
				this.anIntArray420 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray420[local31] = arg0.method22419();
				}
			} else if (arg1 == 12) {
				arg0.method22419();
			} else if (arg1 == 13) {
				local24 = arg0.method22413();
				this.anIntArray419 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray419[local31] = arg0.method22415();
				}
			} else if (arg1 == 14) {
				local24 = arg0.method22413();
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.method22413();
					this.anIntArrayArray57[local31][1] = arg0.method22413();
				}
			} else if (arg1 == 15) {
				this.anInt4196 = arg0.method22415() * -1049452577;
			} else if (arg1 == 17) {
				this.anInt4198 = arg0.method22436() * -890023447;
			} else if (arg1 == 18) {
				local24 = arg0.method22413();
				this.anIntArray421 = new int[local24];
				this.anIntArray422 = new int[local24];
				this.anIntArray418 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray421[local31] = arg0.method22419();
					this.anIntArray422[local31] = arg0.method22419();
					this.anIntArray418[local31] = arg0.method22419();
					this.aStringArray27[local31] = arg0.method22427();
				}
			} else if (arg1 == 19) {
				local24 = arg0.method22413();
				this.anIntArray423 = new int[local24];
				this.anIntArray424 = new int[local24];
				this.anIntArray425 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray423[local31] = arg0.method22419();
					this.anIntArray424[local31] = arg0.method22419();
					this.anIntArray425[local31] = arg0.method22419();
					this.aStringArray26[local31] = arg0.method22427();
				}
			} else if (arg1 == 249) {
				local24 = arg0.method22413();
				if (this.aClass16_31 == null) {
					local31 = Class134_Sub2.method10212(local24);
					this.aClass16_31 = new Class16(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method22413() == 1;
					@Pc(436) int local436 = arg0.method22417();
					@Pc(445) Class93 local445;
					if (local432) {
						local445 = new Class93_Sub15(arg0.method22427());
					} else {
						local445 = new Class93_Sub14(arg0.method22419());
					}
					this.aClass16_31.method221(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!alw;I)V", line = 52)
	void method27592(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString183 = arg0.method22428();
		} else if (arg1 == 2) {
			this.aString182 = arg0.method22428();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method22413();
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.method22415();
					this.anIntArrayArray56[local31][1] = arg0.method22419();
					this.anIntArrayArray56[local31][2] = arg0.method22419();
				}
			} else if (arg1 == 4) {
				local24 = arg0.method22413();
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.method22415();
					this.anIntArrayArray55[local31][1] = arg0.method22419();
					this.anIntArrayArray55[local31][2] = arg0.method22419();
				}
			} else if (arg1 == 5) {
				arg0.method22415();
			} else if (arg1 == 6) {
				this.anInt4197 = arg0.method22413() * 1236877151;
			} else if (arg1 == 7) {
				this.anInt4195 = arg0.method22413() * -1866901877;
			} else if (arg1 == 8) {
				this.aBoolean725 = true;
			} else if (arg1 == 9) {
				this.anInt4194 = arg0.method22413() * -1142464977;
			} else if (arg1 == 10) {
				local24 = arg0.method22413();
				this.anIntArray420 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray420[local31] = arg0.method22419();
				}
			} else if (arg1 == 12) {
				arg0.method22419();
			} else if (arg1 == 13) {
				local24 = arg0.method22413();
				this.anIntArray419 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray419[local31] = arg0.method22415();
				}
			} else if (arg1 == 14) {
				local24 = arg0.method22413();
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.method22413();
					this.anIntArrayArray57[local31][1] = arg0.method22413();
				}
			} else if (arg1 == 15) {
				this.anInt4196 = arg0.method22415() * -1049452577;
			} else if (arg1 == 17) {
				this.anInt4198 = arg0.method22436() * -890023447;
			} else if (arg1 == 18) {
				local24 = arg0.method22413();
				this.anIntArray421 = new int[local24];
				this.anIntArray422 = new int[local24];
				this.anIntArray418 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray421[local31] = arg0.method22419();
					this.anIntArray422[local31] = arg0.method22419();
					this.anIntArray418[local31] = arg0.method22419();
					this.aStringArray27[local31] = arg0.method22427();
				}
			} else if (arg1 == 19) {
				local24 = arg0.method22413();
				this.anIntArray423 = new int[local24];
				this.anIntArray424 = new int[local24];
				this.anIntArray425 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray423[local31] = arg0.method22419();
					this.anIntArray424[local31] = arg0.method22419();
					this.anIntArray425[local31] = arg0.method22419();
					this.aStringArray26[local31] = arg0.method22427();
				}
			} else if (arg1 == 249) {
				local24 = arg0.method22413();
				if (this.aClass16_31 == null) {
					local31 = Class134_Sub2.method10212(local24);
					this.aClass16_31 = new Class16(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method22413() == 1;
					@Pc(436) int local436 = arg0.method22417();
					@Pc(445) Class93 local445;
					if (local432) {
						local445 = new Class93_Sub15(arg0.method22427());
					} else {
						local445 = new Class93_Sub14(arg0.method22419());
					}
					this.aClass16_31.method221(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "(Lclient!alw;I)V", line = 52)
	void method27593(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString183 = arg0.method22428();
		} else if (arg1 == 2) {
			this.aString182 = arg0.method22428();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method22413();
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.method22415();
					this.anIntArrayArray56[local31][1] = arg0.method22419();
					this.anIntArrayArray56[local31][2] = arg0.method22419();
				}
			} else if (arg1 == 4) {
				local24 = arg0.method22413();
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.method22415();
					this.anIntArrayArray55[local31][1] = arg0.method22419();
					this.anIntArrayArray55[local31][2] = arg0.method22419();
				}
			} else if (arg1 == 5) {
				arg0.method22415();
			} else if (arg1 == 6) {
				this.anInt4197 = arg0.method22413() * 1236877151;
			} else if (arg1 == 7) {
				this.anInt4195 = arg0.method22413() * -1866901877;
			} else if (arg1 == 8) {
				this.aBoolean725 = true;
			} else if (arg1 == 9) {
				this.anInt4194 = arg0.method22413() * -1142464977;
			} else if (arg1 == 10) {
				local24 = arg0.method22413();
				this.anIntArray420 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray420[local31] = arg0.method22419();
				}
			} else if (arg1 == 12) {
				arg0.method22419();
			} else if (arg1 == 13) {
				local24 = arg0.method22413();
				this.anIntArray419 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray419[local31] = arg0.method22415();
				}
			} else if (arg1 == 14) {
				local24 = arg0.method22413();
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.method22413();
					this.anIntArrayArray57[local31][1] = arg0.method22413();
				}
			} else if (arg1 == 15) {
				this.anInt4196 = arg0.method22415() * -1049452577;
			} else if (arg1 == 17) {
				this.anInt4198 = arg0.method22436() * -890023447;
			} else if (arg1 == 18) {
				local24 = arg0.method22413();
				this.anIntArray421 = new int[local24];
				this.anIntArray422 = new int[local24];
				this.anIntArray418 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray421[local31] = arg0.method22419();
					this.anIntArray422[local31] = arg0.method22419();
					this.anIntArray418[local31] = arg0.method22419();
					this.aStringArray27[local31] = arg0.method22427();
				}
			} else if (arg1 == 19) {
				local24 = arg0.method22413();
				this.anIntArray423 = new int[local24];
				this.anIntArray424 = new int[local24];
				this.anIntArray425 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray423[local31] = arg0.method22419();
					this.anIntArray424[local31] = arg0.method22419();
					this.anIntArray425[local31] = arg0.method22419();
					this.aStringArray26[local31] = arg0.method22427();
				}
			} else if (arg1 == 249) {
				local24 = arg0.method22413();
				if (this.aClass16_31 == null) {
					local31 = Class134_Sub2.method10212(local24);
					this.aClass16_31 = new Class16(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method22413() == 1;
					@Pc(436) int local436 = arg0.method22417();
					@Pc(445) Class93 local445;
					if (local432) {
						local445 = new Class93_Sub15(arg0.method22427());
					} else {
						local445 = new Class93_Sub14(arg0.method22419());
					}
					this.aClass16_31.method221(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "(Lclient!alw;I)V", line = 52)
	void method27595(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString183 = arg0.method22428();
		} else if (arg1 == 2) {
			this.aString182 = arg0.method22428();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method22413();
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.method22415();
					this.anIntArrayArray56[local31][1] = arg0.method22419();
					this.anIntArrayArray56[local31][2] = arg0.method22419();
				}
			} else if (arg1 == 4) {
				local24 = arg0.method22413();
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.method22415();
					this.anIntArrayArray55[local31][1] = arg0.method22419();
					this.anIntArrayArray55[local31][2] = arg0.method22419();
				}
			} else if (arg1 == 5) {
				arg0.method22415();
			} else if (arg1 == 6) {
				this.anInt4197 = arg0.method22413() * 1236877151;
			} else if (arg1 == 7) {
				this.anInt4195 = arg0.method22413() * -1866901877;
			} else if (arg1 == 8) {
				this.aBoolean725 = true;
			} else if (arg1 == 9) {
				this.anInt4194 = arg0.method22413() * -1142464977;
			} else if (arg1 == 10) {
				local24 = arg0.method22413();
				this.anIntArray420 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray420[local31] = arg0.method22419();
				}
			} else if (arg1 == 12) {
				arg0.method22419();
			} else if (arg1 == 13) {
				local24 = arg0.method22413();
				this.anIntArray419 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray419[local31] = arg0.method22415();
				}
			} else if (arg1 == 14) {
				local24 = arg0.method22413();
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.method22413();
					this.anIntArrayArray57[local31][1] = arg0.method22413();
				}
			} else if (arg1 == 15) {
				this.anInt4196 = arg0.method22415() * -1049452577;
			} else if (arg1 == 17) {
				this.anInt4198 = arg0.method22436() * -890023447;
			} else if (arg1 == 18) {
				local24 = arg0.method22413();
				this.anIntArray421 = new int[local24];
				this.anIntArray422 = new int[local24];
				this.anIntArray418 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray421[local31] = arg0.method22419();
					this.anIntArray422[local31] = arg0.method22419();
					this.anIntArray418[local31] = arg0.method22419();
					this.aStringArray27[local31] = arg0.method22427();
				}
			} else if (arg1 == 19) {
				local24 = arg0.method22413();
				this.anIntArray423 = new int[local24];
				this.anIntArray424 = new int[local24];
				this.anIntArray425 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray423[local31] = arg0.method22419();
					this.anIntArray424[local31] = arg0.method22419();
					this.anIntArray425[local31] = arg0.method22419();
					this.aStringArray26[local31] = arg0.method22427();
				}
			} else if (arg1 == 249) {
				local24 = arg0.method22413();
				if (this.aClass16_31 == null) {
					local31 = Class134_Sub2.method10212(local24);
					this.aClass16_31 = new Class16(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method22413() == 1;
					@Pc(436) int local436 = arg0.method22417();
					@Pc(445) Class93 local445;
					if (local432) {
						local445 = new Class93_Sub15(arg0.method22427());
					} else {
						local445 = new Class93_Sub14(arg0.method22419());
					}
					this.aClass16_31.method221(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "()V", line = 147)
	@Override
	public void method36659() {
		if (this.aString182 == null) {
			this.aString182 = this.aString183;
		}
	}

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "(I)V", line = 147)
	@Override
	public void method36653() {
		if (this.aString182 == null) {
			this.aString182 = this.aString183;
		}
	}

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "(IIB)I", line = 151)
	public int method27582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass16_31 == null) {
			return arg1;
		} else {
			@Pc(12) Class93_Sub14 local12 = (Class93_Sub14) this.aClass16_31.method215((long) arg0);
			return local12 == null ? arg1 : local12.anInt1526 * 1279598251;
		}
	}

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "(II)I", line = 151)
	public int method27596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass16_31 == null) {
			return arg1;
		} else {
			@Pc(12) Class93_Sub14 local12 = (Class93_Sub14) this.aClass16_31.method215((long) arg0);
			return local12 == null ? arg1 : local12.anInt1526 * 1279598251;
		}
	}

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "(II)I", line = 151)
	public int method27597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass16_31 == null) {
			return arg1;
		} else {
			@Pc(12) Class93_Sub14 local12 = (Class93_Sub14) this.aClass16_31.method215((long) arg0);
			return local12 == null ? arg1 : local12.anInt1526 * 1279598251;
		}
	}

	@OriginalMember(owner = "client!ir", name = "t", descriptor = "(II)I", line = 151)
	public int method27598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass16_31 == null) {
			return arg1;
		} else {
			@Pc(12) Class93_Sub14 local12 = (Class93_Sub14) this.aClass16_31.method215((long) arg0);
			return local12 == null ? arg1 : local12.anInt1526 * 1279598251;
		}
	}

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 158)
	public String method27591(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass16_31 == null) {
			return arg1;
		} else {
			@Pc(11) Class93_Sub15 local11 = (Class93_Sub15) this.aClass16_31.method215((long) arg0);
			return local11 == null ? arg1 : (String) local11.anObject5;
		}
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(Lclient!ep;I)Z", line = 165)
	public boolean method27583(@OriginalArg(0) Interface23 arg0) {
		@Pc(4) int local4;
		if (this.anIntArrayArray56 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray56.length; local4++) {
				@Pc(21) Class108 local21 = ((Interface21) arg0).method27954(Class138.aClass138_65, this.anIntArrayArray56[local4][0]);
				if (arg0.method33455(local21) >= this.anIntArrayArray56[local4][1]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray55 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray55.length; local4++) {
				@Pc(57) Class379 local57 = ((Interface21) arg0).method27953(this.anIntArrayArray55[local4][0]);
				if (arg0.method33454(local57) >= this.anIntArrayArray55[local4][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ir", name = "ae", descriptor = "(Lclient!ep;)Z", line = 165)
	public boolean method27599(@OriginalArg(0) Interface23 arg0) {
		@Pc(4) int local4;
		if (this.anIntArrayArray56 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray56.length; local4++) {
				@Pc(21) Class108 local21 = ((Interface21) arg0).method27954(Class138.aClass138_65, this.anIntArrayArray56[local4][0]);
				if (arg0.method33455(local21) >= this.anIntArrayArray56[local4][1]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray55 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray55.length; local4++) {
				@Pc(57) Class379 local57 = ((Interface21) arg0).method27953(this.anIntArrayArray55[local4][0]);
				if (arg0.method33454(local57) >= this.anIntArrayArray55[local4][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(Lclient!ep;I)Z", line = 181)
	public boolean method27584(@OriginalArg(0) Interface23 arg0) {
		@Pc(4) int local4;
		if (this.anIntArrayArray56 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray56.length; local4++) {
				@Pc(21) Class108 local21 = ((Interface21) arg0).method27954(Class138.aClass138_65, this.anIntArrayArray56[local4][0]);
				if (arg0.method33455(local21) >= this.anIntArrayArray56[local4][2]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray55 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray55.length; local4++) {
				@Pc(57) Class379 local57 = ((Interface21) arg0).method27953(this.anIntArrayArray55[local4][0]);
				if (arg0.method33454(local57) >= this.anIntArrayArray55[local4][2]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ir", name = "r", descriptor = "(Lclient!ep;I)Z", line = 197)
	public boolean method27585(@OriginalArg(0) Interface23 arg0) {
		if (Class387.method28244(arg0, this.anInterface11_12) < this.anInt4196 * -643441633) {
			return false;
		}
		@Pc(16) int local16;
		if (this.anIntArrayArray57 != null) {
			for (local16 = 0; local16 < this.anIntArrayArray57.length; local16++) {
				if (((Interface71) arg0).method8654(this.anIntArrayArray57[local16][0]) < this.anIntArrayArray57[local16][1]) {
					return false;
				}
			}
		}
		if (this.anIntArray419 != null) {
			for (local16 = 0; local16 < this.anIntArray419.length; local16++) {
				if (!((Class347) this.anInterface11_12.method18261(this.anIntArray419[local16])).method27584(arg0)) {
					return false;
				}
			}
		}
		@Pc(95) int local95;
		if (this.anIntArray421 != null) {
			for (local16 = 0; local16 < this.anIntArray421.length; local16++) {
				@Pc(90) Class108 local90 = ((Interface21) arg0).method27954(Class138.aClass138_65, this.anIntArray421[local16]);
				local95 = arg0.method33455(local90);
				if (local95 < this.anIntArray422[local16] || local95 > this.anIntArray418[local16]) {
					return false;
				}
			}
		}
		if (this.anIntArray423 != null) {
			for (local16 = 0; local16 < this.anIntArray423.length; local16++) {
				@Pc(130) Class379 local130 = ((Interface21) arg0).method27953(this.anIntArray423[local16]);
				local95 = arg0.method33454(local130);
				if (local95 < this.anIntArray424[local16] || local95 > this.anIntArray425[local16]) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ir", name = "ag", descriptor = "(Lclient!ep;)Z", line = 197)
	public boolean method27600(@OriginalArg(0) Interface23 arg0) {
		if (Class387.method28244(arg0, this.anInterface11_12) < this.anInt4196 * -643441633) {
			return false;
		}
		@Pc(16) int local16;
		if (this.anIntArrayArray57 != null) {
			for (local16 = 0; local16 < this.anIntArrayArray57.length; local16++) {
				if (((Interface71) arg0).method8654(this.anIntArrayArray57[local16][0]) < this.anIntArrayArray57[local16][1]) {
					return false;
				}
			}
		}
		if (this.anIntArray419 != null) {
			for (local16 = 0; local16 < this.anIntArray419.length; local16++) {
				if (!((Class347) this.anInterface11_12.method18261(this.anIntArray419[local16])).method27584(arg0)) {
					return false;
				}
			}
		}
		@Pc(95) int local95;
		if (this.anIntArray421 != null) {
			for (local16 = 0; local16 < this.anIntArray421.length; local16++) {
				@Pc(90) Class108 local90 = ((Interface21) arg0).method27954(Class138.aClass138_65, this.anIntArray421[local16]);
				local95 = arg0.method33455(local90);
				if (local95 < this.anIntArray422[local16] || local95 > this.anIntArray418[local16]) {
					return false;
				}
			}
		}
		if (this.anIntArray423 != null) {
			for (local16 = 0; local16 < this.anIntArray423.length; local16++) {
				@Pc(130) Class379 local130 = ((Interface21) arg0).method27953(this.anIntArray423[local16]);
				local95 = arg0.method33454(local130);
				if (local95 < this.anIntArray424[local16] || local95 > this.anIntArray425[local16]) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ir", name = "ah", descriptor = "(Lclient!ep;)Z", line = 197)
	public boolean method27601(@OriginalArg(0) Interface23 arg0) {
		if (Class387.method28244(arg0, this.anInterface11_12) < this.anInt4196 * -643441633) {
			return false;
		}
		@Pc(16) int local16;
		if (this.anIntArrayArray57 != null) {
			for (local16 = 0; local16 < this.anIntArrayArray57.length; local16++) {
				if (((Interface71) arg0).method8654(this.anIntArrayArray57[local16][0]) < this.anIntArrayArray57[local16][1]) {
					return false;
				}
			}
		}
		if (this.anIntArray419 != null) {
			for (local16 = 0; local16 < this.anIntArray419.length; local16++) {
				if (!((Class347) this.anInterface11_12.method18261(this.anIntArray419[local16])).method27584(arg0)) {
					return false;
				}
			}
		}
		@Pc(95) int local95;
		if (this.anIntArray421 != null) {
			for (local16 = 0; local16 < this.anIntArray421.length; local16++) {
				@Pc(90) Class108 local90 = ((Interface21) arg0).method27954(Class138.aClass138_65, this.anIntArray421[local16]);
				local95 = arg0.method33455(local90);
				if (local95 < this.anIntArray422[local16] || local95 > this.anIntArray418[local16]) {
					return false;
				}
			}
		}
		if (this.anIntArray423 != null) {
			for (local16 = 0; local16 < this.anIntArray423.length; local16++) {
				@Pc(130) Class379 local130 = ((Interface21) arg0).method27953(this.anIntArray423[local16]);
				local95 = arg0.method33454(local130);
				if (local95 < this.anIntArray424[local16] || local95 > this.anIntArray425[local16]) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ir", name = "v", descriptor = "(Lclient!ep;I)Z", line = 226)
	public boolean method27594(@OriginalArg(0) Interface23 arg0) {
		return Class387.method28244(arg0, this.anInterface11_12) >= this.anInt4196 * -643441633;
	}

	@OriginalMember(owner = "client!ir", name = "al", descriptor = "(Lclient!ep;)Z", line = 226)
	public boolean method27602(@OriginalArg(0) Interface23 arg0) {
		return Class387.method28244(arg0, this.anInterface11_12) >= this.anInt4196 * -643441633;
	}

	@OriginalMember(owner = "client!ir", name = "ac", descriptor = "(Lclient!ep;)Z", line = 226)
	public boolean method27603(@OriginalArg(0) Interface23 arg0) {
		return Class387.method28244(arg0, this.anInterface11_12) >= this.anInt4196 * -643441633;
	}

	@OriginalMember(owner = "client!ir", name = "ai", descriptor = "(Lclient!ep;)Z", line = 226)
	public boolean method27604(@OriginalArg(0) Interface23 arg0) {
		return Class387.method28244(arg0, this.anInterface11_12) >= this.anInt4196 * -643441633;
	}

	@OriginalMember(owner = "client!ir", name = "aw", descriptor = "(Lclient!ep;I)Z", line = 231)
	public boolean method27581(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray57 == null || arg1 < 0 || arg1 >= this.anIntArrayArray57.length) {
			return false;
		} else {
			return ((Interface71) arg0).method8654(this.anIntArrayArray57[arg1][0]) >= this.anIntArrayArray57[arg1][1];
		}
	}

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "(Lclient!ep;IB)Z", line = 231)
	public boolean method27587(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray57 == null || arg1 < 0 || arg1 >= this.anIntArrayArray57.length) {
			return false;
		} else {
			return ((Interface71) arg0).method8654(this.anIntArrayArray57[arg1][0]) >= this.anIntArrayArray57[arg1][1];
		}
	}

	@OriginalMember(owner = "client!ir", name = "as", descriptor = "(Lclient!ep;I)Z", line = 231)
	public boolean method27605(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray57 == null || arg1 < 0 || arg1 >= this.anIntArrayArray57.length) {
			return false;
		} else {
			return ((Interface71) arg0).method8654(this.anIntArrayArray57[arg1][0]) >= this.anIntArrayArray57[arg1][1];
		}
	}

	@OriginalMember(owner = "client!ir", name = "ad", descriptor = "(Lclient!ep;I)Z", line = 237)
	public boolean method27586(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray419 == null || arg1 < 0 || arg1 >= this.anIntArray419.length) {
			return false;
		} else {
			return ((Class347) this.anInterface11_12.method18261(this.anIntArray419[arg1])).method27584(arg0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "at", descriptor = "(Lclient!ep;I)Z", line = 237)
	public boolean method27606(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray419 == null || arg1 < 0 || arg1 >= this.anIntArray419.length) {
			return false;
		} else {
			return ((Class347) this.anInterface11_12.method18261(this.anIntArray419[arg1])).method27584(arg0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "(Lclient!ep;IB)Z", line = 237)
	public boolean method27607(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray419 == null || arg1 < 0 || arg1 >= this.anIntArray419.length) {
			return false;
		} else {
			return ((Class347) this.anInterface11_12.method18261(this.anIntArray419[arg1])).method27584(arg0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "am", descriptor = "(Lclient!ep;I)Z", line = 237)
	public boolean method27609(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray419 == null || arg1 < 0 || arg1 >= this.anIntArray419.length) {
			return false;
		} else {
			return ((Class347) this.anInterface11_12.method18261(this.anIntArray419[arg1])).method27584(arg0);
		}
	}

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "(Lclient!ep;II)Z", line = 243)
	public boolean method27589(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray421 == null || arg1 < 0 || arg1 >= this.anIntArray421.length) {
			return false;
		} else {
			@Pc(21) Class108 local21 = ((Interface21) arg0).method27954(Class138.aClass138_65, this.anIntArray421[arg1]);
			@Pc(26) int local26 = arg0.method33455(local21);
			return local26 >= this.anIntArray422[arg1] && local26 <= this.anIntArray418[arg1];
		}
	}

	@OriginalMember(owner = "client!ir", name = "au", descriptor = "(Lclient!ep;I)Z", line = 243)
	public boolean method27608(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray421 == null || arg1 < 0 || arg1 >= this.anIntArray421.length) {
			return false;
		} else {
			@Pc(21) Class108 local21 = ((Interface21) arg0).method27954(Class138.aClass138_65, this.anIntArray421[arg1]);
			@Pc(26) int local26 = arg0.method33455(local21);
			return local26 >= this.anIntArray422[arg1] && local26 <= this.anIntArray418[arg1];
		}
	}

	@OriginalMember(owner = "client!ir", name = "ar", descriptor = "(Lclient!ep;I)Z", line = 251)
	public boolean method27579(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray423 == null || arg1 < 0 || arg1 >= this.anIntArray423.length) {
			return false;
		} else {
			@Pc(20) Class379 local20 = ((Interface21) arg0).method27953(this.anIntArray423[arg1]);
			@Pc(25) int local25 = arg0.method33454(local20);
			return local25 >= this.anIntArray424[arg1] && local25 <= this.anIntArray425[arg1];
		}
	}

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "(Lclient!ep;II)Z", line = 251)
	public boolean method27590(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray423 == null || arg1 < 0 || arg1 >= this.anIntArray423.length) {
			return false;
		} else {
			@Pc(20) Class379 local20 = ((Interface21) arg0).method27953(this.anIntArray423[arg1]);
			@Pc(25) int local25 = arg0.method33454(local20);
			return local25 >= this.anIntArray424[arg1] && local25 <= this.anIntArray425[arg1];
		}
	}

	@OriginalMember(owner = "client!ir", name = "ao", descriptor = "([ILjava/util/LinkedList;IIFI)V", line = 533)
	static void method27610(@OriginalArg(0) int[] arg0, @OriginalArg(1) LinkedList arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		if (arg1.isEmpty()) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg1.size(); local5++) {
			@Pc(14) Class619 local14 = (Class619) arg1.get(local5);
			@Pc(25) int local25 = (int) (arg4 * (float) (local14.anInt5642 * 1589474487)) + arg2;
			@Pc(36) int local36 = arg3 + (int) (arg4 * (float) (local14.anInt5641 * -1870406831));
			@Pc(45) int local45 = (int) ((float) (local14.anInt5643 * 112047587) * arg4);
			@Pc(54) int local54 = (int) (arg4 * (float) (local14.anInt5640 * 574149811));
			if (local25 < Class314.anInt4063 * 1161430833 && local36 < Class17.anInt60 * -1559495963) {
				if (local45 + local25 > Class314.anInt4063 * 1161430833) {
					local45 = Class314.anInt4063 * 1161430833 - local25;
				}
				if (local54 + local36 > Class17.anInt60 * -1559495963) {
					local54 = Class17.anInt60 * -1559495963 - local36;
				}
				for (@Pc(94) int local94 = local36; local94 < local36 + local54; local94++) {
					@Pc(107) int local107 = local25 + local94 * 1161430833 * Class314.anInt4063;
					Arrays.fill(arg0, local107, local45 + local107, -16777216);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "cq", descriptor = "(Lclient!yf;I)V", line = 5414)
	static final void method27614(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class420.method28738(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ir", name = "pj", descriptor = "(Lclient!yf;S)V", line = 7832)
	static final void method27611(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class32_Sub19.method17404(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ir", name = "xe", descriptor = "(Lclient!yf;B)V", line = 9200)
	static final void method27612(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
	}

	@OriginalMember(owner = "client!ir", name = "aiy", descriptor = "(Lclient!yf;B)V", line = 11246)
	static final void method27613(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(28) Class93_Sub1_Sub14 local28 = Class449.aClass514_1.method30267(local13);
		@Pc(33) int local33 = local28.anIntArray260[local23];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local33;
	}
}
