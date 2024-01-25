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
public final class Class255 {

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "()V")
	public Class255() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(27) GraphicsDevice local27 = local15[local19];
				if (local27 != null && local27.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local27;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V")
	public void method5595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Frame arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg4.setUndecorated(true);
		arg4.enableInputMethods(false);
		this.method5596(arg4);
		if (arg2 == 0) {
			@Pc(31) int local31 = this.aDisplayMode1.getRefreshRate();
			@Pc(35) DisplayMode[] local35 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(37) boolean local37 = false;
			for (@Pc(39) int local39 = 0; local39 < local35.length; local39++) {
				if (arg0 == local35[local39].getWidth() && arg3 == local35[local39].getHeight() && local35[local39].getBitDepth() == arg1) {
					@Pc(67) int local67 = local35[local39].getRefreshRate();
					if (!local37 || Math.abs(local67 - local31) < Math.abs(arg2 - local31)) {
						arg2 = local67;
						local37 = true;
					}
				}
			}
			if (!local37) {
				arg2 = local31;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg0, arg3, arg1, arg2));
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	private void method5596(@OriginalArg(0) Frame arg0) {
		@Pc(9) boolean local9 = false;
		try {
			@Pc(14) Field local14 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local14.setAccessible(true);
			@Pc(24) boolean local24 = (Boolean) local14.get(this.aGraphicsDevice1);
			if (local24) {
				local14.set(this.aGraphicsDevice1, Boolean.FALSE);
				local9 = true;
			}
		} catch (@Pc(36) Throwable local36) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local9) {
				try {
					@Pc(63) Field local63 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local63.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(70) Throwable local70) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(B)[I")
	public int[] method5597() {
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

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "(B)V")
	public void method5598() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5596(null);
	}
}
