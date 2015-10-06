// For Capstone Engine. AUTO-GENERATED FILE, DO NOT EDIT
package capstone;

public class M68k_const {
	public static final int M68K_OPERAND_COUNT = 4;

	// M68K registers and special registers

	public static final int M68K_REG_INVALID = 0;
	public static final int M68K_REG_D0 = 1;
	public static final int M68K_REG_D1 = 2;
	public static final int M68K_REG_D2 = 3;
	public static final int M68K_REG_D3 = 4;
	public static final int M68K_REG_D4 = 5;
	public static final int M68K_REG_D5 = 6;
	public static final int M68K_REG_D6 = 7;
	public static final int M68K_REG_D7 = 8;
	public static final int M68K_REG_A0 = 9;
	public static final int M68K_REG_A1 = 10;
	public static final int M68K_REG_A2 = 11;
	public static final int M68K_REG_A3 = 12;
	public static final int M68K_REG_A4 = 13;
	public static final int M68K_REG_A5 = 14;
	public static final int M68K_REG_A6 = 15;
	public static final int M68K_REG_A7 = 16;
	public static final int M68K_REG_FP0 = 17;
	public static final int M68K_REG_FP1 = 18;
	public static final int M68K_REG_FP2 = 19;
	public static final int M68K_REG_FP3 = 20;
	public static final int M68K_REG_FP4 = 21;
	public static final int M68K_REG_FP5 = 22;
	public static final int M68K_REG_FP6 = 23;
	public static final int M68K_REG_FP7 = 24;
	public static final int M68K_REG_PC = 25;
	public static final int M68K_REG_SR = 26;
	public static final int M68K_REG_CCR = 27;
	public static final int M68K_REG_SFC = 28;
	public static final int M68K_REG_DFC = 29;
	public static final int M68K_REG_USP = 30;
	public static final int M68K_REG_VBR = 31;
	public static final int M68K_REG_CACR = 32;
	public static final int M68K_REG_CAAR = 33;
	public static final int M68K_REG_MSP = 34;
	public static final int M68K_REG_ISP = 35;
	public static final int M68K_REG_TC = 36;
	public static final int M68K_REG_ITT0 = 37;
	public static final int M68K_REG_ITT1 = 38;
	public static final int M68K_REG_DTT0 = 39;
	public static final int M68K_REG_DTT1 = 40;
	public static final int M68K_REG_MMUSR = 41;
	public static final int M68K_REG_URP = 42;
	public static final int M68K_REG_SRP = 43;
	public static final int M68K_REG_FPCR = 44;
	public static final int M68K_REG_FPSR = 45;
	public static final int M68K_REG_FPIAR = 46;
	public static final int M68K_REG_ENDING = 47;

	// M68K Addressing Modes

	public static final int M68K_AM_NONE = 0;
	public static final int M68K_AM_REG_DIRECT_DATA = 1;
	public static final int M68K_AM_REG_DIRECT_ADDR = 2;
	public static final int M68K_AM_REGI_ADDR = 3;
	public static final int M68K_AM_REGI_ADDR_POST_INC = 4;
	public static final int M68K_AM_REGI_ADDR_PRE_DEC = 5;
	public static final int M68K_AM_REGI_ADDR_DISP = 6;
	public static final int M68K_AM_AREGI_INDEX_8_BIT_DISP = 7;
	public static final int M68K_AM_AREGI_INDEX_BASE_DISP = 8;
	public static final int M68K_AM_MEMI_POST_INDEX = 9;
	public static final int M68K_AM_MEMI_PRE_INDEX = 10;
	public static final int M68K_AM_PCI_DISP = 11;
	public static final int M68K_AM_PCI_INDEX_8_BIT_DISP = 12;
	public static final int M68K_AM_PCI_INDEX_BASE_DISP = 13;
	public static final int M68K_AM_PC_MEMI_POST_INDEX = 14;
	public static final int M68K_AM_PC_MEMI_PRE_INDEX = 15;
	public static final int M68K_AM_ABSOLUTE_DATA_SHORT = 16;
	public static final int M68K_AM_ABSOLUTE_DATA_LONG = 17;
	public static final int M68K_AM_IMMIDIATE = 18;

	// Operand type for instruction's operands

	public static final int M68K_OP_INVALID = 0;
	public static final int M68K_OP_REG = 1;
	public static final int M68K_OP_IMM = 2;
	public static final int M68K_OP_MEM = 3;
	public static final int M68K_OP_FP = 4;
	public static final int M68K_OP_REG_BITS = 5;
	public static final int M68K_OP_REG_PAIR = 6;

	public static final int M68K_CPU_SIZE_NONE = 0;
	public static final int M68K_CPU_SIZE_BYTE = 1;
	public static final int M68K_CPU_SIZE_WORD = 2;
	public static final int M68K_CPU_SIZE_LONG = 4;

	public static final int M68K_FPU_SIZE_NONE = 0;
	public static final int M68K_FPU_SIZE_SINGLE = 4;
	public static final int M68K_FPU_SIZE_DOUBLE = 8;
	public static final int M68K_FPU_SIZE_EXTENDED = 12;

	public static final int M68K_SIZE_TYPE_INVALID = 0;
	public static final int M68K_SIZE_TYPE_CPU = 1;
	public static final int M68K_SIZE_TYPE_FPU = 2;

	// M68K instruction

	public static final int M68K_INS_INVALID = 0;
	public static final int M68K_INS_ABCD = 1;
	public static final int M68K_INS_ADD = 2;
	public static final int M68K_INS_ADDA = 3;
	public static final int M68K_INS_ADDI = 4;
	public static final int M68K_INS_ADDQ = 5;
	public static final int M68K_INS_ADDX = 6;
	public static final int M68K_INS_AND = 7;
	public static final int M68K_INS_ANDI = 8;
	public static final int M68K_INS_ASL = 9;
	public static final int M68K_INS_ASR = 10;
	public static final int M68K_INS_BHS = 11;
	public static final int M68K_INS_BLO = 12;
	public static final int M68K_INS_BHI = 13;
	public static final int M68K_INS_BLS = 14;
	public static final int M68K_INS_BCC = 15;
	public static final int M68K_INS_BCS = 16;
	public static final int M68K_INS_BNE = 17;
	public static final int M68K_INS_BEQ = 18;
	public static final int M68K_INS_BVC = 19;
	public static final int M68K_INS_BVS = 20;
	public static final int M68K_INS_BPL = 21;
	public static final int M68K_INS_BMI = 22;
	public static final int M68K_INS_BGE = 23;
	public static final int M68K_INS_BLT = 24;
	public static final int M68K_INS_BGT = 25;
	public static final int M68K_INS_BLE = 26;
	public static final int M68K_INS_BRA = 27;
	public static final int M68K_INS_BSR = 28;
	public static final int M68K_INS_BCHG = 29;
	public static final int M68K_INS_BCLR = 30;
	public static final int M68K_INS_BSET = 31;
	public static final int M68K_INS_BTST = 32;
	public static final int M68K_INS_BFCHG = 33;
	public static final int M68K_INS_BFCLR = 34;
	public static final int M68K_INS_BFEXTS = 35;
	public static final int M68K_INS_BFEXTU = 36;
	public static final int M68K_INS_BFFFO = 37;
	public static final int M68K_INS_BFINS = 38;
	public static final int M68K_INS_BFSET = 39;
	public static final int M68K_INS_BFTST = 40;
	public static final int M68K_INS_BKPT = 41;
	public static final int M68K_INS_CALLM = 42;
	public static final int M68K_INS_CAS = 43;
	public static final int M68K_INS_CAS2 = 44;
	public static final int M68K_INS_CHK = 45;
	public static final int M68K_INS_CHK2 = 46;
	public static final int M68K_INS_CLR = 47;
	public static final int M68K_INS_CMP = 48;
	public static final int M68K_INS_CMPA = 49;
	public static final int M68K_INS_CMPI = 50;
	public static final int M68K_INS_CMPM = 51;
	public static final int M68K_INS_CMP2 = 52;
	public static final int M68K_INS_CINVL = 53;
	public static final int M68K_INS_CINVP = 54;
	public static final int M68K_INS_CINVA = 55;
	public static final int M68K_INS_CPUSHL = 56;
	public static final int M68K_INS_CPUSHP = 57;
	public static final int M68K_INS_CPUSHA = 58;
	public static final int M68K_INS_DBT = 59;
	public static final int M68K_INS_DBF = 60;
	public static final int M68K_INS_DBHI = 61;
	public static final int M68K_INS_DBLS = 62;
	public static final int M68K_INS_DBCC = 63;
	public static final int M68K_INS_DBCS = 64;
	public static final int M68K_INS_DBNE = 65;
	public static final int M68K_INS_DBEQ = 66;
	public static final int M68K_INS_DBVC = 67;
	public static final int M68K_INS_DBVS = 68;
	public static final int M68K_INS_DBPL = 69;
	public static final int M68K_INS_DBMI = 70;
	public static final int M68K_INS_DBGE = 71;
	public static final int M68K_INS_DBLT = 72;
	public static final int M68K_INS_DBGT = 73;
	public static final int M68K_INS_DBLE = 74;
	public static final int M68K_INS_DBRA = 75;
	public static final int M68K_INS_DIVS = 76;
	public static final int M68K_INS_DIVSL = 77;
	public static final int M68K_INS_DIVU = 78;
	public static final int M68K_INS_DIVUL = 79;
	public static final int M68K_INS_EOR = 80;
	public static final int M68K_INS_EORI = 81;
	public static final int M68K_INS_EXG = 82;
	public static final int M68K_INS_EXT = 83;
	public static final int M68K_INS_EXTB = 84;
	public static final int M68K_INS_FABS = 85;
	public static final int M68K_INS_FSABS = 86;
	public static final int M68K_INS_FDABS = 87;
	public static final int M68K_INS_FACOS = 88;
	public static final int M68K_INS_FADD = 89;
	public static final int M68K_INS_FSADD = 90;
	public static final int M68K_INS_FDADD = 91;
	public static final int M68K_INS_FASIN = 92;
	public static final int M68K_INS_FATAN = 93;
	public static final int M68K_INS_FATANH = 94;
	public static final int M68K_INS_FBF = 95;
	public static final int M68K_INS_FBEQ = 96;
	public static final int M68K_INS_FBOGT = 97;
	public static final int M68K_INS_FBOGE = 98;
	public static final int M68K_INS_FBOLT = 99;
	public static final int M68K_INS_FBOLE = 100;
	public static final int M68K_INS_FBOGL = 101;
	public static final int M68K_INS_FBOR = 102;
	public static final int M68K_INS_FBUN = 103;
	public static final int M68K_INS_FBUEQ = 104;
	public static final int M68K_INS_FBUGT = 105;
	public static final int M68K_INS_FBUGE = 106;
	public static final int M68K_INS_FBULT = 107;
	public static final int M68K_INS_FBULE = 108;
	public static final int M68K_INS_FBNE = 109;
	public static final int M68K_INS_FBT = 110;
	public static final int M68K_INS_FBSF = 111;
	public static final int M68K_INS_FBSEQ = 112;
	public static final int M68K_INS_FBGT = 113;
	public static final int M68K_INS_FBGE = 114;
	public static final int M68K_INS_FBLT = 115;
	public static final int M68K_INS_FBLE = 116;
	public static final int M68K_INS_FBGL = 117;
	public static final int M68K_INS_FBGLE = 118;
	public static final int M68K_INS_FBNGLE = 119;
	public static final int M68K_INS_FBNGL = 120;
	public static final int M68K_INS_FBNLE = 121;
	public static final int M68K_INS_FBNLT = 122;
	public static final int M68K_INS_FBNGE = 123;
	public static final int M68K_INS_FBNGT = 124;
	public static final int M68K_INS_FBSNE = 125;
	public static final int M68K_INS_FBST = 126;
	public static final int M68K_INS_FCMP = 127;
	public static final int M68K_INS_FCOS = 128;
	public static final int M68K_INS_FCOSH = 129;
	public static final int M68K_INS_FDBF = 130;
	public static final int M68K_INS_FDBEQ = 131;
	public static final int M68K_INS_FDBOGT = 132;
	public static final int M68K_INS_FDBOGE = 133;
	public static final int M68K_INS_FDBOLT = 134;
	public static final int M68K_INS_FDBOLE = 135;
	public static final int M68K_INS_FDBOGL = 136;
	public static final int M68K_INS_FDBOR = 137;
	public static final int M68K_INS_FDBUN = 138;
	public static final int M68K_INS_FDBUEQ = 139;
	public static final int M68K_INS_FDBUGT = 140;
	public static final int M68K_INS_FDBUGE = 141;
	public static final int M68K_INS_FDBULT = 142;
	public static final int M68K_INS_FDBULE = 143;
	public static final int M68K_INS_FDBNE = 144;
	public static final int M68K_INS_FDBT = 145;
	public static final int M68K_INS_FDBSF = 146;
	public static final int M68K_INS_FDBSEQ = 147;
	public static final int M68K_INS_FDBGT = 148;
	public static final int M68K_INS_FDBGE = 149;
	public static final int M68K_INS_FDBLT = 150;
	public static final int M68K_INS_FDBLE = 151;
	public static final int M68K_INS_FDBGL = 152;
	public static final int M68K_INS_FDBGLE = 153;
	public static final int M68K_INS_FDBNGLE = 154;
	public static final int M68K_INS_FDBNGL = 155;
	public static final int M68K_INS_FDBNLE = 156;
	public static final int M68K_INS_FDBNLT = 157;
	public static final int M68K_INS_FDBNGE = 158;
	public static final int M68K_INS_FDBNGT = 159;
	public static final int M68K_INS_FDBSNE = 160;
	public static final int M68K_INS_FDBST = 161;
	public static final int M68K_INS_FDIV = 162;
	public static final int M68K_INS_FSDIV = 163;
	public static final int M68K_INS_FDDIV = 164;
	public static final int M68K_INS_FETOX = 165;
	public static final int M68K_INS_FETOXM1 = 166;
	public static final int M68K_INS_FGETEXP = 167;
	public static final int M68K_INS_FGETMAN = 168;
	public static final int M68K_INS_FINT = 169;
	public static final int M68K_INS_FINTRZ = 170;
	public static final int M68K_INS_FLOG10 = 171;
	public static final int M68K_INS_FLOG2 = 172;
	public static final int M68K_INS_FLOGN = 173;
	public static final int M68K_INS_FLOGNP1 = 174;
	public static final int M68K_INS_FMOD = 175;
	public static final int M68K_INS_FMOVE = 176;
	public static final int M68K_INS_FSMOVE = 177;
	public static final int M68K_INS_FDMOVE = 178;
	public static final int M68K_INS_FMOVECR = 179;
	public static final int M68K_INS_FMOVEM = 180;
	public static final int M68K_INS_FMUL = 181;
	public static final int M68K_INS_FSMUL = 182;
	public static final int M68K_INS_FDMUL = 183;
	public static final int M68K_INS_FNEG = 184;
	public static final int M68K_INS_FSNEG = 185;
	public static final int M68K_INS_FDNEG = 186;
	public static final int M68K_INS_FNOP = 187;
	public static final int M68K_INS_FREM = 188;
	public static final int M68K_INS_FRESTORE = 189;
	public static final int M68K_INS_FSAVE = 190;
	public static final int M68K_INS_FSCALE = 191;
	public static final int M68K_INS_FSGLDIV = 192;
	public static final int M68K_INS_FSGLMUL = 193;
	public static final int M68K_INS_FSIN = 194;
	public static final int M68K_INS_FSINCOS = 195;
	public static final int M68K_INS_FSINH = 196;
	public static final int M68K_INS_FSQRT = 197;
	public static final int M68K_INS_FSSQRT = 198;
	public static final int M68K_INS_FDSQRT = 199;
	public static final int M68K_INS_FSF = 200;
	public static final int M68K_INS_FSBEQ = 201;
	public static final int M68K_INS_FSOGT = 202;
	public static final int M68K_INS_FSOGE = 203;
	public static final int M68K_INS_FSOLT = 204;
	public static final int M68K_INS_FSOLE = 205;
	public static final int M68K_INS_FSOGL = 206;
	public static final int M68K_INS_FSOR = 207;
	public static final int M68K_INS_FSUN = 208;
	public static final int M68K_INS_FSUEQ = 209;
	public static final int M68K_INS_FSUGT = 210;
	public static final int M68K_INS_FSUGE = 211;
	public static final int M68K_INS_FSULT = 212;
	public static final int M68K_INS_FSULE = 213;
	public static final int M68K_INS_FSNE = 214;
	public static final int M68K_INS_FST = 215;
	public static final int M68K_INS_FSSF = 216;
	public static final int M68K_INS_FSSEQ = 217;
	public static final int M68K_INS_FSGT = 218;
	public static final int M68K_INS_FSGE = 219;
	public static final int M68K_INS_FSLT = 220;
	public static final int M68K_INS_FSLE = 221;
	public static final int M68K_INS_FSGL = 222;
	public static final int M68K_INS_FSGLE = 223;
	public static final int M68K_INS_FSNGLE = 224;
	public static final int M68K_INS_FSNGL = 225;
	public static final int M68K_INS_FSNLE = 226;
	public static final int M68K_INS_FSNLT = 227;
	public static final int M68K_INS_FSNGE = 228;
	public static final int M68K_INS_FSNGT = 229;
	public static final int M68K_INS_FSSNE = 230;
	public static final int M68K_INS_FSST = 231;
	public static final int M68K_INS_FSUB = 232;
	public static final int M68K_INS_FSSUB = 233;
	public static final int M68K_INS_FDSUB = 234;
	public static final int M68K_INS_FTAN = 235;
	public static final int M68K_INS_FTANH = 236;
	public static final int M68K_INS_FTENTOX = 237;
	public static final int M68K_INS_FTRAPF = 238;
	public static final int M68K_INS_FTRAPEQ = 239;
	public static final int M68K_INS_FTRAPOGT = 240;
	public static final int M68K_INS_FTRAPOGE = 241;
	public static final int M68K_INS_FTRAPOLT = 242;
	public static final int M68K_INS_FTRAPOLE = 243;
	public static final int M68K_INS_FTRAPOGL = 244;
	public static final int M68K_INS_FTRAPOR = 245;
	public static final int M68K_INS_FTRAPUN = 246;
	public static final int M68K_INS_FTRAPUEQ = 247;
	public static final int M68K_INS_FTRAPUGT = 248;
	public static final int M68K_INS_FTRAPUGE = 249;
	public static final int M68K_INS_FTRAPULT = 250;
	public static final int M68K_INS_FTRAPULE = 251;
	public static final int M68K_INS_FTRAPNE = 252;
	public static final int M68K_INS_FTRAPT = 253;
	public static final int M68K_INS_FTRAPSF = 254;
	public static final int M68K_INS_FTRAPSEQ = 255;
	public static final int M68K_INS_FTRAPGT = 256;
	public static final int M68K_INS_FTRAPGE = 257;
	public static final int M68K_INS_FTRAPLT = 258;
	public static final int M68K_INS_FTRAPLE = 259;
	public static final int M68K_INS_FTRAPGL = 260;
	public static final int M68K_INS_FTRAPGLE = 261;
	public static final int M68K_INS_FTRAPNGLE = 262;
	public static final int M68K_INS_FTRAPNGL = 263;
	public static final int M68K_INS_FTRAPNLE = 264;
	public static final int M68K_INS_FTRAPNLT = 265;
	public static final int M68K_INS_FTRAPNGE = 266;
	public static final int M68K_INS_FTRAPNGT = 267;
	public static final int M68K_INS_FTRAPSNE = 268;
	public static final int M68K_INS_FTRAPST = 269;
	public static final int M68K_INS_FTST = 270;
	public static final int M68K_INS_FTWOTOX = 271;
	public static final int M68K_INS_HALT = 272;
	public static final int M68K_INS_ILLEGAL = 273;
	public static final int M68K_INS_JMP = 274;
	public static final int M68K_INS_JSR = 275;
	public static final int M68K_INS_LEA = 276;
	public static final int M68K_INS_LINK = 277;
	public static final int M68K_INS_LPSTOP = 278;
	public static final int M68K_INS_LSL = 279;
	public static final int M68K_INS_LSR = 280;
	public static final int M68K_INS_MOVE = 281;
	public static final int M68K_INS_MOVEA = 282;
	public static final int M68K_INS_MOVEC = 283;
	public static final int M68K_INS_MOVEM = 284;
	public static final int M68K_INS_MOVEP = 285;
	public static final int M68K_INS_MOVEQ = 286;
	public static final int M68K_INS_MOVES = 287;
	public static final int M68K_INS_MOVE16 = 288;
	public static final int M68K_INS_MULS = 289;
	public static final int M68K_INS_MULU = 290;
	public static final int M68K_INS_NBCD = 291;
	public static final int M68K_INS_NEG = 292;
	public static final int M68K_INS_NEGX = 293;
	public static final int M68K_INS_NOP = 294;
	public static final int M68K_INS_NOT = 295;
	public static final int M68K_INS_OR = 296;
	public static final int M68K_INS_ORI = 297;
	public static final int M68K_INS_PACK = 298;
	public static final int M68K_INS_PEA = 299;
	public static final int M68K_INS_PFLUSH = 300;
	public static final int M68K_INS_PFLUSHA = 301;
	public static final int M68K_INS_PFLUSHAN = 302;
	public static final int M68K_INS_PFLUSHN = 303;
	public static final int M68K_INS_PLOADR = 304;
	public static final int M68K_INS_PLOADW = 305;
	public static final int M68K_INS_PLPAR = 306;
	public static final int M68K_INS_PLPAW = 307;
	public static final int M68K_INS_PMOVE = 308;
	public static final int M68K_INS_PMOVEFD = 309;
	public static final int M68K_INS_PTESTR = 310;
	public static final int M68K_INS_PTESTW = 311;
	public static final int M68K_INS_PULSE = 312;
	public static final int M68K_INS_REMS = 313;
	public static final int M68K_INS_REMU = 314;
	public static final int M68K_INS_RESET = 315;
	public static final int M68K_INS_ROL = 316;
	public static final int M68K_INS_ROR = 317;
	public static final int M68K_INS_ROXL = 318;
	public static final int M68K_INS_ROXR = 319;
	public static final int M68K_INS_RTD = 320;
	public static final int M68K_INS_RTE = 321;
	public static final int M68K_INS_RTM = 322;
	public static final int M68K_INS_RTR = 323;
	public static final int M68K_INS_RTS = 324;
	public static final int M68K_INS_SBCD = 325;
	public static final int M68K_INS_ST = 326;
	public static final int M68K_INS_SF = 327;
	public static final int M68K_INS_SHI = 328;
	public static final int M68K_INS_SLS = 329;
	public static final int M68K_INS_SCC = 330;
	public static final int M68K_INS_SHS = 331;
	public static final int M68K_INS_SCS = 332;
	public static final int M68K_INS_SLO = 333;
	public static final int M68K_INS_SNE = 334;
	public static final int M68K_INS_SEQ = 335;
	public static final int M68K_INS_SVC = 336;
	public static final int M68K_INS_SVS = 337;
	public static final int M68K_INS_SPL = 338;
	public static final int M68K_INS_SMI = 339;
	public static final int M68K_INS_SGE = 340;
	public static final int M68K_INS_SLT = 341;
	public static final int M68K_INS_SGT = 342;
	public static final int M68K_INS_SLE = 343;
	public static final int M68K_INS_STOP = 344;
	public static final int M68K_INS_SUB = 345;
	public static final int M68K_INS_SUBA = 346;
	public static final int M68K_INS_SUBI = 347;
	public static final int M68K_INS_SUBQ = 348;
	public static final int M68K_INS_SUBX = 349;
	public static final int M68K_INS_SWAP = 350;
	public static final int M68K_INS_TAS = 351;
	public static final int M68K_INS_TRAP = 352;
	public static final int M68K_INS_TRAPV = 353;
	public static final int M68K_INS_TRAPT = 354;
	public static final int M68K_INS_TRAPF = 355;
	public static final int M68K_INS_TRAPHI = 356;
	public static final int M68K_INS_TRAPLS = 357;
	public static final int M68K_INS_TRAPCC = 358;
	public static final int M68K_INS_TRAPHS = 359;
	public static final int M68K_INS_TRAPCS = 360;
	public static final int M68K_INS_TRAPLO = 361;
	public static final int M68K_INS_TRAPNE = 362;
	public static final int M68K_INS_TRAPEQ = 363;
	public static final int M68K_INS_TRAPVC = 364;
	public static final int M68K_INS_TRAPVS = 365;
	public static final int M68K_INS_TRAPPL = 366;
	public static final int M68K_INS_TRAPMI = 367;
	public static final int M68K_INS_TRAPGE = 368;
	public static final int M68K_INS_TRAPLT = 369;
	public static final int M68K_INS_TRAPGT = 370;
	public static final int M68K_INS_TRAPLE = 371;
	public static final int M68K_INS_TST = 372;
	public static final int M68K_INS_UNLK = 373;
	public static final int M68K_INS_UNPK = 374;
}