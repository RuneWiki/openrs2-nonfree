package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ny")
public final class Class359 {

	@OriginalMember(owner = "client!ny", name = "x", descriptor = "I")
	static final int anInt4640 = 0;

	@OriginalMember(owner = "client!ny", name = "s", descriptor = "I")
	public static final int anInt4642 = 1;

	@OriginalMember(owner = "client!ny", name = "u", descriptor = "I")
	public static final int anInt4643 = 2;

	@OriginalMember(owner = "client!ny", name = "n", descriptor = "I")
	static final int anInt4645 = 1;

	@OriginalMember(owner = "client!ny", name = "j", descriptor = "I")
	static final int anInt4646 = 0;

	@OriginalMember(owner = "client!ny", name = "l", descriptor = "Lclient!zl;")
	static Class622 aClass622_1 = new Class622();

	@OriginalMember(owner = "client!ny", name = "c", descriptor = "Z")
	static boolean aBoolean724 = false;

	@OriginalMember(owner = "client!ny", name = "z", descriptor = "I")
	static int anInt4641 = 0;

	@OriginalMember(owner = "client!ny", name = "a", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray39;

	@OriginalMember(owner = "client!ny", name = "g", descriptor = "[[Ljava/lang/Object;")
	Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ny", name = "p", descriptor = "Lclient!md;")
	Class316 aClass316_2 = null;

	@OriginalMember(owner = "client!ny", name = "b", descriptor = "Lclient!mn;")
	Class46 aClass46_1;

	@OriginalMember(owner = "client!ny", name = "h", descriptor = "Z")
	boolean aBoolean723;

	@OriginalMember(owner = "client!ny", name = "y", descriptor = "I")
	int anInt4644;

	@OriginalMember(owner = "client!ny", name = "<init>", descriptor = "(Lclient!mn;ZI)V", line = 24)
	public Class359(@OriginalArg(0) Class46 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("");
		}
		this.aClass46_1 = arg0;
		this.aBoolean723 = arg1;
		this.anInt4644 = arg2 * -1571088429;
	}

	@OriginalMember(owner = "client!ny", name = "p", descriptor = "(I)Z", line = 32)
	synchronized boolean method26666() {
		if (this.aClass316_2 == null) {
			this.aClass316_2 = this.aClass46_1.method8506();
			if (this.aClass316_2 == null) {
				return false;
			}
			this.anObjectArray39 = new Object[this.aClass316_2.anInt4543 * 1691264643];
			this.anObjectArrayArray1 = new Object[this.aClass316_2.anInt4543 * 1691264643][];
		}
		return true;
	}

	@OriginalMember(owner = "client!ny", name = "aj", descriptor = "()Z", line = 32)
	synchronized boolean method26697() {
		if (this.aClass316_2 == null) {
			this.aClass316_2 = this.aClass46_1.method8506();
			if (this.aClass316_2 == null) {
				return false;
			}
			this.anObjectArray39 = new Object[this.aClass316_2.anInt4543 * 1691264643];
			this.anObjectArrayArray1 = new Object[this.aClass316_2.anInt4543 * 1691264643][];
		}
		return true;
	}

	@OriginalMember(owner = "client!ny", name = "as", descriptor = "()I", line = 42)
	public int method26698() {
		if (!this.method26666()) {
			throw new IllegalStateException("");
		}
		return this.aClass316_2.anInt4546 * -2109054283;
	}

	@OriginalMember(owner = "client!ny", name = "ai", descriptor = "()I", line = 42)
	public int method26699() {
		if (!this.method26666()) {
			throw new IllegalStateException("");
		}
		return this.aClass316_2.anInt4546 * -2109054283;
	}

	@OriginalMember(owner = "client!ny", name = "aq", descriptor = "()I", line = 42)
	public int method26707() {
		if (!this.method26666()) {
			throw new IllegalStateException("");
		}
		return this.aClass316_2.anInt4546 * -2109054283;
	}

	@OriginalMember(owner = "client!ny", name = "a", descriptor = "(B)I", line = 42)
	public int method26749() {
		if (!this.method26666()) {
			throw new IllegalStateException("");
		}
		return this.aClass316_2.anInt4546 * -2109054283;
	}

	@OriginalMember(owner = "client!ny", name = "g", descriptor = "(II)Z", line = 47)
	synchronized boolean method26668(@OriginalArg(0) int arg0) {
		if (!this.method26666()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass316_2.anIntArray417.length && this.aClass316_2.anIntArray417[arg0] != 0) {
			return true;
		} else if (aBoolean724) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "ax", descriptor = "(I)Z", line = 47)
	synchronized boolean method26702(@OriginalArg(0) int arg0) {
		if (!this.method26666()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass316_2.anIntArray417.length && this.aClass316_2.anIntArray417[arg0] != 0) {
			return true;
		} else if (aBoolean724) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "az", descriptor = "(I)Z", line = 47)
	synchronized boolean method26703(@OriginalArg(0) int arg0) {
		if (!this.method26666()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass316_2.anIntArray417.length && this.aClass316_2.anIntArray417[arg0] != 0) {
			return true;
		} else if (aBoolean724) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "av", descriptor = "(I)Z", line = 47)
	synchronized boolean method26747(@OriginalArg(0) int arg0) {
		if (!this.method26666()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass316_2.anIntArray417.length && this.aClass316_2.anIntArray417[arg0] != 0) {
			return true;
		} else if (aBoolean724) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "l", descriptor = "(III)Z", line = 56)
	public synchronized boolean method26669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method26666()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass316_2.anIntArray417.length && arg1 < this.aClass316_2.anIntArray417[arg0]) {
			return true;
		} else if (aBoolean724) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "al", descriptor = "(II)Z", line = 56)
	public synchronized boolean method26704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method26666()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass316_2.anIntArray417.length && arg1 < this.aClass316_2.anIntArray417[arg0]) {
			return true;
		} else if (aBoolean724) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "h", descriptor = "(II)V", line = 67)
	synchronized void method26670(@OriginalArg(0) int arg0) {
		if (this.aBoolean723) {
			this.anObjectArray39[arg0] = this.aClass46_1.method8507(arg0);
		} else {
			this.anObjectArray39[arg0] = Class602.method33519(this.aClass46_1.method8507(arg0), false);
		}
	}

	@OriginalMember(owner = "client!ny", name = "ab", descriptor = "(I)V", line = 67)
	synchronized void method26701(@OriginalArg(0) int arg0) {
		if (this.aBoolean723) {
			this.anObjectArray39[arg0] = this.aClass46_1.method8507(arg0);
		} else {
			this.anObjectArray39[arg0] = Class602.method33519(this.aClass46_1.method8507(arg0), false);
		}
	}

	@OriginalMember(owner = "client!ny", name = "ap", descriptor = "(I)V", line = 67)
	synchronized void method26724(@OriginalArg(0) int arg0) {
		if (this.aBoolean723) {
			this.anObjectArray39[arg0] = this.aClass46_1.method8507(arg0);
		} else {
			this.anObjectArray39[arg0] = Class602.method33519(this.aClass46_1.method8507(arg0), false);
		}
	}

	@OriginalMember(owner = "client!ny", name = "ao", descriptor = "(I)V", line = 67)
	synchronized void method26740(@OriginalArg(0) int arg0) {
		if (this.aBoolean723) {
			this.anObjectArray39[arg0] = this.aClass46_1.method8507(arg0);
		} else {
			this.anObjectArray39[arg0] = Class602.method33519(this.aClass46_1.method8507(arg0), false);
		}
	}

	@OriginalMember(owner = "client!ny", name = "x", descriptor = "(II)V", line = 72)
	public void method26671(@OriginalArg(0) int arg0) {
		this.aClass46_1.method8508(arg0);
	}

	@OriginalMember(owner = "client!ny", name = "au", descriptor = "(I)V", line = 72)
	public void method26708(@OriginalArg(0) int arg0) {
		this.aClass46_1.method8508(arg0);
	}

	@OriginalMember(owner = "client!ny", name = "ay", descriptor = "(I)V", line = 72)
	public void method26709(@OriginalArg(0) int arg0) {
		this.aClass46_1.method8508(arg0);
	}

	@OriginalMember(owner = "client!ny", name = "ag", descriptor = "(II)[B", line = 76)
	public byte[] method26710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method26672(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!ny", name = "am", descriptor = "(II)[B", line = 76)
	public byte[] method26711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method26672(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!ny", name = "s", descriptor = "(III)[B", line = 76)
	public byte[] method26713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method26672(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!ny", name = "u", descriptor = "(II[II)[B", line = 80)
	public synchronized byte[] method26672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method26669(arg0, arg1)) {
			return null;
		}
		@Pc(9) byte[] local9 = null;
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method26686(arg0, arg1, arg2);
			if (!local30) {
				this.method26670(arg0);
				local30 = this.method26686(arg0, arg1, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		if (this.anObjectArrayArray1[arg0] == null) {
			throw new RuntimeException("");
		}
		if (this.anObjectArrayArray1[arg0][arg1] != null) {
			local9 = Class3_Sub1_Sub19.method33681(this.anObjectArrayArray1[arg0][arg1], false);
			if (local9 == null) {
				throw new RuntimeException("");
			}
		}
		if (local9 != null) {
			if (this.anInt4644 * 2048546907 == 1) {
				this.anObjectArrayArray1[arg0][arg1] = null;
				if (this.aClass316_2.anIntArray417[arg0] == 1) {
					this.anObjectArrayArray1[arg0] = null;
				}
			} else if (this.anInt4644 * 2048546907 == 2) {
				this.anObjectArrayArray1[arg0] = null;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ny", name = "ar", descriptor = "(II[I)[B", line = 80)
	public synchronized byte[] method26696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method26669(arg0, arg1)) {
			return null;
		}
		@Pc(9) byte[] local9 = null;
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method26686(arg0, arg1, arg2);
			if (!local30) {
				this.method26670(arg0);
				local30 = this.method26686(arg0, arg1, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		if (this.anObjectArrayArray1[arg0] == null) {
			throw new RuntimeException("");
		}
		if (this.anObjectArrayArray1[arg0][arg1] != null) {
			local9 = Class3_Sub1_Sub19.method33681(this.anObjectArrayArray1[arg0][arg1], false);
			if (local9 == null) {
				throw new RuntimeException("");
			}
		}
		if (local9 != null) {
			if (this.anInt4644 * 2048546907 == 1) {
				this.anObjectArrayArray1[arg0][arg1] = null;
				if (this.aClass316_2.anIntArray417[arg0] == 1) {
					this.anObjectArrayArray1[arg0] = null;
				}
			} else if (this.anInt4644 * 2048546907 == 2) {
				this.anObjectArrayArray1[arg0] = null;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ny", name = "y", descriptor = "(III)Z", line = 117)
	public synchronized boolean method26673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method26669(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray39[arg0] == null) {
			this.method26670(arg0);
			return this.anObjectArray39[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ny", name = "b", descriptor = "(II)Z", line = 126)
	public synchronized boolean method26674(@OriginalArg(0) int arg0) {
		if (!this.method26666()) {
			return false;
		} else if (this.aClass316_2.anIntArray417.length == 1) {
			return this.method26673(0, arg0);
		} else if (!this.method26668(arg0)) {
			return false;
		} else if (this.aClass316_2.anIntArray417[arg0] == 1) {
			return this.method26673(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ny", name = "ae", descriptor = "(I)Z", line = 126)
	public synchronized boolean method26751(@OriginalArg(0) int arg0) {
		if (!this.method26666()) {
			return false;
		} else if (this.aClass316_2.anIntArray417.length == 1) {
			return this.method26673(0, arg0);
		} else if (!this.method26668(arg0)) {
			return false;
		} else if (this.aClass316_2.anIntArray417[arg0] == 1) {
			return this.method26673(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ny", name = "c", descriptor = "(IS)Z", line = 134)
	public synchronized boolean method26675(@OriginalArg(0) int arg0) {
		if (!this.method26668(arg0)) {
			return false;
		} else if (this.anObjectArray39[arg0] == null) {
			this.method26670(arg0);
			return this.anObjectArray39[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ny", name = "aw", descriptor = "(I)Z", line = 134)
	public synchronized boolean method26715(@OriginalArg(0) int arg0) {
		if (!this.method26668(arg0)) {
			return false;
		} else if (this.anObjectArray39[arg0] == null) {
			this.method26670(arg0);
			return this.anObjectArray39[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ny", name = "ac", descriptor = "(I)Z", line = 134)
	public synchronized boolean method26716(@OriginalArg(0) int arg0) {
		if (!this.method26668(arg0)) {
			return false;
		} else if (this.anObjectArray39[arg0] == null) {
			this.method26670(arg0);
			return this.anObjectArray39[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ny", name = "ad", descriptor = "(I)Z", line = 134)
	public synchronized boolean method26717(@OriginalArg(0) int arg0) {
		if (!this.method26668(arg0)) {
			return false;
		} else if (this.anObjectArray39[arg0] == null) {
			this.method26670(arg0);
			return this.anObjectArray39[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ny", name = "z", descriptor = "(I)Z", line = 142)
	public synchronized boolean method26676() {
		if (!this.method26666()) {
			return false;
		}
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.aClass316_2.anIntArray415.length; local9++) {
			@Pc(21) int local21 = this.aClass316_2.anIntArray415[local9];
			if (this.anObjectArray39[local21] == null) {
				this.method26670(local21);
				if (this.anObjectArray39[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ny", name = "bp", descriptor = "()Z", line = 142)
	public synchronized boolean method26714() {
		if (!this.method26666()) {
			return false;
		}
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.aClass316_2.anIntArray415.length; local9++) {
			@Pc(21) int local21 = this.aClass316_2.anIntArray415[local9];
			if (this.anObjectArray39[local21] == null) {
				this.method26670(local21);
				if (this.anObjectArray39[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ny", name = "bw", descriptor = "()Z", line = 142)
	public synchronized boolean method26743() {
		if (!this.method26666()) {
			return false;
		}
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.aClass316_2.anIntArray415.length; local9++) {
			@Pc(21) int local21 = this.aClass316_2.anIntArray415[local9];
			if (this.anObjectArray39[local21] == null) {
				this.method26670(local21);
				if (this.anObjectArray39[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ny", name = "j", descriptor = "(IB)I", line = 155)
	synchronized int method26679(@OriginalArg(0) int arg0) {
		if (this.method26668(arg0)) {
			return this.anObjectArray39[arg0] == null ? this.aClass46_1.method8509(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bd", descriptor = "()I", line = 161)
	public synchronized int method26685() {
		if (!this.method26666()) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray39.length; local11++) {
			if (this.aClass316_2.anIntArray416[local11] > 0) {
				local7 += 100;
				local9 += this.method26679(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!ny", name = "n", descriptor = "(S)I", line = 161)
	public synchronized int method26706() {
		if (!this.method26666()) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray39.length; local11++) {
			if (this.aClass316_2.anIntArray416[local11] > 0) {
				local7 += 100;
				local9 += this.method26679(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bs", descriptor = "()I", line = 161)
	public synchronized int method26720() {
		if (!this.method26666()) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray39.length; local11++) {
			if (this.aClass316_2.anIntArray416[local11] > 0) {
				local7 += 100;
				local9 += this.method26679(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!ny", name = "e", descriptor = "(II)[B", line = 176)
	public synchronized byte[] method26705(@OriginalArg(0) int arg0) {
		if (!this.method26666()) {
			return null;
		} else if (this.aClass316_2.anIntArray417.length == 1) {
			return this.method26713(0, arg0);
		} else if (!this.method26668(arg0)) {
			return null;
		} else if (this.aClass316_2.anIntArray417[arg0] == 1) {
			return this.method26713(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ny", name = "bm", descriptor = "(I)[B", line = 176)
	public synchronized byte[] method26721(@OriginalArg(0) int arg0) {
		if (!this.method26666()) {
			return null;
		} else if (this.aClass316_2.anIntArray417.length == 1) {
			return this.method26713(0, arg0);
		} else if (!this.method26668(arg0)) {
			return null;
		} else if (this.aClass316_2.anIntArray417[arg0] == 1) {
			return this.method26713(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ny", name = "bf", descriptor = "(I)[B", line = 176)
	public synchronized byte[] method26722(@OriginalArg(0) int arg0) {
		if (!this.method26666()) {
			return null;
		} else if (this.aClass316_2.anIntArray417.length == 1) {
			return this.method26713(0, arg0);
		} else if (!this.method26668(arg0)) {
			return null;
		} else if (this.aClass316_2.anIntArray417[arg0] == 1) {
			return this.method26713(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ny", name = "bt", descriptor = "(I)[B", line = 176)
	public synchronized byte[] method26723(@OriginalArg(0) int arg0) {
		if (!this.method26666()) {
			return null;
		} else if (this.aClass316_2.anIntArray417.length == 1) {
			return this.method26713(0, arg0);
		} else if (!this.method26668(arg0)) {
			return null;
		} else if (this.aClass316_2.anIntArray417[arg0] == 1) {
			return this.method26713(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ny", name = "bk", descriptor = "(I)[I", line = 184)
	public synchronized int[] method26677(@OriginalArg(0) int arg0) {
		if (!this.method26668(arg0)) {
			return null;
		}
		@Pc(12) int[] local12 = this.aClass316_2.anIntArrayArray48[arg0];
		if (local12 == null) {
			local12 = new int[this.aClass316_2.anIntArray416[arg0]];
			@Pc(23) int local23 = 0;
			while (local23 < local12.length) {
				local12[local23] = local23++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ny", name = "r", descriptor = "(II)[I", line = 184)
	public synchronized int[] method26680(@OriginalArg(0) int arg0) {
		if (!this.method26668(arg0)) {
			return null;
		}
		@Pc(12) int[] local12 = this.aClass316_2.anIntArrayArray48[arg0];
		if (local12 == null) {
			local12 = new int[this.aClass316_2.anIntArray416[arg0]];
			@Pc(23) int local23 = 0;
			while (local23 < local12.length) {
				local12[local23] = local23++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ny", name = "bg", descriptor = "(I)[I", line = 184)
	public synchronized int[] method26725(@OriginalArg(0) int arg0) {
		if (!this.method26668(arg0)) {
			return null;
		}
		@Pc(12) int[] local12 = this.aClass316_2.anIntArrayArray48[arg0];
		if (local12 == null) {
			local12 = new int[this.aClass316_2.anIntArray416[arg0]];
			@Pc(23) int local23 = 0;
			while (local23 < local12.length) {
				local12[local23] = local23++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ny", name = "br", descriptor = "(I)[I", line = 184)
	public synchronized int[] method26726(@OriginalArg(0) int arg0) {
		if (!this.method26668(arg0)) {
			return null;
		}
		@Pc(12) int[] local12 = this.aClass316_2.anIntArrayArray48[arg0];
		if (local12 == null) {
			local12 = new int[this.aClass316_2.anIntArray416[arg0]];
			@Pc(23) int local23 = 0;
			while (local23 < local12.length) {
				local12[local23] = local23++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ny", name = "d", descriptor = "(II)Z", line = 194)
	public boolean method26730(@OriginalArg(0) int arg0) {
		if (!this.method26666()) {
			return false;
		} else if (this.aClass316_2.anIntArray417.length == 1) {
			return this.method26669(0, arg0);
		} else if (!this.method26668(arg0)) {
			return false;
		} else if (this.aClass316_2.anIntArray417[arg0] == 1) {
			return this.method26669(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ny", name = "q", descriptor = "(II)I", line = 202)
	public int method26682(@OriginalArg(0) int arg0) {
		return this.method26668(arg0) ? this.aClass316_2.anIntArray417[arg0] : 0;
	}

	@OriginalMember(owner = "client!ny", name = "m", descriptor = "(I)I", line = 207)
	public int method26683() {
		return this.method26666() ? this.aClass316_2.anIntArray417.length : -1;
	}

	@OriginalMember(owner = "client!ny", name = "bb", descriptor = "()I", line = 207)
	public int method26727() {
		return this.method26666() ? this.aClass316_2.anIntArray417.length : -1;
	}

	@OriginalMember(owner = "client!ny", name = "by", descriptor = "()I", line = 207)
	public int method26728() {
		return this.method26666() ? this.aClass316_2.anIntArray417.length : -1;
	}

	@OriginalMember(owner = "client!ny", name = "v", descriptor = "(II)V", line = 212)
	public synchronized void method26684(@OriginalArg(0) int arg0) {
		if (this.method26668(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bi", descriptor = "(ZZ)V", line = 217)
	public void method26695(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!this.method26666()) {
			return;
		}
		if (arg0) {
			this.aClass316_2.anIntArray413 = null;
			this.aClass316_2.aClass209_1 = null;
		}
		if (arg1) {
			this.aClass316_2.anIntArrayArray49 = null;
			this.aClass316_2.aClass209Array1 = null;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bl", descriptor = "(ZZ)V", line = 217)
	public void method26729(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!this.method26666()) {
			return;
		}
		if (arg0) {
			this.aClass316_2.anIntArray413 = null;
			this.aClass316_2.aClass209_1 = null;
		}
		if (arg1) {
			this.aClass316_2.anIntArrayArray49 = null;
			this.aClass316_2.aClass209Array1 = null;
		}
	}

	@OriginalMember(owner = "client!ny", name = "t", descriptor = "(ZZI)V", line = 217)
	public void method26748(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!this.method26666()) {
			return;
		}
		if (arg0) {
			this.aClass316_2.anIntArray413 = null;
			this.aClass316_2.aClass209_1 = null;
		}
		if (arg1) {
			this.aClass316_2.anIntArrayArray49 = null;
			this.aClass316_2.aClass209Array1 = null;
		}
	}

	@OriginalMember(owner = "client!ny", name = "x", descriptor = "(Lclient!ahw;IIB)V", line = 224)
	static void method26762(@OriginalArg(0) Class64_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.method13104(arg1);
		@Pc(10) byte local10;
		if (arg2 > 100000) {
			Class565.method32912();
			local10 = 4;
		} else if (arg2 > 50000) {
			Class572.method33073();
			local10 = 3;
		} else if (arg2 > 10000) {
			Class210.method24250();
			local10 = 2;
		} else {
			Class280.method25423();
			local10 = 1;
		}
		if (Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373() == arg1) {
			Class510.aClass3_Sub45_37.method13000(Class510.aClass3_Sub45_37.aClass60_Sub10_2, true);
		} else {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, arg1);
			Class546.method32647(arg1, false);
		}
		Class26_Sub1_Sub1_Sub1.method16728();
		arg0.method13102(local10);
	}

	@OriginalMember(owner = "client!ny", name = "w", descriptor = "(II[IB)Z", line = 229)
	synchronized boolean method26686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method26668(arg0)) {
			return false;
		} else if (this.anObjectArray39[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass316_2.anIntArray416[arg0];
			@Pc(25) int[] local25 = this.aClass316_2.anIntArrayArray48[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass316_2.anIntArray417[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray1[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local19; local50++) {
				@Pc(58) int local58;
				if (local25 == null) {
					local58 = local50;
				} else {
					local58 = local25[local50];
				}
				if (local46[local58] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(115) int local115;
			@Pc(119) int local119;
			@Pc(106) byte[] local106;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local106 = Class3_Sub1_Sub19.method33681(this.anObjectArray39[arg0], false);
			} else {
				local106 = Class3_Sub1_Sub19.method33681(this.anObjectArray39[arg0], true);
				@Pc(111) Class3_Sub41 local111 = new Class3_Sub41(local106);
				local115 = local111.method20269();
				local119 = local111.method20275();
				@Pc(128) int local128 = (local115 == 0 ? 5 : 9) + local119;
				local111.method20297(arg2, 5, local128);
			}
			@Pc(147) byte[] local147;
			try {
				local147 = Class494.method29319(local106);
			} catch (@Pc(149) RuntimeException local149) {
				throw Class51_Sub1.method9866(local149, (arg2 != null) + " " + arg0 + " " + local106.length + " " + Class142.method23047(local106, local106.length) + " " + Class142.method23047(local106, local106.length - 2) + " " + this.aClass316_2.anIntArray414[arg0] + " " + this.aClass316_2.anInt4546 * -2109054283);
			}
			if (this.aBoolean723) {
				this.anObjectArray39[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(256) int local256;
				@Pc(261) int local261;
				@Pc(263) int local263;
				@Pc(318) int local318;
				@Pc(320) int local320;
				@Pc(246) Class3_Sub41 local246;
				if (this.anInt4644 * 2048546907 == 2) {
					local115 = local147.length;
					local115--;
					local119 = local147[local115] & 0xFF;
					local115 -= local19 * local119 * 4;
					local246 = new Class3_Sub41(local147);
					@Pc(417) int local417 = 0;
					local256 = 0;
					local246.anInt2803 = local115 * -918980331;
					for (local261 = 0; local261 < local119; local261++) {
						local263 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local263 += local246.method20275();
							if (local25 == null) {
								local320 = local318;
							} else {
								local320 = local25[local318];
							}
							if (arg1 == local320) {
								local417 += local263;
								local256 = local320;
							}
						}
					}
					if (local417 == 0) {
						return true;
					}
					@Pc(473) byte[] local473 = new byte[local417];
					local417 = 0;
					local246.anInt2803 = local115 * -918980331;
					local263 = 0;
					for (local318 = 0; local318 < local119; local318++) {
						local320 = 0;
						for (@Pc(491) int local491 = 0; local491 < local19; local491++) {
							local320 += local246.method20275();
							@Pc(505) int local505;
							if (local25 == null) {
								local505 = local491;
							} else {
								local505 = local25[local491];
							}
							if (arg1 == local505) {
								System.arraycopy(local147, local263, local473, local417, local320);
								local417 += local320;
							}
							local263 += local320;
						}
					}
					local46[local256] = local473;
				} else {
					local115 = local147.length;
					local115--;
					local119 = local147[local115] & 0xFF;
					local115 -= local19 * local119 * 4;
					local246 = new Class3_Sub41(local147);
					@Pc(249) int[] local249 = new int[local19];
					local246.anInt2803 = local115 * -918980331;
					for (local256 = 0; local256 < local119; local256++) {
						local261 = 0;
						for (local263 = 0; local263 < local19; local263++) {
							local261 += local246.method20275();
							local249[local263] += local261;
						}
					}
					@Pc(286) byte[][] local286 = new byte[local19][];
					for (local261 = 0; local261 < local19; local261++) {
						local286[local261] = new byte[local249[local261]];
						local249[local261] = 0;
					}
					local246.anInt2803 = local115 * -918980331;
					local261 = 0;
					for (local263 = 0; local263 < local119; local263++) {
						local318 = 0;
						for (local320 = 0; local320 < local19; local320++) {
							local318 += local246.method20275();
							System.arraycopy(local147, local261, local286[local320], local249[local320], local318);
							local249[local320] += local318;
							local261 += local318;
						}
					}
					for (local263 = 0; local263 < local19; local263++) {
						if (local25 == null) {
							local318 = local263;
						} else {
							local318 = local25[local263];
						}
						if (this.anInt4644 * 2048546907 == 0) {
							local46[local318] = Class602.method33519(local286[local263], false);
						} else {
							local46[local318] = local286[local263];
						}
					}
				}
			} else {
				if (local25 == null) {
					local115 = 0;
				} else {
					local115 = local25[0];
				}
				if (this.anInt4644 * 2048546907 == 0) {
					local46[local115] = Class602.method33519(local147, false);
				} else {
					local46[local115] = local147;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bu", descriptor = "(II[I)Z", line = 229)
	synchronized boolean method26731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method26668(arg0)) {
			return false;
		} else if (this.anObjectArray39[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass316_2.anIntArray416[arg0];
			@Pc(25) int[] local25 = this.aClass316_2.anIntArrayArray48[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass316_2.anIntArray417[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray1[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local19; local50++) {
				@Pc(58) int local58;
				if (local25 == null) {
					local58 = local50;
				} else {
					local58 = local25[local50];
				}
				if (local46[local58] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(115) int local115;
			@Pc(119) int local119;
			@Pc(106) byte[] local106;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local106 = Class3_Sub1_Sub19.method33681(this.anObjectArray39[arg0], false);
			} else {
				local106 = Class3_Sub1_Sub19.method33681(this.anObjectArray39[arg0], true);
				@Pc(111) Class3_Sub41 local111 = new Class3_Sub41(local106);
				local115 = local111.method20269();
				local119 = local111.method20275();
				@Pc(128) int local128 = (local115 == 0 ? 5 : 9) + local119;
				local111.method20297(arg2, 5, local128);
			}
			@Pc(147) byte[] local147;
			try {
				local147 = Class494.method29319(local106);
			} catch (@Pc(149) RuntimeException local149) {
				throw Class51_Sub1.method9866(local149, (arg2 != null) + " " + arg0 + " " + local106.length + " " + Class142.method23047(local106, local106.length) + " " + Class142.method23047(local106, local106.length - 2) + " " + this.aClass316_2.anIntArray414[arg0] + " " + this.aClass316_2.anInt4546 * -2109054283);
			}
			if (this.aBoolean723) {
				this.anObjectArray39[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(256) int local256;
				@Pc(261) int local261;
				@Pc(263) int local263;
				@Pc(318) int local318;
				@Pc(320) int local320;
				@Pc(246) Class3_Sub41 local246;
				if (this.anInt4644 * 2048546907 == 2) {
					local115 = local147.length;
					local115--;
					local119 = local147[local115] & 0xFF;
					local115 -= local19 * local119 * 4;
					local246 = new Class3_Sub41(local147);
					@Pc(417) int local417 = 0;
					local256 = 0;
					local246.anInt2803 = local115 * -918980331;
					for (local261 = 0; local261 < local119; local261++) {
						local263 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local263 += local246.method20275();
							if (local25 == null) {
								local320 = local318;
							} else {
								local320 = local25[local318];
							}
							if (arg1 == local320) {
								local417 += local263;
								local256 = local320;
							}
						}
					}
					if (local417 == 0) {
						return true;
					}
					@Pc(473) byte[] local473 = new byte[local417];
					local417 = 0;
					local246.anInt2803 = local115 * -918980331;
					local263 = 0;
					for (local318 = 0; local318 < local119; local318++) {
						local320 = 0;
						for (@Pc(491) int local491 = 0; local491 < local19; local491++) {
							local320 += local246.method20275();
							@Pc(505) int local505;
							if (local25 == null) {
								local505 = local491;
							} else {
								local505 = local25[local491];
							}
							if (arg1 == local505) {
								System.arraycopy(local147, local263, local473, local417, local320);
								local417 += local320;
							}
							local263 += local320;
						}
					}
					local46[local256] = local473;
				} else {
					local115 = local147.length;
					local115--;
					local119 = local147[local115] & 0xFF;
					local115 -= local19 * local119 * 4;
					local246 = new Class3_Sub41(local147);
					@Pc(249) int[] local249 = new int[local19];
					local246.anInt2803 = local115 * -918980331;
					for (local256 = 0; local256 < local119; local256++) {
						local261 = 0;
						for (local263 = 0; local263 < local19; local263++) {
							local261 += local246.method20275();
							local249[local263] += local261;
						}
					}
					@Pc(286) byte[][] local286 = new byte[local19][];
					for (local261 = 0; local261 < local19; local261++) {
						local286[local261] = new byte[local249[local261]];
						local249[local261] = 0;
					}
					local246.anInt2803 = local115 * -918980331;
					local261 = 0;
					for (local263 = 0; local263 < local119; local263++) {
						local318 = 0;
						for (local320 = 0; local320 < local19; local320++) {
							local318 += local246.method20275();
							System.arraycopy(local147, local261, local286[local320], local249[local320], local318);
							local249[local320] += local318;
							local261 += local318;
						}
					}
					for (local263 = 0; local263 < local19; local263++) {
						if (local25 == null) {
							local318 = local263;
						} else {
							local318 = local25[local263];
						}
						if (this.anInt4644 * 2048546907 == 0) {
							local46[local318] = Class602.method33519(local286[local263], false);
						} else {
							local46[local318] = local286[local263];
						}
					}
				}
			} else {
				if (local25 == null) {
					local115 = 0;
				} else {
					local115 = local25[0];
				}
				if (this.anInt4644 * 2048546907 == 0) {
					local46[local115] = Class602.method33519(local147, false);
				} else {
					local46[local115] = local147;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ny", name = "ba", descriptor = "(II[I)Z", line = 229)
	synchronized boolean method26732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method26668(arg0)) {
			return false;
		} else if (this.anObjectArray39[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass316_2.anIntArray416[arg0];
			@Pc(25) int[] local25 = this.aClass316_2.anIntArrayArray48[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass316_2.anIntArray417[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray1[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local19; local50++) {
				@Pc(58) int local58;
				if (local25 == null) {
					local58 = local50;
				} else {
					local58 = local25[local50];
				}
				if (local46[local58] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(115) int local115;
			@Pc(119) int local119;
			@Pc(106) byte[] local106;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local106 = Class3_Sub1_Sub19.method33681(this.anObjectArray39[arg0], false);
			} else {
				local106 = Class3_Sub1_Sub19.method33681(this.anObjectArray39[arg0], true);
				@Pc(111) Class3_Sub41 local111 = new Class3_Sub41(local106);
				local115 = local111.method20269();
				local119 = local111.method20275();
				@Pc(128) int local128 = (local115 == 0 ? 5 : 9) + local119;
				local111.method20297(arg2, 5, local128);
			}
			@Pc(147) byte[] local147;
			try {
				local147 = Class494.method29319(local106);
			} catch (@Pc(149) RuntimeException local149) {
				throw Class51_Sub1.method9866(local149, (arg2 != null) + " " + arg0 + " " + local106.length + " " + Class142.method23047(local106, local106.length) + " " + Class142.method23047(local106, local106.length - 2) + " " + this.aClass316_2.anIntArray414[arg0] + " " + this.aClass316_2.anInt4546 * -2109054283);
			}
			if (this.aBoolean723) {
				this.anObjectArray39[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(256) int local256;
				@Pc(261) int local261;
				@Pc(263) int local263;
				@Pc(318) int local318;
				@Pc(320) int local320;
				@Pc(246) Class3_Sub41 local246;
				if (this.anInt4644 * 2048546907 == 2) {
					local115 = local147.length;
					local115--;
					local119 = local147[local115] & 0xFF;
					local115 -= local19 * local119 * 4;
					local246 = new Class3_Sub41(local147);
					@Pc(417) int local417 = 0;
					local256 = 0;
					local246.anInt2803 = local115 * -918980331;
					for (local261 = 0; local261 < local119; local261++) {
						local263 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local263 += local246.method20275();
							if (local25 == null) {
								local320 = local318;
							} else {
								local320 = local25[local318];
							}
							if (arg1 == local320) {
								local417 += local263;
								local256 = local320;
							}
						}
					}
					if (local417 == 0) {
						return true;
					}
					@Pc(473) byte[] local473 = new byte[local417];
					local417 = 0;
					local246.anInt2803 = local115 * -918980331;
					local263 = 0;
					for (local318 = 0; local318 < local119; local318++) {
						local320 = 0;
						for (@Pc(491) int local491 = 0; local491 < local19; local491++) {
							local320 += local246.method20275();
							@Pc(505) int local505;
							if (local25 == null) {
								local505 = local491;
							} else {
								local505 = local25[local491];
							}
							if (arg1 == local505) {
								System.arraycopy(local147, local263, local473, local417, local320);
								local417 += local320;
							}
							local263 += local320;
						}
					}
					local46[local256] = local473;
				} else {
					local115 = local147.length;
					local115--;
					local119 = local147[local115] & 0xFF;
					local115 -= local19 * local119 * 4;
					local246 = new Class3_Sub41(local147);
					@Pc(249) int[] local249 = new int[local19];
					local246.anInt2803 = local115 * -918980331;
					for (local256 = 0; local256 < local119; local256++) {
						local261 = 0;
						for (local263 = 0; local263 < local19; local263++) {
							local261 += local246.method20275();
							local249[local263] += local261;
						}
					}
					@Pc(286) byte[][] local286 = new byte[local19][];
					for (local261 = 0; local261 < local19; local261++) {
						local286[local261] = new byte[local249[local261]];
						local249[local261] = 0;
					}
					local246.anInt2803 = local115 * -918980331;
					local261 = 0;
					for (local263 = 0; local263 < local119; local263++) {
						local318 = 0;
						for (local320 = 0; local320 < local19; local320++) {
							local318 += local246.method20275();
							System.arraycopy(local147, local261, local286[local320], local249[local320], local318);
							local249[local320] += local318;
							local261 += local318;
						}
					}
					for (local263 = 0; local263 < local19; local263++) {
						if (local25 == null) {
							local318 = local263;
						} else {
							local318 = local25[local263];
						}
						if (this.anInt4644 * 2048546907 == 0) {
							local46[local318] = Class602.method33519(local286[local263], false);
						} else {
							local46[local318] = local286[local263];
						}
					}
				}
			} else {
				if (local25 == null) {
					local115 = 0;
				} else {
					local115 = local25[0];
				}
				if (this.anInt4644 * 2048546907 == 0) {
					local46[local115] = Class602.method33519(local147, false);
				} else {
					local46[local115] = local147;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bo", descriptor = "(II[I)Z", line = 229)
	synchronized boolean method26733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method26668(arg0)) {
			return false;
		} else if (this.anObjectArray39[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass316_2.anIntArray416[arg0];
			@Pc(25) int[] local25 = this.aClass316_2.anIntArrayArray48[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass316_2.anIntArray417[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray1[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local19; local50++) {
				@Pc(58) int local58;
				if (local25 == null) {
					local58 = local50;
				} else {
					local58 = local25[local50];
				}
				if (local46[local58] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(115) int local115;
			@Pc(119) int local119;
			@Pc(106) byte[] local106;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local106 = Class3_Sub1_Sub19.method33681(this.anObjectArray39[arg0], false);
			} else {
				local106 = Class3_Sub1_Sub19.method33681(this.anObjectArray39[arg0], true);
				@Pc(111) Class3_Sub41 local111 = new Class3_Sub41(local106);
				local115 = local111.method20269();
				local119 = local111.method20275();
				@Pc(128) int local128 = (local115 == 0 ? 5 : 9) + local119;
				local111.method20297(arg2, 5, local128);
			}
			@Pc(147) byte[] local147;
			try {
				local147 = Class494.method29319(local106);
			} catch (@Pc(149) RuntimeException local149) {
				throw Class51_Sub1.method9866(local149, (arg2 != null) + " " + arg0 + " " + local106.length + " " + Class142.method23047(local106, local106.length) + " " + Class142.method23047(local106, local106.length - 2) + " " + this.aClass316_2.anIntArray414[arg0] + " " + this.aClass316_2.anInt4546 * -2109054283);
			}
			if (this.aBoolean723) {
				this.anObjectArray39[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(256) int local256;
				@Pc(261) int local261;
				@Pc(263) int local263;
				@Pc(318) int local318;
				@Pc(320) int local320;
				@Pc(246) Class3_Sub41 local246;
				if (this.anInt4644 * 2048546907 == 2) {
					local115 = local147.length;
					local115--;
					local119 = local147[local115] & 0xFF;
					local115 -= local19 * local119 * 4;
					local246 = new Class3_Sub41(local147);
					@Pc(417) int local417 = 0;
					local256 = 0;
					local246.anInt2803 = local115 * -918980331;
					for (local261 = 0; local261 < local119; local261++) {
						local263 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local263 += local246.method20275();
							if (local25 == null) {
								local320 = local318;
							} else {
								local320 = local25[local318];
							}
							if (arg1 == local320) {
								local417 += local263;
								local256 = local320;
							}
						}
					}
					if (local417 == 0) {
						return true;
					}
					@Pc(473) byte[] local473 = new byte[local417];
					local417 = 0;
					local246.anInt2803 = local115 * -918980331;
					local263 = 0;
					for (local318 = 0; local318 < local119; local318++) {
						local320 = 0;
						for (@Pc(491) int local491 = 0; local491 < local19; local491++) {
							local320 += local246.method20275();
							@Pc(505) int local505;
							if (local25 == null) {
								local505 = local491;
							} else {
								local505 = local25[local491];
							}
							if (arg1 == local505) {
								System.arraycopy(local147, local263, local473, local417, local320);
								local417 += local320;
							}
							local263 += local320;
						}
					}
					local46[local256] = local473;
				} else {
					local115 = local147.length;
					local115--;
					local119 = local147[local115] & 0xFF;
					local115 -= local19 * local119 * 4;
					local246 = new Class3_Sub41(local147);
					@Pc(249) int[] local249 = new int[local19];
					local246.anInt2803 = local115 * -918980331;
					for (local256 = 0; local256 < local119; local256++) {
						local261 = 0;
						for (local263 = 0; local263 < local19; local263++) {
							local261 += local246.method20275();
							local249[local263] += local261;
						}
					}
					@Pc(286) byte[][] local286 = new byte[local19][];
					for (local261 = 0; local261 < local19; local261++) {
						local286[local261] = new byte[local249[local261]];
						local249[local261] = 0;
					}
					local246.anInt2803 = local115 * -918980331;
					local261 = 0;
					for (local263 = 0; local263 < local119; local263++) {
						local318 = 0;
						for (local320 = 0; local320 < local19; local320++) {
							local318 += local246.method20275();
							System.arraycopy(local147, local261, local286[local320], local249[local320], local318);
							local249[local320] += local318;
							local261 += local318;
						}
					}
					for (local263 = 0; local263 < local19; local263++) {
						if (local25 == null) {
							local318 = local263;
						} else {
							local318 = local25[local263];
						}
						if (this.anInt4644 * 2048546907 == 0) {
							local46[local318] = Class602.method33519(local286[local263], false);
						} else {
							local46[local318] = local286[local263];
						}
					}
				}
			} else {
				if (local25 == null) {
					local115 = 0;
				} else {
					local115 = local25[0];
				}
				if (this.anInt4644 * 2048546907 == 0) {
					local46[local115] = Class602.method33519(local147, false);
				} else {
					local46[local115] = local147;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ny", name = "o", descriptor = "(Ljava/lang/String;I)I", line = 357)
	public int method26687(@OriginalArg(0) String arg0) {
		if (this.method26666()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
			return this.method26668(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bc", descriptor = "(Ljava/lang/String;)I", line = 357)
	public int method26734(@OriginalArg(0) String arg0) {
		if (this.method26666()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
			return this.method26668(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bn", descriptor = "(Ljava/lang/String;)I", line = 357)
	public int method26735(@OriginalArg(0) String arg0) {
		if (this.method26666()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
			return this.method26668(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ny", name = "be", descriptor = "(I)I", line = 365)
	public int method26700(@OriginalArg(0) int arg0) {
		if (this.method26666()) {
			@Pc(12) int local12 = this.aClass316_2.aClass209_1.method24234(arg0);
			return this.method26668(local12) ? local12 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ny", name = "i", descriptor = "(II)I", line = 365)
	public int method26718(@OriginalArg(0) int arg0) {
		if (this.method26666()) {
			@Pc(12) int local12 = this.aClass316_2.aClass209_1.method24234(arg0);
			return this.method26668(local12) ? local12 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bx", descriptor = "(I)I", line = 365)
	public int method26737(@OriginalArg(0) int arg0) {
		if (this.method26666()) {
			@Pc(12) int local12 = this.aClass316_2.aClass209_1.method24234(arg0);
			return this.method26668(local12) ? local12 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bh", descriptor = "(I)I", line = 365)
	public int method26738(@OriginalArg(0) int arg0) {
		if (this.method26666()) {
			@Pc(12) int local12 = this.aClass316_2.aClass209_1.method24234(arg0);
			return this.method26668(local12) ? local12 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bj", descriptor = "(I)I", line = 365)
	public int method26739(@OriginalArg(0) int arg0) {
		if (this.method26666()) {
			@Pc(12) int local12 = this.aClass316_2.aClass209_1.method24234(arg0);
			return this.method26668(local12) ? local12 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ny", name = "f", descriptor = "(Ljava/lang/String;B)Z", line = 372)
	public boolean method26681(@OriginalArg(0) String arg0) {
		if (this.method26666()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bq", descriptor = "(Ljava/lang/String;)Z", line = 372)
	public boolean method26688(@OriginalArg(0) String arg0) {
		if (this.method26666()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "k", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 380)
	public boolean method26690(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method26666()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass316_2.aClass209Array1[local20].method24234(Class415.method27769(local11));
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bv", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 380)
	public boolean method26741(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method26666()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass316_2.aClass209Array1[local20].method24234(Class415.method27769(local11));
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!ny", name = "ck", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B", line = 391)
	public synchronized byte[] method26667(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method26666()) {
			return null;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
		if (this.method26668(local20)) {
			@Pc(38) int local38 = this.aClass316_2.aClass209Array1[local20].method24234(Class415.method27769(local11));
			return this.method26713(local20, local38);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ny", name = "at", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B", line = 391)
	public synchronized byte[] method26691(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method26666()) {
			return null;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
		if (this.method26668(local20)) {
			@Pc(38) int local38 = this.aClass316_2.aClass209Array1[local20].method24234(Class415.method27769(local11));
			return this.method26713(local20, local38);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ny", name = "bz", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B", line = 391)
	public synchronized byte[] method26742(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method26666()) {
			return null;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
		if (this.method26668(local20)) {
			@Pc(38) int local38 = this.aClass316_2.aClass209Array1[local20].method24234(Class415.method27769(local11));
			return this.method26713(local20, local38);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ny", name = "af", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 401)
	boolean method26692(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method26666()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
		if (this.method26668(local20)) {
			@Pc(38) int local38 = this.aClass316_2.aClass209Array1[local20].method24234(Class415.method27769(local11));
			return this.method26673(local20, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "cm", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 401)
	boolean method26693(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method26666()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
		if (this.method26668(local20)) {
			@Pc(38) int local38 = this.aClass316_2.aClass209Array1[local20].method24234(Class415.method27769(local11));
			return this.method26673(local20, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "ak", descriptor = "(Ljava/lang/String;I)Z", line = 411)
	public boolean method26712(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method26687("");
		return local4 == -1 ? this.method26692(arg0, "") : this.method26692("", arg0);
	}

	@OriginalMember(owner = "client!ny", name = "cj", descriptor = "(Ljava/lang/String;)Z", line = 411)
	public boolean method26744(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method26687("");
		return local4 == -1 ? this.method26692(arg0, "") : this.method26692("", arg0);
	}

	@OriginalMember(owner = "client!ny", name = "cu", descriptor = "(Ljava/lang/String;)Z", line = 411)
	public boolean method26745(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method26687("");
		return local4 == -1 ? this.method26692(arg0, "") : this.method26692("", arg0);
	}

	@OriginalMember(owner = "client!ny", name = "cv", descriptor = "(Ljava/lang/String;)Z", line = 411)
	public boolean method26746(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method26687("");
		return local4 == -1 ? this.method26692(arg0, "") : this.method26692("", arg0);
	}

	@OriginalMember(owner = "client!ny", name = "cq", descriptor = "(Ljava/lang/String;)Z", line = 417)
	public boolean method26665(@OriginalArg(0) String arg0) {
		if (this.method26666()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
			return this.method26675(local17);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "cl", descriptor = "(Ljava/lang/String;)Z", line = 417)
	public boolean method26678(@OriginalArg(0) String arg0) {
		if (this.method26666()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
			return this.method26675(local17);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "aa", descriptor = "(Ljava/lang/String;B)Z", line = 417)
	public boolean method26694(@OriginalArg(0) String arg0) {
		if (this.method26666()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
			return this.method26675(local17);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "cg", descriptor = "(Ljava/lang/String;)Z", line = 417)
	public boolean method26736(@OriginalArg(0) String arg0) {
		if (this.method26666()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
			return this.method26675(local17);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ny", name = "ah", descriptor = "(Ljava/lang/String;I)I", line = 424)
	public int method26689(@OriginalArg(0) String arg0) {
		if (this.method26666()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
			return this.method26679(local17);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ny", name = "cc", descriptor = "(Ljava/lang/String;)I", line = 424)
	public int method26719(@OriginalArg(0) String arg0) {
		if (this.method26666()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
			return this.method26679(local17);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ny", name = "cp", descriptor = "(Ljava/lang/String;)I", line = 424)
	public int method26750(@OriginalArg(0) String arg0) {
		if (this.method26666()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass316_2.aClass209_1.method24234(Class415.method27769(local8));
			return this.method26679(local17);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ny", name = "cs", descriptor = "([B)[B", line = 431)
	static final byte[] method26752(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		@Pc(8) int local8 = local4.method20269();
		@Pc(12) int local12 = local4.method20275();
		if (local12 < 0 || anInt4641 * -652341339 != 0 && local12 > anInt4641 * -652341339) {
			throw new RuntimeException();
		} else if (local8 == 0) {
			@Pc(34) byte[] local34 = new byte[local12];
			local4.method20286(local34, 0, local12);
			return local34;
		} else {
			@Pc(46) int local46 = local4.method20275();
			if (local46 < 0 || anInt4641 * -652341339 != 0 && local46 > anInt4641 * -652341339) {
				throw new RuntimeException();
			}
			@Pc(64) byte[] local64 = new byte[local46];
			if (local8 == 1) {
				Class562.method32867(local64, local46, arg0, local12, 9);
			} else {
				@Pc(78) Class622 local78 = aClass622_1;
				synchronized (aClass622_1) {
					aClass622_1.method33762(local4, local64);
				}
			}
			return local64;
		}
	}

	@OriginalMember(owner = "client!ny", name = "ct", descriptor = "([B)[B", line = 431)
	static final byte[] method26753(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		@Pc(8) int local8 = local4.method20269();
		@Pc(12) int local12 = local4.method20275();
		if (local12 < 0 || anInt4641 * -652341339 != 0 && local12 > anInt4641 * -652341339) {
			throw new RuntimeException();
		} else if (local8 == 0) {
			@Pc(34) byte[] local34 = new byte[local12];
			local4.method20286(local34, 0, local12);
			return local34;
		} else {
			@Pc(46) int local46 = local4.method20275();
			if (local46 < 0 || anInt4641 * -652341339 != 0 && local46 > anInt4641 * -652341339) {
				throw new RuntimeException();
			}
			@Pc(64) byte[] local64 = new byte[local46];
			if (local8 == 1) {
				Class562.method32867(local64, local46, arg0, local12, 9);
			} else {
				@Pc(78) Class622 local78 = aClass622_1;
				synchronized (aClass622_1) {
					aClass622_1.method33762(local4, local64);
				}
			}
			return local64;
		}
	}

	@OriginalMember(owner = "client!ny", name = "cx", descriptor = "([B)[B", line = 431)
	static final byte[] method26754(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		@Pc(8) int local8 = local4.method20269();
		@Pc(12) int local12 = local4.method20275();
		if (local12 < 0 || anInt4641 * -652341339 != 0 && local12 > anInt4641 * -652341339) {
			throw new RuntimeException();
		} else if (local8 == 0) {
			@Pc(34) byte[] local34 = new byte[local12];
			local4.method20286(local34, 0, local12);
			return local34;
		} else {
			@Pc(46) int local46 = local4.method20275();
			if (local46 < 0 || anInt4641 * -652341339 != 0 && local46 > anInt4641 * -652341339) {
				throw new RuntimeException();
			}
			@Pc(64) byte[] local64 = new byte[local46];
			if (local8 == 1) {
				Class562.method32867(local64, local46, arg0, local12, 9);
			} else {
				@Pc(78) Class622 local78 = aClass622_1;
				synchronized (aClass622_1) {
					aClass622_1.method33762(local4, local64);
				}
			}
			return local64;
		}
	}

	@OriginalMember(owner = "client!ny", name = "cy", descriptor = "([B)[B", line = 431)
	static final byte[] method26755(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class3_Sub41 local4 = new Class3_Sub41(arg0);
		@Pc(8) int local8 = local4.method20269();
		@Pc(12) int local12 = local4.method20275();
		if (local12 < 0 || anInt4641 * -652341339 != 0 && local12 > anInt4641 * -652341339) {
			throw new RuntimeException();
		} else if (local8 == 0) {
			@Pc(34) byte[] local34 = new byte[local12];
			local4.method20286(local34, 0, local12);
			return local34;
		} else {
			@Pc(46) int local46 = local4.method20275();
			if (local46 < 0 || anInt4641 * -652341339 != 0 && local46 > anInt4641 * -652341339) {
				throw new RuntimeException();
			}
			@Pc(64) byte[] local64 = new byte[local46];
			if (local8 == 1) {
				Class562.method32867(local64, local46, arg0, local12, 9);
			} else {
				@Pc(78) Class622 local78 = aClass622_1;
				synchronized (aClass622_1) {
					aClass622_1.method33762(local4, local64);
				}
			}
			return local64;
		}
	}

	@OriginalMember(owner = "client!ny", name = "f", descriptor = "(II)Z", line = 874)
	public static boolean method26756(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class3_Sub1_Sub7 local4 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32768(); local4 != null; local4 = (Class3_Sub1_Sub7) Class250.aClass553_52.method32709()) {
			if (Class314.method25830(local4.anInt2664 * 296027207) && (long) arg0 == local4.aLong154 * -8018265419264301651L) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ny", name = "dv", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 4576)
	static final void method26760(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3574 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * 1101309159;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!ny", name = "gz", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5204)
	static final void method26757(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg2.anIntArray496[arg2.anInt5319 * 960738381];
		@Pc(24) short local24 = (short) arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1];
		@Pc(35) short local35 = (short) arg2.anIntArray496[arg2.anInt5319 * 960738381 + 2];
		if (local13 < 0 || local13 >= 5) {
			return;
		}
		arg0.method23463(local13, local24, local35);
		Class223.method24442(arg0);
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class130.method22889(arg0.anInt3570 * 954808515, local13);
		}
	}

	@OriginalMember(owner = "client!ny", name = "jo", descriptor = "(Lclient!vs;B)V", line = 5719)
	static final void method26759(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class634.method33901(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ny", name = "vt", descriptor = "(Lclient!vs;I)V", line = 7878)
	static final void method26761(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(24) Class464 local24;
		if (local12 < Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2362 * -162520433 && local12 >= 0) {
			@Pc(28) byte local28 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101;
			@Pc(32) Class464 local32 = client.aClass370_1.method26942();
			@Pc(42) int local42 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray241[local12] + local32.anInt5071 * -1567811631;
			@Pc(52) int local52 = local32.anInt5073 * 1360175441 + Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[local12];
			local24 = new Class464(local28, local42, local52);
		} else {
			local24 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16663();
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local24.method28625();
	}

	@OriginalMember(owner = "client!ny", name = "arp", descriptor = "(Lclient!vs;I)V", line = 12056)
	static final void method26758(@OriginalArg(0) Class536 arg0) {
		Class451.method28392();
	}
}
