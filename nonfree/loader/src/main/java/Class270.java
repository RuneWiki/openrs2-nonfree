import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!d")
public final class Class270 {

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "()V")
	public Class270() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(30) GraphicsDevice local30 = local14[local18];
				if (local30 != null && local30.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local30;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(I)[I")
	public int[] method6048() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method6049(@OriginalArg(1) Frame arg0) {
		@Pc(7) boolean local7 = false;
		try {
			@Pc(12) Field local12 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local12.setAccessible(true);
			@Pc(22) boolean local22 = (Boolean) local12.get(this.aGraphicsDevice1);
			if (local22) {
				local7 = true;
				local12.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(33) Throwable local33) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local7) {
				try {
					@Pc(62) Field local62 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local62.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(69) Throwable local69) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Z)V")
	public void method6050() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method6049(null);
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(IILjava/awt/Frame;III)V")
	public void method6051(@OriginalArg(0) int arg0, @OriginalArg(2) Frame arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg1.setUndecorated(true);
		arg1.enableInputMethods(false);
		this.method6049(arg1);
		if (arg2 == 0) {
			@Pc(38) int local38 = this.aDisplayMode1.getRefreshRate();
			@Pc(42) DisplayMode[] local42 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(44) boolean local44 = false;
			for (@Pc(46) int local46 = 0; local46 < local42.length; local46++) {
				if (local42[local46].getWidth() == arg4 && local42[local46].getHeight() == arg3 && local42[local46].getBitDepth() == arg0) {
					@Pc(73) int local73 = local42[local46].getRefreshRate();
					if (!local44 || Math.abs(local73 - local38) < Math.abs(arg2 - local38)) {
						local44 = true;
						arg2 = local73;
					}
				}
			}
			if (!local44) {
				arg2 = local38;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg4, arg3, arg0, arg2));
	}
}
