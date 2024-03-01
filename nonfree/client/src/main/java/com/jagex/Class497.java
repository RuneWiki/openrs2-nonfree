package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!py")
public final class Class497 {

	@OriginalMember(owner = "client!py", name = "w", descriptor = "I")
	static final int anInt5171 = 0;

	@OriginalMember(owner = "client!py", name = "u", descriptor = "I")
	static final int anInt5172 = 2;

	@OriginalMember(owner = "client!py", name = "l", descriptor = "I")
	public static final int anInt5173 = 1;

	@OriginalMember(owner = "client!py", name = "k", descriptor = "Lclient!adv;")
	static Class91 aClass91_1 = new Class91();

	@OriginalMember(owner = "client!py", name = "d", descriptor = "Z")
	static boolean aBoolean783 = false;

	@OriginalMember(owner = "client!py", name = "c", descriptor = "I")
	static int anInt5175 = 0;

	@OriginalMember(owner = "client!py", name = "m", descriptor = "[[Ljava/lang/Object;")
	Object[][] anObjectArrayArray3;

	@OriginalMember(owner = "client!py", name = "n", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray43;

	@OriginalMember(owner = "client!py", name = "e", descriptor = "Lclient!pl;")
	Class486 aClass486_2 = null;

	@OriginalMember(owner = "client!py", name = "p", descriptor = "Lclient!po;")
	Class143 aClass143_1;

	@OriginalMember(owner = "client!py", name = "f", descriptor = "Z")
	boolean aBoolean784;

	@OriginalMember(owner = "client!py", name = "z", descriptor = "I")
	int anInt5174;

	@OriginalMember(owner = "client!py", name = "<init>", descriptor = "(Lclient!po;ZI)V", line = 24)
	public Class497(@OriginalArg(0) Class143 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("");
		}
		this.aClass143_1 = arg0;
		this.aBoolean784 = arg1;
		this.anInt5174 = arg2 * 114349921;
	}

	@OriginalMember(owner = "client!py", name = "at", descriptor = "()Z", line = 32)
	synchronized boolean method30093() {
		if (this.aClass486_2 == null) {
			this.aClass486_2 = this.aClass143_1.method11050();
			if (this.aClass486_2 == null) {
				return false;
			}
			this.anObjectArray43 = new Object[this.aClass486_2.anInt5148 * 1408935145];
			this.anObjectArrayArray3 = new Object[this.aClass486_2.anInt5148 * 1408935145][];
		}
		return true;
	}

	@OriginalMember(owner = "client!py", name = "aw", descriptor = "()Z", line = 32)
	synchronized boolean method30109() {
		if (this.aClass486_2 == null) {
			this.aClass486_2 = this.aClass143_1.method11050();
			if (this.aClass486_2 == null) {
				return false;
			}
			this.anObjectArray43 = new Object[this.aClass486_2.anInt5148 * 1408935145];
			this.anObjectArrayArray3 = new Object[this.aClass486_2.anInt5148 * 1408935145][];
		}
		return true;
	}

	@OriginalMember(owner = "client!py", name = "e", descriptor = "(B)Z", line = 32)
	synchronized boolean method30111() {
		if (this.aClass486_2 == null) {
			this.aClass486_2 = this.aClass143_1.method11050();
			if (this.aClass486_2 == null) {
				return false;
			}
			this.anObjectArray43 = new Object[this.aClass486_2.anInt5148 * 1408935145];
			this.anObjectArrayArray3 = new Object[this.aClass486_2.anInt5148 * 1408935145][];
		}
		return true;
	}

	@OriginalMember(owner = "client!py", name = "as", descriptor = "()Z", line = 32)
	synchronized boolean method30123() {
		if (this.aClass486_2 == null) {
			this.aClass486_2 = this.aClass143_1.method11050();
			if (this.aClass486_2 == null) {
				return false;
			}
			this.anObjectArray43 = new Object[this.aClass486_2.anInt5148 * 1408935145];
			this.anObjectArrayArray3 = new Object[this.aClass486_2.anInt5148 * 1408935145][];
		}
		return true;
	}

	@OriginalMember(owner = "client!py", name = "n", descriptor = "(S)I", line = 42)
	public int method30046() {
		if (!this.method30111()) {
			throw new IllegalStateException("");
		}
		return this.aClass486_2.anInt5145 * 391791439;
	}

	@OriginalMember(owner = "client!py", name = "am", descriptor = "()I", line = 42)
	public int method30076() {
		if (!this.method30111()) {
			throw new IllegalStateException("");
		}
		return this.aClass486_2.anInt5145 * 391791439;
	}

	@OriginalMember(owner = "client!py", name = "ad", descriptor = "()I", line = 42)
	public int method30078() {
		if (!this.method30111()) {
			throw new IllegalStateException("");
		}
		return this.aClass486_2.anInt5145 * 391791439;
	}

	@OriginalMember(owner = "client!py", name = "m", descriptor = "(IB)Z", line = 47)
	synchronized boolean method30047(@OriginalArg(0) int arg0) {
		if (!this.method30111()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass486_2.anIntArray461.length && this.aClass486_2.anIntArray461[arg0] != 0) {
			return true;
		} else if (aBoolean783) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "ar", descriptor = "(I)Z", line = 47)
	synchronized boolean method30081(@OriginalArg(0) int arg0) {
		if (!this.method30111()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass486_2.anIntArray461.length && this.aClass486_2.anIntArray461[arg0] != 0) {
			return true;
		} else if (aBoolean783) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "ap", descriptor = "(I)Z", line = 47)
	synchronized boolean method30082(@OriginalArg(0) int arg0) {
		if (!this.method30111()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass486_2.anIntArray461.length && this.aClass486_2.anIntArray461[arg0] != 0) {
			return true;
		} else if (aBoolean783) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "au", descriptor = "(I)Z", line = 47)
	synchronized boolean method30090(@OriginalArg(0) int arg0) {
		if (!this.method30111()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass486_2.anIntArray461.length && this.aClass486_2.anIntArray461[arg0] != 0) {
			return true;
		} else if (aBoolean783) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "k", descriptor = "(IIB)Z", line = 56)
	public synchronized boolean method30048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method30111()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass486_2.anIntArray461.length && arg1 < this.aClass486_2.anIntArray461[arg0]) {
			return true;
		} else if (aBoolean783) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "av", descriptor = "(II)Z", line = 56)
	public synchronized boolean method30072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method30111()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass486_2.anIntArray461.length && arg1 < this.aClass486_2.anIntArray461[arg0]) {
			return true;
		} else if (aBoolean783) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "aq", descriptor = "(II)Z", line = 56)
	public synchronized boolean method30083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method30111()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass486_2.anIntArray461.length && arg1 < this.aClass486_2.anIntArray461[arg0]) {
			return true;
		} else if (aBoolean783) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "ax", descriptor = "(II)Z", line = 56)
	public synchronized boolean method30084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method30111()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass486_2.anIntArray461.length && arg1 < this.aClass486_2.anIntArray461[arg0]) {
			return true;
		} else if (aBoolean783) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "ao", descriptor = "(I)V", line = 67)
	synchronized void method30095(@OriginalArg(0) int arg0) {
		if (this.aBoolean784) {
			this.anObjectArray43[arg0] = this.aClass143_1.method11051(arg0);
		} else {
			this.anObjectArray43[arg0] = Class113.method7411(this.aClass143_1.method11051(arg0), false);
		}
	}

	@OriginalMember(owner = "client!py", name = "f", descriptor = "(II)V", line = 67)
	synchronized void method30122(@OriginalArg(0) int arg0) {
		if (this.aBoolean784) {
			this.anObjectArray43[arg0] = this.aClass143_1.method11051(arg0);
		} else {
			this.anObjectArray43[arg0] = Class113.method7411(this.aClass143_1.method11051(arg0), false);
		}
	}

	@OriginalMember(owner = "client!py", name = "w", descriptor = "(II)V", line = 72)
	public void method30050(@OriginalArg(0) int arg0) {
		this.aClass143_1.method11053(arg0);
	}

	@OriginalMember(owner = "client!py", name = "aj", descriptor = "(I)V", line = 72)
	public void method30052(@OriginalArg(0) int arg0) {
		this.aClass143_1.method11053(arg0);
	}

	@OriginalMember(owner = "client!py", name = "ay", descriptor = "(I)V", line = 72)
	public void method30088(@OriginalArg(0) int arg0) {
		this.aClass143_1.method11053(arg0);
	}

	@OriginalMember(owner = "client!py", name = "l", descriptor = "(IIB)[B", line = 76)
	public byte[] method30044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method30079(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!py", name = "az", descriptor = "(II)[B", line = 76)
	public byte[] method30074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method30079(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!py", name = "ab", descriptor = "(II)[B", line = 76)
	public byte[] method30089(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method30079(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!py", name = "u", descriptor = "(II[IB)[B", line = 80)
	public synchronized byte[] method30079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method30048(arg0, arg1)) {
			return null;
		}
		@Pc(9) byte[] local9 = null;
		if (this.anObjectArrayArray3[arg0] == null || this.anObjectArrayArray3[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method30066(arg0, arg1, arg2);
			if (!local30) {
				this.method30122(arg0);
				local30 = this.method30066(arg0, arg1, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		if (this.anObjectArrayArray3[arg0] == null) {
			throw new RuntimeException("");
		}
		if (this.anObjectArrayArray3[arg0][arg1] != null) {
			local9 = Class331.method27386(this.anObjectArrayArray3[arg0][arg1], false);
			if (local9 == null) {
				throw new RuntimeException("");
			}
		}
		if (local9 != null) {
			if (this.anInt5174 * -2037379935 == 1) {
				this.anObjectArrayArray3[arg0][arg1] = null;
				if (this.aClass486_2.anIntArray461[arg0] == 1) {
					this.anObjectArrayArray3[arg0] = null;
				}
			} else if (this.anInt5174 * -2037379935 == 2) {
				this.anObjectArrayArray3[arg0] = null;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!py", name = "aa", descriptor = "(II[I)[B", line = 80)
	public synchronized byte[] method30091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method30048(arg0, arg1)) {
			return null;
		}
		@Pc(9) byte[] local9 = null;
		if (this.anObjectArrayArray3[arg0] == null || this.anObjectArrayArray3[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method30066(arg0, arg1, arg2);
			if (!local30) {
				this.method30122(arg0);
				local30 = this.method30066(arg0, arg1, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		if (this.anObjectArrayArray3[arg0] == null) {
			throw new RuntimeException("");
		}
		if (this.anObjectArrayArray3[arg0][arg1] != null) {
			local9 = Class331.method27386(this.anObjectArrayArray3[arg0][arg1], false);
			if (local9 == null) {
				throw new RuntimeException("");
			}
		}
		if (local9 != null) {
			if (this.anInt5174 * -2037379935 == 1) {
				this.anObjectArrayArray3[arg0][arg1] = null;
				if (this.aClass486_2.anIntArray461[arg0] == 1) {
					this.anObjectArrayArray3[arg0] = null;
				}
			} else if (this.anInt5174 * -2037379935 == 2) {
				this.anObjectArrayArray3[arg0] = null;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!py", name = "z", descriptor = "(III)Z", line = 117)
	public synchronized boolean method30053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method30048(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray3[arg0] != null && this.anObjectArrayArray3[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method30122(arg0);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "af", descriptor = "(II)Z", line = 117)
	public synchronized boolean method30116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method30048(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray3[arg0] != null && this.anObjectArrayArray3[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method30122(arg0);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "p", descriptor = "(II)Z", line = 126)
	public synchronized boolean method30054(@OriginalArg(0) int arg0) {
		if (!this.method30111()) {
			return false;
		} else if (this.aClass486_2.anIntArray461.length == 1) {
			return this.method30053(0, arg0);
		} else if (!this.method30047(arg0)) {
			return false;
		} else if (this.aClass486_2.anIntArray461[arg0] == 1) {
			return this.method30053(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!py", name = "ak", descriptor = "(I)Z", line = 126)
	public synchronized boolean method30055(@OriginalArg(0) int arg0) {
		if (!this.method30111()) {
			return false;
		} else if (this.aClass486_2.anIntArray461.length == 1) {
			return this.method30053(0, arg0);
		} else if (!this.method30047(arg0)) {
			return false;
		} else if (this.aClass486_2.anIntArray461[arg0] == 1) {
			return this.method30053(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!py", name = "d", descriptor = "(II)Z", line = 134)
	public synchronized boolean method30092(@OriginalArg(0) int arg0) {
		if (!this.method30047(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method30122(arg0);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "c", descriptor = "(I)Z", line = 142)
	public synchronized boolean method30061() {
		if (!this.method30111()) {
			return false;
		}
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.aClass486_2.anIntArray456.length; local9++) {
			@Pc(21) int local21 = this.aClass486_2.anIntArray456[local9];
			if (this.anObjectArray43[local21] == null) {
				this.method30122(local21);
				if (this.anObjectArray43[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!py", name = "r", descriptor = "(II)I", line = 155)
	public synchronized int method30057(@OriginalArg(0) int arg0) {
		if (this.method30047(arg0)) {
			return this.anObjectArray43[arg0] == null ? this.aClass143_1.method11052(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "an", descriptor = "(I)I", line = 155)
	public synchronized int method30101(@OriginalArg(0) int arg0) {
		if (this.method30047(arg0)) {
			return this.anObjectArray43[arg0] == null ? this.aClass143_1.method11052(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "v", descriptor = "(I)I", line = 161)
	public synchronized int method30058() {
		if (!this.method30111()) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray43.length; local11++) {
			if (this.aClass486_2.anIntArray459[local11] > 0) {
				local7 += 100;
				local9 += this.method30057(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!py", name = "bf", descriptor = "()I", line = 161)
	public synchronized int method30075() {
		if (!this.method30111()) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray43.length; local11++) {
			if (this.aClass486_2.anIntArray459[local11] > 0) {
				local7 += 100;
				local9 += this.method30057(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!py", name = "o", descriptor = "(IB)[B", line = 176)
	public synchronized byte[] method30059(@OriginalArg(0) int arg0) {
		if (!this.method30111()) {
			return null;
		} else if (this.aClass486_2.anIntArray461.length == 1) {
			return this.method30044(0, arg0);
		} else if (!this.method30047(arg0)) {
			return null;
		} else if (this.aClass486_2.anIntArray461[arg0] == 1) {
			return this.method30044(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!py", name = "s", descriptor = "(IB)[I", line = 184)
	public synchronized int[] method30060(@OriginalArg(0) int arg0) {
		if (!this.method30047(arg0)) {
			return null;
		}
		@Pc(12) int[] local12 = this.aClass486_2.anIntArrayArray58[arg0];
		if (local12 == null) {
			local12 = new int[this.aClass486_2.anIntArray459[arg0]];
			@Pc(23) int local23 = 0;
			while (local23 < local12.length) {
				local12[local23] = local23++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!py", name = "bl", descriptor = "(I)[I", line = 184)
	public synchronized int[] method30096(@OriginalArg(0) int arg0) {
		if (!this.method30047(arg0)) {
			return null;
		}
		@Pc(12) int[] local12 = this.aClass486_2.anIntArrayArray58[arg0];
		if (local12 == null) {
			local12 = new int[this.aClass486_2.anIntArray459[arg0]];
			@Pc(23) int local23 = 0;
			while (local23 < local12.length) {
				local12[local23] = local23++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!py", name = "y", descriptor = "(II)Z", line = 194)
	public boolean method30094(@OriginalArg(0) int arg0) {
		if (!this.method30111()) {
			return false;
		} else if (this.aClass486_2.anIntArray461.length == 1) {
			return this.method30048(0, arg0);
		} else if (!this.method30047(arg0)) {
			return false;
		} else if (this.aClass486_2.anIntArray461[arg0] == 1) {
			return this.method30048(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!py", name = "bk", descriptor = "(I)Z", line = 194)
	public boolean method30097(@OriginalArg(0) int arg0) {
		if (!this.method30111()) {
			return false;
		} else if (this.aClass486_2.anIntArray461.length == 1) {
			return this.method30048(0, arg0);
		} else if (!this.method30047(arg0)) {
			return false;
		} else if (this.aClass486_2.anIntArray461[arg0] == 1) {
			return this.method30048(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!py", name = "q", descriptor = "(II)I", line = 202)
	public int method30062(@OriginalArg(0) int arg0) {
		return this.method30047(arg0) ? this.aClass486_2.anIntArray461[arg0] : 0;
	}

	@OriginalMember(owner = "client!py", name = "bi", descriptor = "(I)I", line = 202)
	public int method30077(@OriginalArg(0) int arg0) {
		return this.method30047(arg0) ? this.aClass486_2.anIntArray461[arg0] : 0;
	}

	@OriginalMember(owner = "client!py", name = "bc", descriptor = "(I)I", line = 202)
	public int method30087(@OriginalArg(0) int arg0) {
		return this.method30047(arg0) ? this.aClass486_2.anIntArray461[arg0] : 0;
	}

	@OriginalMember(owner = "client!py", name = "bh", descriptor = "(I)I", line = 202)
	public int method30098(@OriginalArg(0) int arg0) {
		return this.method30047(arg0) ? this.aClass486_2.anIntArray461[arg0] : 0;
	}

	@OriginalMember(owner = "client!py", name = "bx", descriptor = "(I)I", line = 202)
	public int method30099(@OriginalArg(0) int arg0) {
		return this.method30047(arg0) ? this.aClass486_2.anIntArray461[arg0] : 0;
	}

	@OriginalMember(owner = "client!py", name = "bd", descriptor = "(I)I", line = 202)
	public int method30100(@OriginalArg(0) int arg0) {
		return this.method30047(arg0) ? this.aClass486_2.anIntArray461[arg0] : 0;
	}

	@OriginalMember(owner = "client!py", name = "x", descriptor = "(B)I", line = 207)
	public int method30063() {
		return this.method30111() ? this.aClass486_2.anIntArray461.length : -1;
	}

	@OriginalMember(owner = "client!py", name = "bn", descriptor = "()I", line = 207)
	public int method30080() {
		return this.method30111() ? this.aClass486_2.anIntArray461.length : -1;
	}

	@OriginalMember(owner = "client!py", name = "b", descriptor = "(II)V", line = 212)
	public synchronized void method30064(@OriginalArg(0) int arg0) {
		if (this.method30047(arg0) && this.anObjectArrayArray3 != null) {
			this.anObjectArrayArray3[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!py", name = "bt", descriptor = "(I)V", line = 212)
	public synchronized void method30104(@OriginalArg(0) int arg0) {
		if (this.method30047(arg0) && this.anObjectArrayArray3 != null) {
			this.anObjectArrayArray3[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!py", name = "h", descriptor = "(ZZB)V", line = 217)
	public void method30065(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!this.method30111()) {
			return;
		}
		if (arg0) {
			this.aClass486_2.anIntArray454 = null;
			this.aClass486_2.aClass348_1 = null;
		}
		if (arg1) {
			this.aClass486_2.anIntArrayArray59 = null;
			this.aClass486_2.aClass348Array1 = null;
		}
	}

	@OriginalMember(owner = "client!py", name = "bq", descriptor = "(ZZ)V", line = 217)
	public void method30105(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!this.method30111()) {
			return;
		}
		if (arg0) {
			this.aClass486_2.anIntArray454 = null;
			this.aClass486_2.aClass348_1 = null;
		}
		if (arg1) {
			this.aClass486_2.anIntArrayArray59 = null;
			this.aClass486_2.aClass348Array1 = null;
		}
	}

	@OriginalMember(owner = "client!py", name = "bm", descriptor = "(ZZ)V", line = 217)
	public void method30106(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!this.method30111()) {
			return;
		}
		if (arg0) {
			this.aClass486_2.anIntArray454 = null;
			this.aClass486_2.aClass348_1 = null;
		}
		if (arg1) {
			this.aClass486_2.anIntArrayArray59 = null;
			this.aClass486_2.aClass348Array1 = null;
		}
	}

	@OriginalMember(owner = "client!py", name = "bb", descriptor = "(ZZ)V", line = 217)
	public void method30107(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!this.method30111()) {
			return;
		}
		if (arg0) {
			this.aClass486_2.anIntArray454 = null;
			this.aClass486_2.aClass348_1 = null;
		}
		if (arg1) {
			this.aClass486_2.anIntArrayArray59 = null;
			this.aClass486_2.aClass348Array1 = null;
		}
	}

	@OriginalMember(owner = "client!py", name = "bu", descriptor = "(II[I)Z", line = 229)
	synchronized boolean method30049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method30047(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass486_2.anIntArray459[arg0];
			@Pc(25) int[] local25 = this.aClass486_2.anIntArrayArray58[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass486_2.anIntArray461[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
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
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class331.method27386(this.anObjectArray43[arg0], false);
			} else {
				local104 = Class331.method27386(this.anObjectArray43[arg0], true);
				@Pc(109) Class93_Sub41 local109 = new Class93_Sub41(local104);
				local113 = local109.method22413();
				local117 = local109.method22419();
				@Pc(127) int local127 = (local113 == Class484.aClass484_5.method36920() ? 5 : 9) + local117;
				local109.method22442(arg2, 5, local127);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class506.method30222(local104);
			} catch (@Pc(148) RuntimeException local148) {
				throw RuntimeException_Sub2.method23530(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class154.method14146(local104, local104.length) + " " + Class154.method14146(local104, local104.length - 2) + " " + this.aClass486_2.anIntArray455[arg0] + " " + this.aClass486_2.anInt5145 * 391791439);
			}
			if (this.aBoolean784) {
				this.anObjectArray43[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class93_Sub41 local244;
				if (this.anInt5174 * -2037379935 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local19 * 4;
					local244 = new Class93_Sub41(local146);
					@Pc(416) int local416 = 0;
					local254 = 0;
					local244.anInt3070 = local113 * -1445626955;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local19; local316++) {
							local261 += local244.method22419();
							if (local25 == null) {
								local318 = local316;
							} else {
								local318 = local25[local316];
							}
							if (arg1 == local318) {
								local416 += local261;
								local254 = local318;
							}
						}
					}
					if (local416 == 0) {
						return true;
					}
					@Pc(471) byte[] local471 = new byte[local416];
					local416 = 0;
					local244.anInt3070 = local113 * -1445626955;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(489) int local489 = 0; local489 < local19; local489++) {
							local318 += local244.method22419();
							@Pc(503) int local503;
							if (local25 == null) {
								local503 = local489;
							} else {
								local503 = local25[local489];
							}
							if (arg1 == local503) {
								System.arraycopy(local146, local261, local471, local416, local318);
								local416 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local471;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * 4 * local19;
					local244 = new Class93_Sub41(local146);
					@Pc(247) int[] local247 = new int[local19];
					local244.anInt3070 = local113 * -1445626955;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local19; local261++) {
							local259 += local244.method22419();
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local19][];
					for (local259 = 0; local259 < local19; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3070 = local113 * -1445626955;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local316 += local244.method22419();
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local19; local261++) {
						if (local25 == null) {
							local316 = local261;
						} else {
							local316 = local25[local261];
						}
						if (this.anInt5174 * -2037379935 == 0) {
							local46[local316] = Class113.method7411(local284[local261], false);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local25 == null) {
					local113 = 0;
				} else {
					local113 = local25[0];
				}
				if (this.anInt5174 * -2037379935 == 0) {
					local46[local113] = Class113.method7411(local146, false);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "a", descriptor = "(II[IB)Z", line = 229)
	synchronized boolean method30066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method30047(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass486_2.anIntArray459[arg0];
			@Pc(25) int[] local25 = this.aClass486_2.anIntArrayArray58[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass486_2.anIntArray461[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
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
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class331.method27386(this.anObjectArray43[arg0], false);
			} else {
				local104 = Class331.method27386(this.anObjectArray43[arg0], true);
				@Pc(109) Class93_Sub41 local109 = new Class93_Sub41(local104);
				local113 = local109.method22413();
				local117 = local109.method22419();
				@Pc(127) int local127 = (local113 == Class484.aClass484_5.method36920() ? 5 : 9) + local117;
				local109.method22442(arg2, 5, local127);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class506.method30222(local104);
			} catch (@Pc(148) RuntimeException local148) {
				throw RuntimeException_Sub2.method23530(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class154.method14146(local104, local104.length) + " " + Class154.method14146(local104, local104.length - 2) + " " + this.aClass486_2.anIntArray455[arg0] + " " + this.aClass486_2.anInt5145 * 391791439);
			}
			if (this.aBoolean784) {
				this.anObjectArray43[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class93_Sub41 local244;
				if (this.anInt5174 * -2037379935 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local19 * 4;
					local244 = new Class93_Sub41(local146);
					@Pc(416) int local416 = 0;
					local254 = 0;
					local244.anInt3070 = local113 * -1445626955;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local19; local316++) {
							local261 += local244.method22419();
							if (local25 == null) {
								local318 = local316;
							} else {
								local318 = local25[local316];
							}
							if (arg1 == local318) {
								local416 += local261;
								local254 = local318;
							}
						}
					}
					if (local416 == 0) {
						return true;
					}
					@Pc(471) byte[] local471 = new byte[local416];
					local416 = 0;
					local244.anInt3070 = local113 * -1445626955;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(489) int local489 = 0; local489 < local19; local489++) {
							local318 += local244.method22419();
							@Pc(503) int local503;
							if (local25 == null) {
								local503 = local489;
							} else {
								local503 = local25[local489];
							}
							if (arg1 == local503) {
								System.arraycopy(local146, local261, local471, local416, local318);
								local416 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local471;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * 4 * local19;
					local244 = new Class93_Sub41(local146);
					@Pc(247) int[] local247 = new int[local19];
					local244.anInt3070 = local113 * -1445626955;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local19; local261++) {
							local259 += local244.method22419();
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local19][];
					for (local259 = 0; local259 < local19; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3070 = local113 * -1445626955;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local316 += local244.method22419();
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local19; local261++) {
						if (local25 == null) {
							local316 = local261;
						} else {
							local316 = local25[local261];
						}
						if (this.anInt5174 * -2037379935 == 0) {
							local46[local316] = Class113.method7411(local284[local261], false);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local25 == null) {
					local113 = 0;
				} else {
					local113 = local25[0];
				}
				if (this.anInt5174 * -2037379935 == 0) {
					local46[local113] = Class113.method7411(local146, false);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "by", descriptor = "(II[I)Z", line = 229)
	synchronized boolean method30102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method30047(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass486_2.anIntArray459[arg0];
			@Pc(25) int[] local25 = this.aClass486_2.anIntArrayArray58[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass486_2.anIntArray461[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
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
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class331.method27386(this.anObjectArray43[arg0], false);
			} else {
				local104 = Class331.method27386(this.anObjectArray43[arg0], true);
				@Pc(109) Class93_Sub41 local109 = new Class93_Sub41(local104);
				local113 = local109.method22413();
				local117 = local109.method22419();
				@Pc(127) int local127 = (local113 == Class484.aClass484_5.method36920() ? 5 : 9) + local117;
				local109.method22442(arg2, 5, local127);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class506.method30222(local104);
			} catch (@Pc(148) RuntimeException local148) {
				throw RuntimeException_Sub2.method23530(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class154.method14146(local104, local104.length) + " " + Class154.method14146(local104, local104.length - 2) + " " + this.aClass486_2.anIntArray455[arg0] + " " + this.aClass486_2.anInt5145 * 391791439);
			}
			if (this.aBoolean784) {
				this.anObjectArray43[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class93_Sub41 local244;
				if (this.anInt5174 * -2037379935 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local19 * 4;
					local244 = new Class93_Sub41(local146);
					@Pc(416) int local416 = 0;
					local254 = 0;
					local244.anInt3070 = local113 * -1445626955;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local19; local316++) {
							local261 += local244.method22419();
							if (local25 == null) {
								local318 = local316;
							} else {
								local318 = local25[local316];
							}
							if (arg1 == local318) {
								local416 += local261;
								local254 = local318;
							}
						}
					}
					if (local416 == 0) {
						return true;
					}
					@Pc(471) byte[] local471 = new byte[local416];
					local416 = 0;
					local244.anInt3070 = local113 * -1445626955;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(489) int local489 = 0; local489 < local19; local489++) {
							local318 += local244.method22419();
							@Pc(503) int local503;
							if (local25 == null) {
								local503 = local489;
							} else {
								local503 = local25[local489];
							}
							if (arg1 == local503) {
								System.arraycopy(local146, local261, local471, local416, local318);
								local416 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local471;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * 4 * local19;
					local244 = new Class93_Sub41(local146);
					@Pc(247) int[] local247 = new int[local19];
					local244.anInt3070 = local113 * -1445626955;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local19; local261++) {
							local259 += local244.method22419();
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local19][];
					for (local259 = 0; local259 < local19; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3070 = local113 * -1445626955;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local316 += local244.method22419();
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local19; local261++) {
						if (local25 == null) {
							local316 = local261;
						} else {
							local316 = local25[local261];
						}
						if (this.anInt5174 * -2037379935 == 0) {
							local46[local316] = Class113.method7411(local284[local261], false);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local25 == null) {
					local113 = 0;
				} else {
					local113 = local25[0];
				}
				if (this.anInt5174 * -2037379935 == 0) {
					local46[local113] = Class113.method7411(local146, false);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "be", descriptor = "(II[I)Z", line = 229)
	synchronized boolean method30108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method30047(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass486_2.anIntArray459[arg0];
			@Pc(25) int[] local25 = this.aClass486_2.anIntArrayArray58[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass486_2.anIntArray461[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
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
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class331.method27386(this.anObjectArray43[arg0], false);
			} else {
				local104 = Class331.method27386(this.anObjectArray43[arg0], true);
				@Pc(109) Class93_Sub41 local109 = new Class93_Sub41(local104);
				local113 = local109.method22413();
				local117 = local109.method22419();
				@Pc(127) int local127 = (local113 == Class484.aClass484_5.method36920() ? 5 : 9) + local117;
				local109.method22442(arg2, 5, local127);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class506.method30222(local104);
			} catch (@Pc(148) RuntimeException local148) {
				throw RuntimeException_Sub2.method23530(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class154.method14146(local104, local104.length) + " " + Class154.method14146(local104, local104.length - 2) + " " + this.aClass486_2.anIntArray455[arg0] + " " + this.aClass486_2.anInt5145 * 391791439);
			}
			if (this.aBoolean784) {
				this.anObjectArray43[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class93_Sub41 local244;
				if (this.anInt5174 * -2037379935 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local19 * 4;
					local244 = new Class93_Sub41(local146);
					@Pc(416) int local416 = 0;
					local254 = 0;
					local244.anInt3070 = local113 * -1445626955;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local19; local316++) {
							local261 += local244.method22419();
							if (local25 == null) {
								local318 = local316;
							} else {
								local318 = local25[local316];
							}
							if (arg1 == local318) {
								local416 += local261;
								local254 = local318;
							}
						}
					}
					if (local416 == 0) {
						return true;
					}
					@Pc(471) byte[] local471 = new byte[local416];
					local416 = 0;
					local244.anInt3070 = local113 * -1445626955;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(489) int local489 = 0; local489 < local19; local489++) {
							local318 += local244.method22419();
							@Pc(503) int local503;
							if (local25 == null) {
								local503 = local489;
							} else {
								local503 = local25[local489];
							}
							if (arg1 == local503) {
								System.arraycopy(local146, local261, local471, local416, local318);
								local416 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local471;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * 4 * local19;
					local244 = new Class93_Sub41(local146);
					@Pc(247) int[] local247 = new int[local19];
					local244.anInt3070 = local113 * -1445626955;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local19; local261++) {
							local259 += local244.method22419();
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local19][];
					for (local259 = 0; local259 < local19; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3070 = local113 * -1445626955;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local316 += local244.method22419();
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local19; local261++) {
						if (local25 == null) {
							local316 = local261;
						} else {
							local316 = local25[local261];
						}
						if (this.anInt5174 * -2037379935 == 0) {
							local46[local316] = Class113.method7411(local284[local261], false);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local25 == null) {
					local113 = 0;
				} else {
					local113 = local25[0];
				}
				if (this.anInt5174 * -2037379935 == 0) {
					local46[local113] = Class113.method7411(local146, false);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "bw", descriptor = "(II[I)Z", line = 229)
	synchronized boolean method30121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method30047(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(19) int local19 = this.aClass486_2.anIntArray459[arg0];
			@Pc(25) int[] local25 = this.aClass486_2.anIntArrayArray58[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass486_2.anIntArray461[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
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
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class331.method27386(this.anObjectArray43[arg0], false);
			} else {
				local104 = Class331.method27386(this.anObjectArray43[arg0], true);
				@Pc(109) Class93_Sub41 local109 = new Class93_Sub41(local104);
				local113 = local109.method22413();
				local117 = local109.method22419();
				@Pc(127) int local127 = (local113 == Class484.aClass484_5.method36920() ? 5 : 9) + local117;
				local109.method22442(arg2, 5, local127);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class506.method30222(local104);
			} catch (@Pc(148) RuntimeException local148) {
				throw RuntimeException_Sub2.method23530(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class154.method14146(local104, local104.length) + " " + Class154.method14146(local104, local104.length - 2) + " " + this.aClass486_2.anIntArray455[arg0] + " " + this.aClass486_2.anInt5145 * 391791439);
			}
			if (this.aBoolean784) {
				this.anObjectArray43[arg0] = null;
			}
			if (local19 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class93_Sub41 local244;
				if (this.anInt5174 * -2037379935 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local19 * 4;
					local244 = new Class93_Sub41(local146);
					@Pc(416) int local416 = 0;
					local254 = 0;
					local244.anInt3070 = local113 * -1445626955;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local19; local316++) {
							local261 += local244.method22419();
							if (local25 == null) {
								local318 = local316;
							} else {
								local318 = local25[local316];
							}
							if (arg1 == local318) {
								local416 += local261;
								local254 = local318;
							}
						}
					}
					if (local416 == 0) {
						return true;
					}
					@Pc(471) byte[] local471 = new byte[local416];
					local416 = 0;
					local244.anInt3070 = local113 * -1445626955;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(489) int local489 = 0; local489 < local19; local489++) {
							local318 += local244.method22419();
							@Pc(503) int local503;
							if (local25 == null) {
								local503 = local489;
							} else {
								local503 = local25[local489];
							}
							if (arg1 == local503) {
								System.arraycopy(local146, local261, local471, local416, local318);
								local416 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local471;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * 4 * local19;
					local244 = new Class93_Sub41(local146);
					@Pc(247) int[] local247 = new int[local19];
					local244.anInt3070 = local113 * -1445626955;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local19; local261++) {
							local259 += local244.method22419();
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local19][];
					for (local259 = 0; local259 < local19; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3070 = local113 * -1445626955;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local19; local318++) {
							local316 += local244.method22419();
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local19; local261++) {
						if (local25 == null) {
							local316 = local261;
						} else {
							local316 = local25[local261];
						}
						if (this.anInt5174 * -2037379935 == 0) {
							local46[local316] = Class113.method7411(local284[local261], false);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local25 == null) {
					local113 = 0;
				} else {
					local113 = local25[0];
				}
				if (this.anInt5174 * -2037379935 == 0) {
					local46[local113] = Class113.method7411(local146, false);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!py", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 269)
	public static int method30131(@OriginalArg(0) String arg0) {
		return Class166_Sub13.aTwitchTV1.ChatSendMessage(arg0);
	}

	@OriginalMember(owner = "client!py", name = "bv", descriptor = "(Ljava/lang/String;)I", line = 365)
	public int method30056(@OriginalArg(0) String arg0) {
		if (this.method30111()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
			return this.method30047(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!py", name = "g", descriptor = "(Ljava/lang/String;I)I", line = 365)
	public int method30067(@OriginalArg(0) String arg0) {
		if (this.method30111()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
			return this.method30047(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!py", name = "bo", descriptor = "(Ljava/lang/String;)I", line = 365)
	public int method30112(@OriginalArg(0) String arg0) {
		if (this.method30111()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
			return this.method30047(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!py", name = "bz", descriptor = "(Ljava/lang/String;)I", line = 365)
	public int method30113(@OriginalArg(0) String arg0) {
		if (this.method30111()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
			return this.method30047(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!py", name = "i", descriptor = "(IS)I", line = 373)
	public int method30068(@OriginalArg(0) int arg0) {
		if (this.method30111()) {
			@Pc(12) int local12 = this.aClass486_2.aClass348_1.method27619(arg0);
			return this.method30047(local12) ? local12 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!py", name = "j", descriptor = "(Ljava/lang/String;B)Z", line = 380)
	public boolean method30069(@OriginalArg(0) String arg0) {
		if (this.method30111()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "br", descriptor = "(Ljava/lang/String;)Z", line = 380)
	public boolean method30115(@OriginalArg(0) String arg0) {
		if (this.method30111()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "t", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 388)
	public boolean method30070(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30111()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass486_2.aClass348Array1[local20].method27619(Class295.method26602(local11));
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "bg", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 388)
	public boolean method30110(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30111()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass486_2.aClass348Array1[local20].method27619(Class295.method26602(local11));
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "ba", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 388)
	public boolean method30117(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30111()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass486_2.aClass348Array1[local20].method27619(Class295.method26602(local11));
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "bp", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 388)
	public boolean method30118(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30111()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass486_2.aClass348Array1[local20].method27619(Class295.method26602(local11));
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "bj", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 388)
	public boolean method30119(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30111()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass486_2.aClass348Array1[local20].method27619(Class295.method26602(local11));
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "ae", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B", line = 399)
	public synchronized byte[] method30071(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30111()) {
			return null;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
		if (this.method30047(local20)) {
			@Pc(38) int local38 = this.aClass486_2.aClass348Array1[local20].method27619(Class295.method26602(local11));
			return this.method30044(local20, local38);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!py", name = "cl", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B", line = 399)
	public synchronized byte[] method30085(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30111()) {
			return null;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
		if (this.method30047(local20)) {
			@Pc(38) int local38 = this.aClass486_2.aClass348Array1[local20].method27619(Class295.method26602(local11));
			return this.method30044(local20, local38);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!py", name = "bs", descriptor = "(Ljava/lang/String;Ljava/lang/String;)[B", line = 399)
	public synchronized byte[] method30120(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30111()) {
			return null;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
		if (this.method30047(local20)) {
			@Pc(38) int local38 = this.aClass486_2.aClass348Array1[local20].method27619(Class295.method26602(local11));
			return this.method30044(local20, local38);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!py", name = "cg", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 409)
	boolean method30086(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30111()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
		if (this.method30047(local20)) {
			@Pc(38) int local38 = this.aClass486_2.aClass348Array1[local20].method27619(Class295.method26602(local11));
			return this.method30053(local20, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "ag", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 409)
	boolean method30103(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30111()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
		if (this.method30047(local20)) {
			@Pc(38) int local38 = this.aClass486_2.aClass348Array1[local20].method27619(Class295.method26602(local11));
			return this.method30053(local20, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "ce", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 409)
	boolean method30114(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method30111()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
		if (this.method30047(local20)) {
			@Pc(38) int local38 = this.aClass486_2.aClass348Array1[local20].method27619(Class295.method26602(local11));
			return this.method30053(local20, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "ah", descriptor = "(Ljava/lang/String;I)Z", line = 419)
	public boolean method30073(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method30067("");
		return local4 == -1 ? this.method30103(arg0, "") : this.method30103("", arg0);
	}

	@OriginalMember(owner = "client!py", name = "cu", descriptor = "(Ljava/lang/String;)Z", line = 419)
	public boolean method30124(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method30067("");
		return local4 == -1 ? this.method30103(arg0, "") : this.method30103("", arg0);
	}

	@OriginalMember(owner = "client!py", name = "ci", descriptor = "(Ljava/lang/String;)Z", line = 419)
	public boolean method30125(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method30067("");
		return local4 == -1 ? this.method30103(arg0, "") : this.method30103("", arg0);
	}

	@OriginalMember(owner = "client!py", name = "cn", descriptor = "(Ljava/lang/String;)Z", line = 419)
	public boolean method30126(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method30067("");
		return local4 == -1 ? this.method30103(arg0, "") : this.method30103("", arg0);
	}

	@OriginalMember(owner = "client!py", name = "cv", descriptor = "(Ljava/lang/String;)Z", line = 419)
	public boolean method30127(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method30067("");
		return local4 == -1 ? this.method30103(arg0, "") : this.method30103("", arg0);
	}

	@OriginalMember(owner = "client!py", name = "al", descriptor = "(Ljava/lang/String;I)Z", line = 425)
	public boolean method30051(@OriginalArg(0) String arg0) {
		if (this.method30111()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
			return this.method30092(local17);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!py", name = "ac", descriptor = "(Ljava/lang/String;I)I", line = 432)
	public int method30045(@OriginalArg(0) String arg0) {
		if (this.method30111()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
			return this.method30057(local17);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "cp", descriptor = "(Ljava/lang/String;)I", line = 432)
	public int method30128(@OriginalArg(0) String arg0) {
		if (this.method30111()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass486_2.aClass348_1.method27619(Class295.method26602(local8));
			return this.method30057(local17);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!py", name = "a", descriptor = "(Lclient!st;III)J", line = 824)
	static long method30129(@OriginalArg(0) Interface61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) long local1 = 4194304L;
		@Pc(3) long local3 = Long.MIN_VALUE;
		@Pc(13) Class610 local13 = (Class610) client.aClass532_1.method30466().method18261(arg0.method13423());
		@Pc(34) long local34 = (long) (arg1 | arg2 << 7 | arg0.method13420() << 14 | arg0.method13404() << 20 | 0x40000000);
		if (local13.anInt5592 * 1067969079 == 0) {
			local34 |= local3;
		}
		if (local13.anInt5610 * -927091685 == 1) {
			local34 |= local1;
		}
		return local34 | (long) arg0.method13423() << 32;
	}

	@OriginalMember(owner = "client!py", name = "ai", descriptor = "(IIB)V", line = 938)
	static void method30132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class454.anInt5053 = arg0 * -2045298401;
		Class454.anInt5050 = arg1 * 1178355593;
	}

	@OriginalMember(owner = "client!py", name = "adt", descriptor = "(Lclient!yf;B)V", line = 10212)
	static final void method30133(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local13 + local23;
	}

	@OriginalMember(owner = "client!py", name = "asz", descriptor = "(Lclient!yf;I)V", line = 13137)
	static final void method30130(@OriginalArg(0) Class681 arg0) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub41_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 0 ? 0 : 1);
		Class106_Sub1.method5148();
	}
}
