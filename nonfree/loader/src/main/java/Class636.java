import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!j")
class Class636 {

	@OriginalMember(owner = "loader!j", name = "c", descriptor = "I")
	static int anInt5624;

	@OriginalMember(owner = "loader!j", name = "b", descriptor = "I")
	static int anInt5625;

	@OriginalMember(owner = "loader!j", name = "<init>", descriptor = "(I)V", line = 5)
	Class636(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "loader!j", name = "a", descriptor = "(B[B[BLloader!j;)Lloader!j;", line = 16)
	static final Class636 method33919(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class636 arg3) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
		anInt5624++;
		@Pc(11) SecretKeySpec local11 = new SecretKeySpec(arg1, "AES");
		if (arg0 == 31) {
			((Class636_Sub1) arg3).anObject40 = Cipher.getInstance("AES/CBC/PKCS5Padding");
			((Cipher) ((Class636_Sub1) arg3).anObject40).init(2, local11, new IvParameterSpec(arg2));
			return arg3;
		} else {
			return (Class636) null;
		}
	}

	@OriginalMember(owner = "loader!j", name = "a", descriptor = "(Lloader!j;I[B)[B", line = 30)
	static final byte[] method33920(@OriginalArg(0) Class636 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IllegalBlockSizeException, BadPaddingException {
		anInt5625++;
		return arg1 == -1453 ? ((Cipher) ((Class636_Sub1) arg0).anObject40).doFinal(arg2) : (byte[]) null;
	}
}
